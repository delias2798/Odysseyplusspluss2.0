#ifndef ODYSSEY_S_H
#define ODYSSEY_S_H

#include <QMainWindow>
#include <QMainWindow>
#include <QTcpServer>
#include <QTcpSocket>
#include <QHostAddress>
#include <iostream>
#include <cstdlib>
#include "ody_calls.h"

namespace Ui {
class odyssey_s;
}

class odyssey_s : public QMainWindow
{
    Q_OBJECT

public:
    explicit odyssey_s(QWidget *parent = 0);
    ~odyssey_s();

public slots:
    /**
     * @brief Método para establecer la comunicación con el cliente
     *
     */
    void conexion_nueva();

    /**
     * @brief Método para leer los datos enviado por el cliente
     *
     */
    void leer_socket();

    /**
     * @brief Método para establecer la comunicación con el cliente
     *
     */
    void conexion_Streaming();

    /**
     * @brief Método para leer los datos enviado por el cliente
     *
     */
    void leer_Streaming();

    /**
     * @brief Método para crear el ficheros
     *
     */
    void createFile();

    std::string removebackn(std::string txt);


private:
    Ui::odyssey_s *ui;
    QTcpServer *tcpservidor; /**< TCP_Servidor */
    QTcpServer *streaming; /**< TCP_Streaming */
    QTcpSocket *tcpcliente[2]; /**< TCP_Cliente */
    QTcpSocket *tcpclienteStreaming[2]; /**< TCP_Cliente */
    ody_calls *call = new ody_calls();
};

#endif // ODYSSEY_S_H
