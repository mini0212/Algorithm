//
//  1330.swift
//  Baekjoon
//
//  Created by Hailey on 20/09/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

class Num1330 {
    static func run() {
        let input = readLine()!
            .split(separator: " ")
            .compactMap { Int($0) }
        
        
        if input[0] >= -10000 && input[1] <= 10000 {
            if input[0] > input[1] {
                print(">")
            } else if input[0] < input[1] {
                print("<")
            } else {
                print("==")
            }
        }
    
    }
}
