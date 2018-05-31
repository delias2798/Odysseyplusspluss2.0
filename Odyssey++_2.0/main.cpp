#include <iostream>
#include </home/elias/live/liveMedia/include/RTSPServer.hh>



int main() {

    // Begin by setting up our usage environment:
    TaskScheduler* scheduler = BasicTaskScheduler::createNew();
    UsageEnvironment* env = BasicUsageEnvironment::createNew(*scheduler);

    std::cout << "Hello, World!" << std::endl;
    RTSPServer* server = server->createNew()
    return 0;
}