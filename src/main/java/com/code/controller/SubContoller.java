package com.code.controller;

import com.code.vo.Response;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

@Api(tags = {"00. SUB API"})
@RequestMapping("/sub")
@RestController
public class SubContoller {

    @ApiOperation(value = "GET METHOD API", notes = "서브 데이터를 가져올때 호출하는 API 입니다.")
    @ApiResponses(value = {
            @ApiResponse(code= 500, message = "server error")
    })
    @RequestMapping(value = "/{version}/data", method = RequestMethod.GET)
    public Response subget(HttpServletRequest request, @ApiParam(value = "version (ex: v1, v2 ..)", required = true) @PathVariable String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }
    @ApiIgnore
    @RequestMapping(value = "/{version}/data", method = RequestMethod.POST)
    public Response subPost(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }

    @RequestMapping(value = "/{version}/data", method = RequestMethod.DELETE)
    public Response subDelete(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }

    @RequestMapping(value = "/{version}/data", method = RequestMethod.PUT)
    public Response subPut(HttpServletRequest request, @PathVariable("version") String version){
        return new Response(){{
            setVersion(version);
            setMethod(request.getMethod());
        }};
    }
}
