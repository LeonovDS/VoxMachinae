import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SampleTest : FunSpec() {
    init {
        test("1 + 1 should equal 2") {
            1 + 1 shouldBe 2
        }
    }
}
