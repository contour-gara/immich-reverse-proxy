package org.contourgara

import com.thoughtworks.gauge.Step
import io.restassured.RestAssured.*
import org.hamcrest.Matchers.*

class ReverseProxyTest {
    var testContext: TestContext = TestContext(null)

    @Step("もしリバースプロキシにアクセスする")
    fun accessReverseProxy() {
        baseURI = "http://localhost:80"
        val response = given().get("/")
        testContext.response = response
    }

    @Step("ならば h1 タグに test と表示されている")
    fun assertDisplayH1() {
        testContext.response!!.then()
            .statusCode(200)
            .body("html.body.h1", equalTo("test"))
    }
}
