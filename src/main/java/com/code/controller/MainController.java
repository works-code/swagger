package com.code.controller;

import com.code.vo.Response;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/main")
@RestController
public class MainController {

    @RequestMapping(value = "/{version}/data", method = RequestMethod.GET)
    public Response mainGet(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }

    @RequestMapping(value = "/{version}/data", method = RequestMethod.POST)
    public Response mainPost(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }

    @RequestMapping(value = "/{version}/data", method = RequestMethod.DELETE)
    public Response mainDelete(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }

    @RequestMapping(value = "/{version}/data", method = RequestMethod.PUT)
    public Response mainPut(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }
}
