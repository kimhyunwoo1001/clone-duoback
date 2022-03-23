package com.example.project.controller.api;

import com.example.project.model.DTO.NoticeDTO;
import com.example.project.service.GoodsApiLogicService;
import com.example.project.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Slf4j
@RequestMapping("/www.duoback.co.kr")
@Controller
public class BoardController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/indexffe2")
    public String indexffe2(Model model) {
        model.addAttribute("noticeList" , noticeService.getBoardList() );
        return "pages/www.duoback.co.kr/board/indexffe2";
    }

    @GetMapping("/index4fcb")
    public String index4fcb() {
        return "pages/www.duoback.co.kr/board/index4fcb";
    }

    @GetMapping("/indexf6aa")
    public String indexf6aa() {
        return "pages/www.duoback.co.kr/board/indexf6aa";
    }

    @GetMapping("/index0f52")
    public String index0f52() {
        return "pages/www.duoback.co.kr/board/index0f52";}

    @GetMapping("/viewe3f8/{ntIdx}")
    public String viewe3f8(Model model , @PathVariable(name = "ntIdx") Long ntIdx) {
        NoticeDTO noticeDTOList = noticeService.read(ntIdx);
        model.addAttribute("noticeList" , noticeDTOList);
        return "pages/www.duoback.co.kr/board/viewe3f8";
    }

    @GetMapping("/writee50a")
    public String writee50a() {
        return "pages/www.duoback.co.kr/board/writee50a";
    }

}