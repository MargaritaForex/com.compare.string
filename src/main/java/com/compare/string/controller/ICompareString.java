package com.compare.string.controller;

import org.springframework.web.bind.annotation.RequestParam;

public interface ICompareString {

    public boolean validateStringMatch(@RequestParam String stringFirst, @RequestParam String stringSecod);
}
