/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author kacpe
 */
public class Saturday implements MessageFactory {
    @Override
 public String createIntroMessage() {
 return "Dzień dobry Sobota.";
 }

 @Override
 public String createMainMessage() {
 return "Sobotni odpoczynek idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Pierwszy dzień weekendu w tym tygodniu minął";
 }
}
