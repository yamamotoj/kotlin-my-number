import com.github.yamamotoj.kotlin_my_number.MyNumberValidator

fun main(args: Array<String>){

    check(!MyNumberValidator.validate("123456789010"))
    check(!MyNumberValidator.validate("123456789011"))
    check(!MyNumberValidator.validate("123456789012"))
    check(!MyNumberValidator.validate("123456789013"))
    check(!MyNumberValidator.validate("123456789014"))
    check(!MyNumberValidator.validate("123456789015"))
    check(!MyNumberValidator.validate("123456789016"))
    check(!MyNumberValidator.validate("123456789017"))
    check(!MyNumberValidator.validate("123456789018"))
    check(!MyNumberValidator.validate("123456789019"))
    check(MyNumberValidator.validate("023456789013"))
}