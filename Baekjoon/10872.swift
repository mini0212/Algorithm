//
//  10872.swift
//  Baekjoon
//
//  Created by Min on 06/07/2019.
//  Copyright © 2019 Seongmin. All rights reserved.
//

import Foundation

/*
 
 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 */

class Num10872 {
    
    static func run() {
        let input = Int(readLine()!)!
        
        
        print(fac(input))
    }
    
   
    static func fac(_ num: Int) -> Int {
        var total: Int = num
        
        if num == 0 {
            return 1
        }
        
        total *= fac(num-1)
        
        return total
    }
    
}
