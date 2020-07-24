package com.compare.string.controller.impl;

import com.compare.string.controller.ICompareString;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api" )
public class CompareStringController implements ICompareString {


    @ApiOperation(
            value = "generate Token")
    @RequestMapping(value = "/validateString", method = RequestMethod.GET)
    public boolean validateStringMatch(@RequestParam(name = "stringFirst") String stringFirst,@RequestParam(name = "stringSecond") String stringSecond) {
        System.out.println(stringFirst + stringSecond);
        return false;
    }
}
