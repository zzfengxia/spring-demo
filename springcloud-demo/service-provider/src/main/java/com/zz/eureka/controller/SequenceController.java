package com.zz.eureka.controller;

import com.zz.eureka.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Francis.zz on 2018/3/1.
 */
@Controller
public class SequenceController {
    @Autowired
    private SequenceService sequenceService;

    @GetMapping("test")
    public void test(HttpServletResponse response) throws IOException {
        int val = sequenceService.genNextVal();
        Writer writer = response.getWriter();
        writer.write(val + "");
        writer.flush();
        writer.close();
    }
}
