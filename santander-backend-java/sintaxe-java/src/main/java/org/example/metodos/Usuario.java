package org.example.metodos;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Usuario {

    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        logger.info(smartTV.ligado);
        logger.info(smartTV.canal);
        logger.info(smartTV.volume);

        smartTV.ligar();
        logger.info(smartTV.ligado);

        smartTV.desligar();
        logger.info(smartTV.ligado);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        logger.info(smartTV.volume);

        smartTV.diminuirVolume();
        logger.info(smartTV.volume);

        smartTV.mudarCanal(13);
        logger.info(smartTV.canal);

    }

}
