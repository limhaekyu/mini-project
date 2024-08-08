package com.portpolio.mini_project.comment.entity;

import com.portpolio.mini_project.global.entity.BaseEntity;
import com.portpolio.mini_project.member.entity.Member;
import com.portpolio.mini_project.post.entity.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment")
public class Comment extends BaseEntity {
    @Column(nullable = false)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
