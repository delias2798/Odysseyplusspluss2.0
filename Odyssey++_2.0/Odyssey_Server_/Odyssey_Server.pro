#-------------------------------------------------
#
# Project created by QtCreator 2018-06-08T15:01:42
#
#-------------------------------------------------

QT       += core gui network xml sql
LIBS += -lmysqlclient
greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = Odyssey_Server
TEMPLATE = app


SOURCES += main.cpp\
        odyssey_s.cpp \
    xmlconvert.cpp \
    mysql_calls.cpp \
    ody_calls.cpp

HEADERS  += odyssey_s.h \
    xmlconvert.h \
    mysql_calls.h \
    ody_calls.h

FORMS    += odyssey_s.ui
