package com.example.jaz22043nbp.Controller;

import com.example.jaz22043nbp.Service.ZlotoService;
import com.example.jaz22043nbp.Entity.ZlotoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZlotoController {
    private final ZlotoService zlotoService;

    public ZlotoController(ZlotoService zlotoService) {
        this.zlotoService = zlotoService;
    }

    @GetMapping("/zloto/{startDate}/{endDate}")
    public ZlotoModel getZloto(@PathVariable String startDate,
                               @PathVariable String endDate) {
        return zlotoService.getZloto(startDate, endDate);
    }
}
