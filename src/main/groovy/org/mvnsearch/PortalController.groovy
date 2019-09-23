package org.mvnsearch

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Portal Controller
 *
 * @author linux_china
 */
@RestController
class PortalController {
  @GetMapping("/")
  def index() {
    return "Hello"
  }
}
