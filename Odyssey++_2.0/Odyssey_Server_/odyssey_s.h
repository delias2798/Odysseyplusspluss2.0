#ifndef ODYSSEY_S_H
#define ODYSSEY_S_H

#include <QMainWindow>
#include <QTcpServer>
#include <QTcpSocket>
#include <QHostAddress>
#include <iostream>
#include <cstdlib>
#include "ody_calls.h"

namespace Ui {
class Odyssey_S;
}

class Odyssey_S : public QMainWindow
{
    Q_OBJECT

public:
    explicit Odyssey_S(QWidget *parent = 0);
    ~Odyssey_S();

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
     * @brief Método para crear el ficheros
     *
     */
    void createFile();

    std::string removebackn(std::string txt);



private:
    Ui::Odyssey_S *ui;
    QTcpServer *tcpservidor; /**< TCP_Servidor */
    QTcpSocket *tcpcliente[2]; /**< TCP_Cliente */
    ody_calls *call = new ody_calls();
};

#endif // ODYSSEY_S_H
