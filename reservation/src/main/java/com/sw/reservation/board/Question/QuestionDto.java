package com.sw.reservation.board.Question;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
public class QuestionDto {

    private String title;
    private String content;
    private String writer;
    private String date;

    @Builder
    public QuestionDto(String title, String content, String writer, String date){
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

}
