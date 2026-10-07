

#include "ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.h"

using namespace Tiny;

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::ComAdobeCqDamS7imagingImplIsImageServerComponentProperties()
{
	tcpPort = ConfigNodePropertyString();
	allowRemoteAccess = ConfigNodePropertyBoolean();
	maxRenderRgnPixels = ConfigNodePropertyString();
	maxMessageSize = ConfigNodePropertyString();
	randomAccessUrlTimeout = ConfigNodePropertyInteger();
	workerThreads = ConfigNodePropertyInteger();
}

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::~ComAdobeCqDamS7imagingImplIsImageServerComponentProperties()
{

}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tcpPortKey = "TcpPort";

    if(object.has_key(tcpPortKey))
    {
        bourne::json value = object[tcpPortKey];




        ConfigNodePropertyString* obj = &tcpPort;
		obj->fromJson(value.dump());

    }

    const char *allowRemoteAccessKey = "AllowRemoteAccess";

    if(object.has_key(allowRemoteAccessKey))
    {
        bourne::json value = object[allowRemoteAccessKey];




        ConfigNodePropertyBoolean* obj = &allowRemoteAccess;
		obj->fromJson(value.dump());

    }

    const char *maxRenderRgnPixelsKey = "MaxRenderRgnPixels";

    if(object.has_key(maxRenderRgnPixelsKey))
    {
        bourne::json value = object[maxRenderRgnPixelsKey];




        ConfigNodePropertyString* obj = &maxRenderRgnPixels;
		obj->fromJson(value.dump());

    }

    const char *maxMessageSizeKey = "MaxMessageSize";

    if(object.has_key(maxMessageSizeKey))
    {
        bourne::json value = object[maxMessageSizeKey];




        ConfigNodePropertyString* obj = &maxMessageSize;
		obj->fromJson(value.dump());

    }

    const char *randomAccessUrlTimeoutKey = "RandomAccessUrlTimeout";

    if(object.has_key(randomAccessUrlTimeoutKey))
    {
        bourne::json value = object[randomAccessUrlTimeoutKey];




        ConfigNodePropertyInteger* obj = &randomAccessUrlTimeout;
		obj->fromJson(value.dump());

    }

    const char *workerThreadsKey = "WorkerThreads";

    if(object.has_key(workerThreadsKey))
    {
        bourne::json value = object[workerThreadsKey];




        ConfigNodePropertyInteger* obj = &workerThreads;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["tcpPort"] = getTcpPort().toJson();






	object["allowRemoteAccess"] = getAllowRemoteAccess().toJson();






	object["maxRenderRgnPixels"] = getMaxRenderRgnPixels().toJson();






	object["maxMessageSize"] = getMaxMessageSize().toJson();






	object["randomAccessUrlTimeout"] = getRandomAccessUrlTimeout().toJson();






	object["workerThreads"] = getWorkerThreads().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getTcpPort()
{
	return tcpPort;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setTcpPort(ConfigNodePropertyString tcpPort)
{
	this->tcpPort = tcpPort;
}

ConfigNodePropertyBoolean
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getAllowRemoteAccess()
{
	return allowRemoteAccess;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess)
{
	this->allowRemoteAccess = allowRemoteAccess;
}

ConfigNodePropertyString
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getMaxRenderRgnPixels()
{
	return maxRenderRgnPixels;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels)
{
	this->maxRenderRgnPixels = maxRenderRgnPixels;
}

ConfigNodePropertyString
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getMaxMessageSize()
{
	return maxMessageSize;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setMaxMessageSize(ConfigNodePropertyString maxMessageSize)
{
	this->maxMessageSize = maxMessageSize;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getRandomAccessUrlTimeout()
{
	return randomAccessUrlTimeout;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout)
{
	this->randomAccessUrlTimeout = randomAccessUrlTimeout;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::getWorkerThreads()
{
	return workerThreads;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentProperties::setWorkerThreads(ConfigNodePropertyInteger workerThreads)
{
	this->workerThreads = workerThreads;
}



