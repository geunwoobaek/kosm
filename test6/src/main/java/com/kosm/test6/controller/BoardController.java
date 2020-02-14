/*package com.kosm.test6.controller;

import com.kosm.test6.payload.BoardResponse;
import com.kosm.test6.payload.BoardSaveRequest;
import com.kosm.test6.service.BoardService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BoardController {
    
    private final BoardService boardService;
    @PostMapping("/api/board")
    public Long save(@RequestBody BoardSaveRequest request) {
        return boardService.save(request);
    }
    
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}   ")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
    

    @GetMapping("/api/board/{id}")
    public BoardResponse findById(@PathVariable Long id) {
        return boardService.findById(id);
    }


}*/