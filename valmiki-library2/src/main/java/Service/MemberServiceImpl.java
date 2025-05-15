package valmiki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valmiki.model.Member;
import valmiki.repository.MemberRepository;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member register(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member update(Long id, Member updated) {
        Member existing = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
        existing.setName(updated.getName());
        existing.setAge(updated.getAge());
        existing.setEmail(updated.getEmail());
        existing.setMembershipType(updated.getMembershipType());
        return memberRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!memberRepository.existsById(id)) {
            throw new RuntimeException("Member not found");
        }
        memberRepository.deleteById(id);
    }

    @Override
    public Member getById(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }
}
