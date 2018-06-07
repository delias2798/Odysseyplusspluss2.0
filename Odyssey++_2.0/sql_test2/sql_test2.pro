QT += core
QT -= gui
QT += sql
QT += widgets
LIBS += -lmysqlclient

CONFIG += c++11

TARGET = sql_test2
CONFIG += console
CONFIG -= app_bundle

QTPLUGIN += QSQLMYSQL
TEMPLATE = app

SOURCES += main.cpp \
    mysql_calls.cpp

HEADERS += \
    mysql_calls.h
