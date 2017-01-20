package com.distributed.node;

/**
 * @author MaN
 *         on 1/20/2017.
 */


import org.springframework.web.bind.annotation.*;

/**
 * @author MaN
 *         on 6/25/2016.
 */


@RequestMapping("rest")
public class RestController {

    @RequestMapping(value = "/node", method = RequestMethod.POST, headers = "content-type=application/json")
    public
    @ResponseBody
    String add(@RequestBody String data) {
        //  VibrationDataBuffer.insertData(jobId,espId,data);
        return null;
    }

}

