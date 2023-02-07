package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public void register(Member member) {
        memberRepository.save(member);
    }

    public void // 로그인 서비스 없애고 resource에 login 없애면 원래 파일

}
