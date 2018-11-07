package org.whj.controller.api;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.whj.bean.Ad;
import org.whj.dto.AdDto;
import org.whj.service.AdService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private AdService adService;
    @Value("${ad.number}")
    private int adNumber ;
    @RequestMapping(value = "/homead",method = RequestMethod.GET)
    public List<AdDto> homead() throws JsonParseException, JsonMappingException, IOException {
        AdDto adDto = new AdDto();
        adDto.getPage().setCurrentPage(6);
        return adService.searchByPage(adDto);
    }
}
