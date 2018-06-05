#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();    
    int CountCharacter( char * str , char ch );


private slots:
    void on_pushButton_clicked();

    void on_SplitFrecuency_clicked();

    void Dictionary(QString data,int by);

    void on_createD_clicked();

private:
    Ui::MainWindow *ui;
};

#endif // MAINWINDOW_H
