package valmiki.service;

import valmiki.model.Member;

import java.util.List;

public interface MemberService {
    Member register(Member member);
    Member update(Long id, Member member);
    void delete(Long id);
    Member getById(Long id);
    List<Member> getAll();
}
