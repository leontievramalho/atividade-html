package br.edu.fesfafic.atividadePDI.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagemInfo {
    public static void getInfos(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        for(int coluna = 0; coluna < largura; coluna++){
            for(int linha = 0; linha < altura; linha++){
                int pixel = imagem.getRGB(coluna, linha);
                Color cor = new Color(pixel);
                if(cor.getBlue()<=50 && cor.getGreen() <= 50 && cor.getRed() >=150){
                    System.out.println(cor);
                }
            }
        }
        /*
        JFrame janela = new JFrame();

        ImageIcon icone = new ImageIcon(imagem);
        JLabel label = new JLabel(icone);

        janela.add(label);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
         */
    }
}
