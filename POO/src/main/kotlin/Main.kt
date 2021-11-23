package exercises

fun main() {
    val studentTest = Student("Emma", "Goldman", 9.5, 7)
    val studentTestTwo = Student("Viola", "Daves", 4.5, 9)
    val studentTestThree = Student("Simone", "Beauvoir", 5.0, 10)
    val courseTest = Course("Feminism", 9, "Milani")

    val studentArrayTest  = arrayOf(studentTest, studentTestTwo, studentTestThree)




//    studentTest.firstName = "Emma"
//    studentTest.lastName = "Goldman"
//
//    studentTest.printFullName()
//    println(studentTest.isApproved)
//
//    println(studentTest.registration)
//    studentTest.changeYearIfApproved()
//
//    studentTest.showAllStudentAttributes()
//    courseTest.showCourseInfo()
//
//    courseTest.enroll(studentTest)
//    courseTest.enroll(studentTestTwo)
//    courseTest.enroll(studentTestThree)
//
//    courseTest.unEnroll(studentTestThree)
//
//    courseTest.showAllEnrolledStudents()
//
    courseTest.enroll(studentArrayTest)
//
//    courseTest.calculateAvaregeGrade()
//    courseTest.checkIfItIsAboveAverage()

    courseTest.showAllEnrolledStudents()

}