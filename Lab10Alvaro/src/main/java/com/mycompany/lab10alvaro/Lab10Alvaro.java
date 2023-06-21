/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab10alvaro;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lab
 */
public class Lab10Alvaro {

    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    */
    
    public int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    
        int firstDiag = 0;
        int secondDiag = 0;
        for(int i = 0; i < arr.size(); i++){
            
            for(int j = 0; j < arr.size(); j++){
                
                if(i == j){
                    
                    firstDiag = firstDiag + ( arr.get(i).get(j));
                } 
            }
        }
        
        for(int i = 0; i < arr.size() ; i++){
          
          for(int j = 0; j < arr.size() ; j++){
            
                if(j+i ==  arr.size()-1){
                    secondDiag = secondDiag + ( arr.get(i).get(j) );    
                }
            
            }  
        }
        
        return  Math.abs(firstDiag - secondDiag);
    }
    
    
    public void plusMinus(List<Integer> arr) {
    // Write your code here
    
        int contZero = 0;
        int contNegative = 0;
        int contPositive = 0;
        for(int i = 0; i < arr.size(); i++){
            
            if(arr.get(i) == 0) {
                
                contZero++;
                
            }else if(arr.get(i) > 0){
                contPositive++;
                
            }else if(arr.get(i) < 0){
                contNegative++;
            }else{
                
            }
        }
        
        if(contZero > 0){
            Double zeroData = (double)contZero/arr.size();
            String zeroFormat = String.format("zeroData.6f",zeroData);
            System.out.println(zeroFormat);
            //contZero/arr.size()
        }
        
        if(contPositive > 0){
            Double positiveData = (double)contPositive/arr.size();
            String positiveFormat = String.format("positiveData.6f",positiveData);
            System.out.println(positiveFormat);
        }
        
        if(contNegative > 0){
            Double negativeData = (double)contNegative/arr.size();
            String negativeFormat = String.format("negativeData.6f",negativeData);
            System.out.println(negativeFormat);
        }

    }
    
    public int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    
    
        // Recorremos buscando la vela de mayot tamanio y vamos guardando su valor
        int lowCandle = 0;
        for(int i = 0; i < candles.size(); i++){
            if(lowCandle <= candles.get(i)){
                lowCandle = candles.get(i);
            }
        }
        
        //Verificamos cuantas veces se repite la vela de mayor tamanio y retornamos
        int duplicate = 1;
        for(int i = 0; i < candles.size(); i++){
            if(lowCandle == candles.get(i)){
                duplicate++;
            }
        }
        
        return duplicate;
    }
    
    
    public List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    
        List<Integer> aux = arr;
        List<Integer> resultList = null;
        while(!aux.isEmpty()){//aux cada vez que itera, pierde elementos, nos salimos hasta que este vacio
            
            //obtenemos el valor minino de aux, este cambia cada que itera
            int lowerStick = Collections.min(aux);
            //guardamos el tamano del aux para el for, ya que este puede ir cambiando dentro del for, afectando su
            //recorrido
            int olderSize = aux.size();
            for(int i = 0; i < olderSize; i++){
                
                aux.set(i,aux.get(i)-lowerStick);
                //si es menor o igual a cero, lo eliminamos
                if(aux.get(i) <= 0 ){
                    aux.remove(i);
                } 
            }
            //Agregamos el numero de elementos que quedan por cada iteracion a la lista que se debe retornar
            resultList.add(aux.size());
            
        }
        return resultList;

    }
}
