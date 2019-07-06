//
//  etc.swift
//  backJoon
//
//  Created by Min on 30/06/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

//func input() -> Int {
//
//    let input = FileHandle.standardInput
//    let inputData = input.availableData
//
//    return NSString(data: inputData, encoding: String.Encoding.utf8.rawValue)! as Int
//}
//print("Enter data : ")
//
//var a = readLine()
//var b = readLine()
//
//let inputa = Int(a!)
//let inputb = Int(b!)



//print("data -> " + inputString)

// 나머지 찍기
//let line = readLine()!
//let lineArr = line.characters.split{$0 == " "}.map(String.init)
//let a = Double(lineArr[0])!
//let b = Double(lineArr[1])!
//let c = Double(lineArr[2])!
//print(Int((a+b).truncatingRemainder(dividingBy: c)))
//print(Int((a.truncatingRemainder(dividingBy: c) + b.truncatingRemainder(dividingBy: c)).truncatingRemainder(dividingBy: c)))
//print(Int((a*b).truncatingRemainder(dividingBy: c)))
//print(Int((a.truncatingRemainder(dividingBy: c) * b.truncatingRemainder(dividingBy: c)).truncatingRemainder(dividingBy: c)))


// 설탕
//var kg = readLine()
//
//let numKg = Double(kg!)
//
//if (numKg != 0) {
//    let ftot = Int(numKg!/5)
//    print(ftot)
//    // 5kg 봉지 수
//    let fiveBagnum = Int(ftot)
//    let fb = Int((numKg?.truncatingRemainder(dividingBy: 5))!)
//    print(fb)
//    // 3kg 봉지 수
//    let threeBagnum = Int(fb/3)
//    print(threeBagnum)
//
//    let bags = fiveBagnum + threeBagnum
//    print(bags)
//
//} else {
//    print("-1")
//}



//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//let num = Int(lineArr[0])
//
//for var i in 0..<num!{
////    var n = num!-i-1
//    for var j in 0...i {
//
//        print(" ", terminator: "")
//
//    }
//    for var n in
//
//    print("*")
//}

// 별
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//let num = Int(lineArr[0])
//
//for var i in 0..<num!{
//
//    var n = num! - i
//    for var j in 1..<n {
//
//        print(" ", terminator: "")
//    }
//    for var s in 0...i {
//        print("*", terminator: "")
//    }
//    print("")
//}

// 10991
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//let num = Int(lineArr[0])
//
//for var i in 0..<num!{
//    var n = num!-i-1
//    for var j in 0...n {
//        print(" ", terminator: "")
//    }
//    for var s in 0...i {
//        print("*", terminator: " ")
//    }
//
//    print("")
//}


// 11720
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//var input = Int(lineArr[0])
//
//var line2 = readLine()!
//var lineArr2 = line2.characters.map{String($0)}
//
//
//var sum = 0
//for var i in 0..<input!{
//    let num = Int(lineArr2[i])
//    sum += num!
//}
//print(sum)


//sum = input! * (input! + 1) / 2
//print(sum)


// 1924
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//let mon = Int(lineArr[0])
//let day = Int(lineArr[1])
//
//let week: Array = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
//
//var total = day
//
//for var i in 0..<mon! {
//    switch i {
//    case 1,3,5,7,8,10:
//        total = total! + 31
//    case 2:
//        total = total! + 28
//    case 4,6,9,11:
//        total = total! + 30
//    default:
//        break
//    }
//}
//let weekDay = total! % 7
//print(week[weekDay])

//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//let score = Int(lineArr[0])
//
//if (score! >= 90 && score! <= 100 ) {
//    print("A")
//} else if (score! >= 80 && score! < 90) {
//    print("B")
//} else if (score! >= 70 && score! < 80) {
//    print("C")
//} else if (score! >= 60 && score! < 70) {
//    print("D")
//} else {
//    print("F")
//}
//

//11721
//var count = 0
//var line2 = readLine()!
//var lineArr2 = line2.characters
//
//for var i in lineArr2 {
//    print(i, terminator: "")
//    count += 1
//    if ( count % 10 == 0) {
//        print("")
//    }
//}
//print("")

//10817
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//var temp = 0, temp2 = 0
//
//for var i in 0..<(lineArr.count) {
//
//    if (Int(lineArr[i])! > temp) {
//        temp2 = temp
//        temp = Int(lineArr[i])!
//
//    } else if ((Int(lineArr[i])!) >= temp2){
//        temp2 = Int(lineArr[i])!
//
//    }
//}
//print(temp2)

//// 10871
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//var input = Int(lineArr[0])
//var check = Int(lineArr[1])
//var output = Array<Any>()
//
//var line2 = readLine()!
//var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
//
//for var i in 0..<input!{
//    let num = Int(lineArr2[i])
//
//    if num! < check! {
//        print(num!, terminator: " ")
//    }
//}

//// 1546
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//var input = Int(lineArr[0])
//
//var line2 = readLine()!
//var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
//
//var sum = Double()
//var max = Int()
//var avg = Double()
//
//let numberOfPlaces = 2.0
//let multiplier = pow(10.0, numberOfPlaces)
//
//for var i in 0..<input!{
//    var num = Int(lineArr2[i])
//
//    if(num!>max){
//        max = num!
//    }
//}
//sum = 0
//for var i in 0..<input!{
//    var num = Double(lineArr2[i])
//
//    num! = num!/Double(max)*100
//    num = round(num! * multiplier) / multiplier
//
//    sum += Double(num!)
//}
//
//avg = sum/Double(input!)
//print(String(format: "%.2f", avg))

