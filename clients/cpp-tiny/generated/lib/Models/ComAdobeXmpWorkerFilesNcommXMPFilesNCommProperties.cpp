

#include "ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.h"

using namespace Tiny;

ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties()
{
	maxConnections = ConfigNodePropertyString();
	maxRequests = ConfigNodePropertyString();
	requestTimeout = ConfigNodePropertyString();
	logDir = ConfigNodePropertyString();
}

ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::~ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties()
{

}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxConnectionsKey = "maxConnections";

    if(object.has_key(maxConnectionsKey))
    {
        bourne::json value = object[maxConnectionsKey];




        ConfigNodePropertyString* obj = &maxConnections;
		obj->fromJson(value.dump());

    }

    const char *maxRequestsKey = "maxRequests";

    if(object.has_key(maxRequestsKey))
    {
        bourne::json value = object[maxRequestsKey];




        ConfigNodePropertyString* obj = &maxRequests;
		obj->fromJson(value.dump());

    }

    const char *requestTimeoutKey = "requestTimeout";

    if(object.has_key(requestTimeoutKey))
    {
        bourne::json value = object[requestTimeoutKey];




        ConfigNodePropertyString* obj = &requestTimeout;
		obj->fromJson(value.dump());

    }

    const char *logDirKey = "logDir";

    if(object.has_key(logDirKey))
    {
        bourne::json value = object[logDirKey];




        ConfigNodePropertyString* obj = &logDir;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxConnections"] = getMaxConnections().toJson();






	object["maxRequests"] = getMaxRequests().toJson();






	object["requestTimeout"] = getRequestTimeout().toJson();






	object["logDir"] = getLogDir().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getMaxConnections()
{
	return maxConnections;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setMaxConnections(ConfigNodePropertyString maxConnections)
{
	this->maxConnections = maxConnections;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getMaxRequests()
{
	return maxRequests;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setMaxRequests(ConfigNodePropertyString maxRequests)
{
	this->maxRequests = maxRequests;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getRequestTimeout()
{
	return requestTimeout;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setRequestTimeout(ConfigNodePropertyString requestTimeout)
{
	this->requestTimeout = requestTimeout;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getLogDir()
{
	return logDir;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setLogDir(ConfigNodePropertyString logDir)
{
	this->logDir = logDir;
}



