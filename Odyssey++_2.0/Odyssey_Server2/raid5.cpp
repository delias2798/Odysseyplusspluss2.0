#include "raid5.h"
using namespace std;
raid5::raid5()
{

}

void raid5::createfile()
{
    QString folder1 = "/home/toshiba/Escritorio/Nuevo_server/Disk1";
    QString folder2 = "/home/toshiba/Escritorio/Nuevo_server/Disk2";
    QString folder3 = "/home/toshiba/Escritorio/Nuevo_server/Disk3";
    QString folder4 = "/home/toshiba/Escritorio/Nuevo_server/Disk4";
   if (QDir(folder1).exists() == false){
       QDir().mkdir(folder1);
       //std::ofstream userFile(user);
       //userFile.close();
       qDebug()<<"Disk1";
   }
   if (QDir(folder2).exists() == false){
       QDir().mkdir(folder2);
       std::string metadata = folder2.append("/Metadata.json").toStdString();
       //std::ofstream metadataFile(metadata);
       //metadataFile.close();
       qDebug()<<"Disk2";
   }
}

void raid5::raid_split(const char *file_name, int number_part)
{
    FILE *fp_read = fopen(file_name, "rb");

       //calculate file size
       int file_size;
       fseek(fp_read, 0L, SEEK_END);
       file_size = ftell(fp_read);
       rewind(fp_read); //reset file pointer

       //calculate number of parts
       long size_of_part;
       //size_of_part = (int)ceil((double)file_size / number_part);
       /*cout << "Total files after split: " << number_part << endl
           << "...Processing..." << endl;*/

       //main process
       char name[255] = "";
       int bytesRemaining = file_size;

       //create buffer, we reuse it for each part
       char *buffer = new char[size_of_part];

       //No need to reset buffer
       //memset(buffer, NULL, partSize);


       for (int count = 1; count <= number_part; count++)
       {
           sprintf(name, "%s.part_%03d", file_name, count);
           FILE *fp_write = fopen(name, "wb");

           int partSize;
           if(bytesRemaining > size_of_part)
           {
               partSize = size_of_part;
           }
           else
           {
               partSize = bytesRemaining;
           }

           fread(buffer, partSize, 1, fp_read);
           fwrite(buffer, partSize, 1, fp_write);

           //cout << "> File: " << name << " done babe!" << endl;

           fclose(fp_write);
       }
       fclose(fp_read);
       delete[] buffer;
}
