package com.portpolio.mini_project.post.entity;

import com.portpolio.mini_project.comment.entity.Comment;
import com.portpolio.mini_project.global.entity.BaseEntity;
import com.portpolio.mini_project.member.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "post")
public class Post extends BaseEntity {
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    private Integer heartCnt;

    @OneToMany(mappedBy = "post")
    private final List<Comment> comments = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private Member member;
}
