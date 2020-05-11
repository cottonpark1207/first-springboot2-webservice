package com.soma.world.springboot.web.dto;

import com.soma.world.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Entity 클래스와 거의 유사한 형태이지만, Entity 클래스를 Request/Response 클래스로 사용해서는 안 됨.
 * Entity 클래스는 데이터베이스와 맞닿은 핵심 클래스여서 변경이 있으면, 큰 변경 됨. 수정이 적어야 함.
 */
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
