//
//  10818.swift
//  backJoon
//
//  Created by Min on 01/07/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

/*
 
 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

 */

class Num10818 {
    
    static func run() {
     
        let inputNum = readLine()!
        let numberArray = readLine()!.split(separator: " ").compactMap { Int($0) }
        
        print(numberArray.min()!, numberArray.max()!)

        
//        var min = numberArray[0]
//        var max = numberArray[0]
        
        
//        numberArray.forEach {
//            if $0 < min {
//                min = $0
//            }
//            if $0 > max {
//                max = $0
//            }
//        }
//
//        print(min, max)
        
    }
}