// 렙터님 소스
//func roundToPlaces( places: Int, num: Double) -> Double {
//    let divisor = pow(10.0, Double(places))
//    return round(num * divisor) / divisor
//}
//
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//let a = Double(lineArr[0])!
//
//var lineOne = readLine()!
//var lineOneArr = lineOne.characters.split{ $0 == " " }.map(String.init)
//var nums = [Double]()
//
//for var i in lineOneArr {
//    nums.append(Double(i)!)
//}
//
//let max = nums.max()
//let avg = nums.map { $0 / max! * 100 }.reduce(0, +) / Double(nums.count)
//let result = String(format: "%0.2f", roundToPlaces(places: 2, num: avg))
//
//print(result)


// 1110
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//var input = Double(lineArr[0])
//
//var left = Int(input! / 10)
//var right = Int((input?.truncatingRemainder(dividingBy: 10))!)
//
//var temp = Int((Double(left)+Double(right)).truncatingRemainder(dividingBy: 10) + Double(right * 10))
//var ll = temp/10, rr = Int(Double(temp).truncatingRemainder(dividingBy: 10))
//var count = 1
//
//while(true) {
//    if (left == ll && right == rr){
//        break
//    } else {
//        temp = Int((Double(ll)+Double(rr)).truncatingRemainder(dividingBy: 10) + Double(rr * 10))
//        ll = temp/10
//        rr = Int(Double(temp).truncatingRemainder(dividingBy: 10))
//        count += 1
//    }
//}
//
//print(count)

// 4344
//var line = readLine()!
//var lineArr = line.characters.map{String($0)}
//var input = Int(lineArr[0])
//
//var line2 = readLine()!
//var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
//var student = Int(lineArr2[0])
//
//for var i in 1..<input!+1{
//    var num = Int(lineArr2[i])
//    print("result = \(num!)")
//}



// 10950
//var line = readLine()!
//var input = Int(line)
//
//for var i in 0..<input! {
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == ","}.map(String.init)
//    let num1 = Int(lineArr2[0])
//    let num2 = Int(lineArr2[1])
//    print(num1! + num2!)
//
//    i +=  1
//}

// 10951
//var line = readLine()!
//var input = Int(line)

//while(true) {
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
//    let num1 = Int(lineArr2[0])
//    let num2 = Int(lineArr2[1])
//    print(num1! + num2!)
//
//}

// 10952
//while(true) {
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == ","}.map(String.init)
//    let num1 = Int(lineArr2[0])
//    let num2 = Int(lineArr2[1])
//    if num1! == 0 && num2! == 0 {
//        break
//    }
//    print(num1! + num2!)
//}

// 10953
//var line = readLine()!
//var input = Int(line)
//
//for var i in 0..<input! {
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == ","}.map(String.init)
//    let num1 = Int(lineArr2[0])
//    let num2 = Int(lineArr2[1])
//    print(num1! + num2!)
//
//    i +=  1
//}

// 11021
//var line = readLine()!
//var input = Int(line)
//
//for var i in 0..<input! {
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
//    let num1 = Int(lineArr2[0])
//    let num2 = Int(lineArr2[1])
//    print("Case #\(i+1): \(num1! + num2!)")
//
//    i +=  1
//}

// 11022
//var line = readLine()!
//var input = Int(line)
//
//for var i in 0..<input! {
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
//    let num1 = Int(lineArr2[0])
//    let num2 = Int(lineArr2[1])
//    print("Case #\(i+1): \(num1!) + \(num2!) = \(num1! + num2!)")
//
//    i +=  1
//}

// 10818
//var line = readLine()!
//var lineArr = line.characters.split{$0 == " "}.map(String.init)
//var input = Int(lineArr[0])
//var temp = 0, max = 0, min = 100000
//
//for i in 0..<input! {
//
//    var line2 = readLine()!
//    var lineArr2 = line2.characters.split{$0 == " "}.map(String.init)
////    var j = lineArr2.co
//    var num = Int(lineArr2[i])
//
//    print("num -> \(num!)")
//        if (num! < min) {
//            min = num!
//        }
//        if (num! > max) {
//            max = num!
//        }
//
//
//
//}
//print("\(min) \(max)")


// 11718, 11719
//var line = readLine()
//while(line != nil){
//    print(line!)
//    line = readLine()
//}

// 1152
//var input = readLine()!
//var inputArray = input.split(separator: " ")
//
//print(inputArray.count)

// 2577
//var numbers: [Int] = []
//var number: Int = 1
//
//for _ in 0...2 {
//    let input = readLine()!
//    number = number * Int(input)!
//}
//
//
////print(number)
//var numberArray = Array(String(number))
//
//
//for i in 0...9 {
//    var output: Int = 0
//    for j in 0..<numberArray.count {
//        if String(i) == String(numberArray[j]) {
//            output = output + 1
//        }
//    }
//    print(output)
//
//}
