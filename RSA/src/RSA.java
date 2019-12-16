
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camas
 */
public class RSA {
    int primeSize;
    
    BigInteger p, q;
    BigInteger N;
    BigInteger r ; 
    BigInteger E, D ; 
    
    public RSA(){} 
    public RSA( int primeSize ){
        this.primeSize = primeSize ;
    } 
    public void generatePrimeNumbers(){
        p = BigInteger.probablePrime(primeSize /2, random); 
        do{
            q = BigInteger.probablePrime(primeSize /2, random);   
        }while( q.compareTo( p ) == 0 ) ;  
    } 
    public void generatePublicPrivateKeys(){
        N = p.multiply( q ) ; 
  
        r = p.subtract( BigInteger.valueOf( 1 ) ) ;   
        r = r.multiply( q.subtract( BigInteger.valueOf( 1 ) ) ) ; 
 
 
  // Choose E, coprime to and less than r   do   {    E = new BigInteger( 2 * primeSize, new Random() ) ;   }   while( ( E.compareTo( r ) != -1 ) ||                  ( E.gcd( r ).compareTo( BigInteger.valueOf( 1 ) ) != 0 ) ) ; 
 
 
  // Compute D, the inverse of E mod r   D = E.modInverse( r ) ;  } 
}
