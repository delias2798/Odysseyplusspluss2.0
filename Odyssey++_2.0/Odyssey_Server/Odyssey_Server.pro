#-------------------------------------------------
#
# Project created by QtCreator 2018-06-15T23:12:14
#
#-------------------------------------------------

QT       += core gui network xml sql

LIBS += -lmysqlclient
greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = Odyssey_Server
TEMPLATE = app

# The following define makes your compiler emit warnings if you use
# any feature of Qt which as been marked as deprecated (the exact warnings
# depend on your compiler). Please consult the documentation of the
# deprecated API in order to know how to port your code away from it.
DEFINES += QT_DEPRECATED_WARNINGS

# You can also make your code fail to compile if you use deprecated APIs.
# In order to do so, uncomment the following line.
# You can also select to disable deprecated APIs only up to a certain version of Qt.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0


SOURCES += \
        main.cpp \
    odyssey_s.cpp \
    mysql_calls.cpp \
    xmlconvert.cpp \
    ody_calls.cpp \
    huffman.cpp

HEADERS += \
    odyssey_s.h \
    mysql_calls.h \
    xmlconvert.h \
    ody_calls.h \
    huffman.h

FORMS += \
        odyssey_s.ui
