package br.edu.fesfafic.atividadePDI.Main;

import br.edu.fesfafic.atividadePDI.Model.ImagemInfo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("C:\\Users\\leont\\Documents\\Projetos Java\\AtividadePDI\\src\\br\\edu\\fesfafic\\atividadePDI\\Images\\Atividade-PDI.png"));
        ImagemInfo.getInfos(imagem);
    }
}
