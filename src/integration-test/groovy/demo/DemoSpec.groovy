package demo

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class DemoSpec extends GebSpec {


    void "test something"() {
        expect:
        to DemoPage
    }
}
