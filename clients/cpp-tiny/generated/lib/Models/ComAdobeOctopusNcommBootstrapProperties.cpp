

#include "ComAdobeOctopusNcommBootstrapProperties.h"

using namespace Tiny;

ComAdobeOctopusNcommBootstrapProperties::ComAdobeOctopusNcommBootstrapProperties()
{
	maxConnections = ConfigNodePropertyInteger();
	maxRequests = ConfigNodePropertyInteger();
	requestTimeout = ConfigNodePropertyInteger();
	requestRetries = ConfigNodePropertyInteger();
	launchTimeout = ConfigNodePropertyInteger();
}

ComAdobeOctopusNcommBootstrapProperties::ComAdobeOctopusNcommBootstrapProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeOctopusNcommBootstrapProperties::~ComAdobeOctopusNcommBootstrapProperties()
{

}

void
ComAdobeOctopusNcommBootstrapProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxConnectionsKey = "maxConnections";

    if(object.has_key(maxConnectionsKey))
    {
        bourne::json value = object[maxConnectionsKey];




        ConfigNodePropertyInteger* obj = &maxConnections;
		obj->fromJson(value.dump());

    }

    const char *maxRequestsKey = "maxRequests";

    if(object.has_key(maxRequestsKey))
    {
        bourne::json value = object[maxRequestsKey];




        ConfigNodePropertyInteger* obj = &maxRequests;
		obj->fromJson(value.dump());

    }

    const char *requestTimeoutKey = "requestTimeout";

    if(object.has_key(requestTimeoutKey))
    {
        bourne::json value = object[requestTimeoutKey];




        ConfigNodePropertyInteger* obj = &requestTimeout;
		obj->fromJson(value.dump());

    }

    const char *requestRetriesKey = "requestRetries";

    if(object.has_key(requestRetriesKey))
    {
        bourne::json value = object[requestRetriesKey];




        ConfigNodePropertyInteger* obj = &requestRetries;
		obj->fromJson(value.dump());

    }

    const char *launchTimeoutKey = "launchTimeout";

    if(object.has_key(launchTimeoutKey))
    {
        bourne::json value = object[launchTimeoutKey];




        ConfigNodePropertyInteger* obj = &launchTimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeOctopusNcommBootstrapProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxConnections"] = getMaxConnections().toJson();






	object["maxRequests"] = getMaxRequests().toJson();






	object["requestTimeout"] = getRequestTimeout().toJson();






	object["requestRetries"] = getRequestRetries().toJson();






	object["launchTimeout"] = getLaunchTimeout().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getMaxConnections()
{
	return maxConnections;
}

void
ComAdobeOctopusNcommBootstrapProperties::setMaxConnections(ConfigNodePropertyInteger maxConnections)
{
	this->maxConnections = maxConnections;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getMaxRequests()
{
	return maxRequests;
}

void
ComAdobeOctopusNcommBootstrapProperties::setMaxRequests(ConfigNodePropertyInteger maxRequests)
{
	this->maxRequests = maxRequests;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getRequestTimeout()
{
	return requestTimeout;
}

void
ComAdobeOctopusNcommBootstrapProperties::setRequestTimeout(ConfigNodePropertyInteger requestTimeout)
{
	this->requestTimeout = requestTimeout;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getRequestRetries()
{
	return requestRetries;
}

void
ComAdobeOctopusNcommBootstrapProperties::setRequestRetries(ConfigNodePropertyInteger requestRetries)
{
	this->requestRetries = requestRetries;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getLaunchTimeout()
{
	return launchTimeout;
}

void
ComAdobeOctopusNcommBootstrapProperties::setLaunchTimeout(ConfigNodePropertyInteger launchTimeout)
{
	this->launchTimeout = launchTimeout;
}



