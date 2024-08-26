package com.study.todolist.dto.response.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
    public class RespTodoListDto {
        private int todoId;
        private int userId;
        private String title;
        private String content;
        private int important;
        private int busy;
        private int status;
        private String todoDateTime;
}
