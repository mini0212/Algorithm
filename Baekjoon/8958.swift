//
//  8958.swift
//  backJoon
//
//  Created by Min on 30/06/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation
//8958

/*
 "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 
 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 */

class Num8958 {
    static func run() {
        
        var testCase = readLine()!
        var sumArray: [Int] = []
        
        for _ in 0..<Int(testCase)! {
            //    var scoreString: [String] = []
            var scoreSum: Int = 0
            
            let input = readLine()!
            //    scoreString = input.map { String ($0) }
            var num: Int = 0
            
            input.map { String ($0) }.forEach { (value) in
                if value == "O" {
                    num += 1
                    scoreSum += num
                } else {
                    num = 0
                }
            }
            //
            //    scoreString.forEach { (value) in
            //        if value == "O" {
            //            num += 1
            //            scoreSum += num
            //        } else {
            //            num = 0
            //        }
            //    }
            
            sumArray.append(scoreSum)
        }
        
        sumArray.forEach { print($0) }

    }
}
