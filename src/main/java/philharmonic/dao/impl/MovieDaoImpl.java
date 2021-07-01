package philharmonic.dao.impl;

import philharmonic.dao.AbstractDao;
import philharmonic.dao.MovieDao;
import philharmonic.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
