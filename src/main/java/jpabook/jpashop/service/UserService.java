package jpabook.jpashop.service;

import jpabook.jpashop.domain.User;
import jpabook.jpashop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void register(User user) {
        userRepository.save(user);
    }

    // 로그인 서비스 없애고 resource에 login 없애면 원래 파일

    public void login(String loginId, String pw) {
        userRepository.findUser(loginId, pw);
    }

}
