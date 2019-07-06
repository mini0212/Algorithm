//
//  2562.swift
//  backJoon
//
//  Created by Min on 30/06/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

/*
2562
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

*/
class Num2562 {
    static func run() {
        var numbers: [Int] = []
        
        for _ in 1...9 {
            let input = readLine()!
            numbers.append(Int(input)!)
        }
        
        var maxNumber: Int = 0
        var maxIndex: Int = 0
        
        for i in 0..<numbers.count {
            
            if numbers[i] > maxNumber {
                maxNumber = numbers[i]
                maxIndex = i
            }
        }
        
        print(maxNumber)
        print(maxIndex + 1)

    }
}

