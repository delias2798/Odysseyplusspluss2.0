#ifndef RAID5_H
#define RAID5_H
#include<QString>
#include <QDir>
#include<iostream>
#include<QDebug>


class raid5
{
public:
    raid5();
    void createfile();
    void raid_split(const char *file_name, int number_parts);
};

#endif // RAID5_H
