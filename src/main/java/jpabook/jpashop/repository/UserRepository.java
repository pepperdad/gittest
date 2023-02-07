package jpabook.jpashop.repository;

import java.util.Optional;
import javax.persistence.EntityManager;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public void save(User user) {
        em.persist(user);
    }

    public Optional<User> findUser(String loginId, String password) {
        return em.createQuery(
            "select u from User u where u.loginId = :loginId",
            User.class).setParameter("loginId", loginId).getResultList().stream().findAny();
        // stream().findAny() 왜써야하나

    }
}
