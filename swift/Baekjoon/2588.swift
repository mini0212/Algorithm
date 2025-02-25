//
//  2588.swift
//  Baekjoon
//
//  Created by Hailey on 20/09/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

class Num2588 {
    static func run() {
        let input = readLine()!
            .compactMap { String($0) }
            .joined()
        
        let input2 = readLine()!
            .compactMap { String($0) }
            .reversed()
            .compactMap { Int($0) }
        
        var temp = 0
        var result: Double = 0
        
        input2
            .enumerated()
            .forEach({ (index, value) in
                temp = value * Int(input)!
                print(temp)
                
                
                result += Double(temp) * pow(10, Double(index))
            })
        print(Int(result))
        
        
    }
}
