package com.example.jaz22043nbp.Service;

import com.example.jaz22043nbp.Client.ZlotoClient;
import com.example.jaz22043nbp.Repository.ZlotoRepository;
import com.example.jaz22043nbp.Entity.ZlotoModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class ZlotoService {
    private final ZlotoClient zlotoClient;
    private final ZlotoRepository zlotoRepository;

    public ZlotoService(ZlotoClient zlotoClient, ZlotoRepository zlotoRepository) {
        this.zlotoClient = zlotoClient;
        this.zlotoRepository = zlotoRepository;
    }

    public ZlotoModel getZloto(String startDate, String endDate) {;
        Date date = new Date();
        float testCena = (float) 261.87;

        String response = zlotoClient.getZlotoFor(startDate, endDate);
        log.info(response);

        ZlotoModel zlotoModel = new ZlotoModel(startDate, endDate, testCena,date);
        return zlotoRepository.save(zlotoModel);
    }
}
