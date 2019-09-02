
package org.blog.api.controller

import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping(path = ["/api/user"])
class UserController {



    @ResponseBody
    @RequestMapping(path = ["list"],method = [RequestMethod.GET, RequestMethod.PUT])
    fun index(req: HttpServletRequest): Map<String,Any>{

        return  HashMap<String, Any>().apply {
            put("code", true)
            put("message", "success")
            put("data", arrayOf("oyoung", "sbv", "gobid", "gobiqing"))
        }
    }

    @ResponseBody
    @RequestMapping(path = ["show"], method = [RequestMethod.GET, RequestMethod.PUT])
    fun test(@RequestBody reqMap:Map<String, Any>): Map<String, Any>{
        return reqMap
    }
}