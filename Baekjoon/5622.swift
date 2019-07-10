//
//  5622.swift
//  Baekjoon
//
//  Created by Min on 10/07/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

class Num5622 {
    static func run() {
        let input = readLine()!.compactMap { String($0) }
        
        var sum: Int = 0
        
        input.forEach {
            switch $0 {
            case "A", "B", "C":
                sum += 3
            case "D", "E", "F":
                sum += 4
            case "G", "H", "I":
                sum += 5
            case "J", "K", "L":
                sum += 6
            case "M", "N", "O":
                sum += 7
            case "P", "Q", "R", "S":
                sum += 8
            case "T", "U", "V":
                sum += 9
            case "W", "X", "Y", "Z":
                sum += 10
            default: break
            }
        }
        
        print(sum)
    }
}
