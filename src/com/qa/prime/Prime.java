package com.qa.prime;

import java.util.stream.IntStream;

public class Prime {


	public static void main(String[] args) {
		System.out.println("How many prime numbers are there up to and including the number 11?\n" + primeNumbers(11));
		System.out.println("How many prime numbers are there up to and including the number 37?\n" + primeNumbers(37));
			}

			static int primeNumbers(int maxNum) {
				return  (int) IntStream.rangeClosed(1, maxNum).filter(num->isPrime(num)).count();
			}
			
			static boolean isPrime(int num) {
				boolean isPrime = true;
				for(int i = 2;i<num/2;i++) {
					if(num%i==0) {
						isPrime = false;
					}
				}
				return isPrime;
			}
	
		
		}
//another//
//int primeCounter = 0;
//for (int i = 2; i <=max; i++) {
//booleanisPrime = true;
//for(int j=2; j<=(int)Math.sqrt(i); j++) {
//if (i%j = 0) {
//	isPrime = False;
//	break;
//}
//}
//if (isPrime) {
//primeCounter +=1
//return primeCounter;
	
