package com.example.spring_music_payment_1011.app.member.repository;

import com.example.spring_music_payment_1011.app.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}