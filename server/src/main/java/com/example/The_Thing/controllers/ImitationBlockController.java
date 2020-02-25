package com.example.The_Thing.controllers;

import com.example.The_Thing.models.ImitationBlocked;
import com.example.The_Thing.models.Player;
import com.example.The_Thing.repositories.ImitationBlockedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImitationBlockController {

        @Autowired
        ImitationBlockedRepository imitationBlockRepository;

        @GetMapping(value = "/players")
            ResponseEntity<List<ImitationBlocked>> findAllImitationBlocks() {
        return new ResponseEntity<>(imitationBlockRepository.findAll(), HttpStatus.OK);
        }

        @PatchMapping(value = "/imitation-block/{id}")
        ResponseEntity<ImitationBlocked> updateImitationBlock(@RequestBody ImitationBlocked imitationBlock, @PathVariable Long id) {
            imitationBlockRepository.save(imitationBlock);
            return new ResponseEntity<ImitationBlocked>(imitationBlock, HttpStatus.CREATED);
        }

        @DeleteMapping(value = "/imitation-blocks")
        void deleteAllImitationBlocks() {
            imitationBlockRepository.deleteAll();
        }

}
