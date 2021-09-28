package com.ivoronline.springboot_services_xml_server;

import com.ivoronline.soap.GetPersonRequest;
import com.ivoronline.soap.GetPersonResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @ResponseBody
  @RequestMapping(value = "GetPerson", produces = {MediaType.APPLICATION_XML_VALUE}) //Force XML response
  GetPersonResponse getPerson(@RequestBody GetPersonRequest getPersonRequest) {

    //GET PERSON ID
    int id = getPersonRequest.getId();

    //CREATE RESPONSE
    GetPersonResponse getPersonResponse = new GetPersonResponse();
    if      (id==1) { getPersonResponse.setName("John");    }
    else if (id==2) { getPersonResponse.setName("Bill");    }
    else            { getPersonResponse.setName("Unknown"); }

    //RETURN RESPONSE
    return getPersonResponse;

  }

}


