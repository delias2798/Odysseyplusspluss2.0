cmake_minimum_required(VERSION 3.9)
project(Odyssey___2_0)

set(CMAKE_CXX_STANDARD 11)

add_executable(Odyssey___2_0 main.cpp /home/elias/live/liveMedia/include/RTSPServer.hh /home/elias/live/BasicUsageEnvironment/include/BasicUsageEnvironment.hh
        /home/elias/live/groupsock/include/GroupsockHelper.hh
        /home/elias/live/mediaServer/DynamicRTSPServer.hh
        /home/elias/live/liveMedia/include/liveMedia.hh
        /home/elias/live/mediaServer/version.hh
        /home/elias/live/UsageEnvironment/include/HashTable.hh
        /home/elias/live/BasicUsageEnvironment/include/BasicTaskScheduler.cpp)
#add_executable(/cmake-build-debug/live/groupsock/include/GroupsockHelper.hh)



# live555
find_path(LIBLIVE555_INCLUDE_DIR /home/elias/live/liveMedia/liveMedia.hh)
if (NOT LIBLIVE555_INCLUDE_DIR)
    message(STATUS "Installing live555")
    EXEC_PROGRAM("wget http://www.live555.com/liveMedia/public/live555-latest.tar.gz -O - | tar xzf -")
    EXEC_PROGRAM("cd live && ./genMakefiles linux-gdb && make CPLUSPLUS_COMPILER=${CMAKE_CXX_COMPILER} C_COMPILER=${CMAKE_C_COMPILER} LINK='${CMAKE_CXX_COMPILER} -o' CPPFLAGS=-DALLOW_RTSP_SERVER_PORT_REUSE=1 PREFIX=${CMAKE_STAGING_PREFIX} install")
else (NOT LIBLIVE555_INCLUDE_DIR)
    SET(CPACK_DEBIAN_PACKAGE_DEPENDS ${CPACK_DEBIAN_PACKAGE_DEPENDS}liblivemedia-dev,)
endif (NOT LIBLIVE555_INCLUDE_DIR)

find_path(LIBLIVE555_INCLUDE_DIR /home/elias/live/liveMedia/liveMedia.hh)
foreach (LIBLIVE555_module groupsock liveMedia UsageEnvironment BasicUsageEnvironment)
    include_directories(${LIBLIVE555_INCLUDE_DIR}/${LIBLIVE555_module})
endforeach (LIBLIVE555_module)

set(LIBLIVE555_LIBRARIES "")
foreach (LIBLIVE555_module groupsock liveMedia UsageEnvironment BasicUsageEnvironment)
    find_library( ${LIBLIVE555_module}_LIBRARY ${LIBLIVE555_module} )
    if ( ${LIBLIVE555_module}_LIBRARY )
        set(LIBLIVE555_LIBRARIES ${LIBLIVE555_LIBRARIES} ${${LIBLIVE555_module}_LIBRARY})
    endif ( ${LIBLIVE555_module}_LIBRARY )
endforeach (LIBLIVE555_module)
target_link_libraries(${PROJECT_NAME} ${LIBLIVE555_LIBRARIES})