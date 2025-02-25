//
//  4344.swift
//  backJoon
//
//  Created by Min on 30/06/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

/*
 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 
 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 */
class Num4344 {
    
    static func run() {
        let testCase = readLine()!
        var avgs: [Double] = []
        
        for _ in 0..<Int(testCase)! {
            let input = readLine()!
            var inputArray = input.split(separator: " ")
            
            var score: Double = 0
            var member: Double = 0
            var avg: Double = 0
            
            var okMem: Double = 0
            
            if let num = inputArray.first {
                member = Double(num)!
                inputArray.removeFirst()
            }
            
            inputArray.forEach {
                score += Double($0)!
            }
            
            avg = score/member
            
            inputArray.forEach {
                if Double($0)! > avg {
                    okMem += 1
                }
            }
            avgs.append(okMem/member)
        
        }
        
        avgs.forEach { print(String(format: "%.3f%%", $0 * 100)) }
        
    }
}
