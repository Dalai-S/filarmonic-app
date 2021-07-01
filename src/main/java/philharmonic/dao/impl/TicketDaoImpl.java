package philharmonic.dao.impl;

import philharmonic.dao.AbstractDao;
import philharmonic.model.Ticket;
import philharmonic.dao.TicketDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
