package com.roomates.book.service;

import com.roomates.book.entity.Obligation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Service
public class ObligationService {

    @Autowired
    private EntityManager em;

    public Obligation getObligationById(Integer obligationId) {
        String criteria = "SELECT o FROM Obligation o where id = :id";
        Query q = em.createQuery(criteria)
                .setParameter("id", obligationId);
        return (Obligation) q.getSingleResult();
    }
}
