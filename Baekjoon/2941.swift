//
//  2941.swift
//  Baekjoon
//
//  Created by Min on 10/07/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

// 컴파일 에러,,
class Num2941 {
    static func run() {
        let alphabet: [String] = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
        
        var input = readLine()!
        
        alphabet.forEach { value in
            if input.contains(value) {
                input = input.replacingOccurrences(of: value, with: ".")
            }
        }
        print(input.count)
        
    }
}

