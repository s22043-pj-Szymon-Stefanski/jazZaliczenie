package com.example.jaz22043nbp.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ZlotoClient {
    private RestTemplate restTemplate = new RestTemplate();

    public String getZlotoFor(String startDate, String endDate) {
        return restTemplate.getForObject("http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}",
                String.class, startDate, endDate);
    }

}
