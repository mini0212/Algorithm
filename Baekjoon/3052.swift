//
//  3052.swift
//  backJoon
//
//  Created by Min on 30/06/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation
// 3052
/*
 
 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 
 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 
 */

class Num3052 {
    static func run() {
        
        var inputArray: [Double] = []
        //        var resultArray: Set<Double> = []
        
        for _ in 0..<10 {
            let input = readLine()!
            inputArray.append(Double(input)!)
        }
        
        //        inputArray.forEach {
        //            resultArray.insert($0.truncatingRemainder(dividingBy: 42))
        //        }
        
        let array: Set<Double> = Set(inputArray.map { $0.truncatingRemainder(dividingBy: 42) })
        
        //        print(resultArray.count)
        print(array.count)
    }
    
}
