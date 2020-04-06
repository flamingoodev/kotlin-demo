package io.rushb.kotlindemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Hello
 *
 * @author <a href="mailto:flamingodev@outlook.com">FLAMINGO</a>
 * @since 2020/4/6 16:20
 */
@RestController
class HelloController {
    @GetMapping("/hello")
    fun helloWorld(): String {
        return "Hello,World!"
    }
}