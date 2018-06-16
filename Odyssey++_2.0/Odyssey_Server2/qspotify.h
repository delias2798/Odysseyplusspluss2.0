#ifndef QSPOTIFY_H
#define QSPOTIFY_H
#include <QtNetworkAuth>



class QSpotify
{
public:
    QSpotify();

    void lfMetadata();

private:
    QOAuth2AuthorizationCodeFlow spotify;
    bool isGranted();
    QString userName;
};

#endif // QSPOTIFY_H
