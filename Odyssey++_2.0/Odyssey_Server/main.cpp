#include "odyssey_s.h"
#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    odyssey_s w;
    w.show();

    return a.exec();
}
