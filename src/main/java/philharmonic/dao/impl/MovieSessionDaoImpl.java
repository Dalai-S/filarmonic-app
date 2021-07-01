package philharmonic.dao.impl;

import philharmonic.dao.AbstractDao;
import philharmonic.dao.MovieSessionDao;
import philharmonic.exception.DataProcessingException;
import philharmonic.model.MovieSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class MovieSessionDaoImpl extends AbstractDao<MovieSession> implements MovieSessionDao {
    public MovieSessionDaoImpl(SessionFactory factory) {
        super(factory, MovieSession.class);
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        try (Session session = factory.openSession()) {
            Query<MovieSession> getAvailableSessions = session.createQuery(
                    "FROM MovieSession WHERE id = :id "
                            + "AND DATE_FORMAT(showTime, '%Y-%m-%d') = :date", MovieSession.class);
            getAvailableSessions.setParameter("id", movieId);
            getAvailableSessions.setParameter("date", date.toString());
            return getAvailableSessions.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Session for movie with id "
                    + movieId + " and show date " + date + " not found", e);
        }
    }
}
