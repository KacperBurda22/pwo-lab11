/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author kacpe
 */
public class Sunday implements MessageFactory{
    @Override
 public String createIntroMessage() {
 return "Dzień dobry Niedziela.";
 }

 @Override
 public String createMainMessage() {
 return "Niedzielny odpoczynek idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Ostatni dzień weekendu w tym tygodniu minął";
 }
}
