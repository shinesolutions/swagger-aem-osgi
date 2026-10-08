

#include "ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties()
{
	endpointUri = ConfigNodePropertyString();
	connectionTimeout = ConfigNodePropertyInteger();
	socketTimeout = ConfigNodePropertyInteger();
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::~ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *endpointUriKey = "endpointUri";

    if(object.has_key(endpointUriKey))
    {
        bourne::json value = object[endpointUriKey];




        ConfigNodePropertyString* obj = &endpointUri;
		obj->fromJson(value.dump());

    }

    const char *connectionTimeoutKey = "connectionTimeout";

    if(object.has_key(connectionTimeoutKey))
    {
        bourne::json value = object[connectionTimeoutKey];




        ConfigNodePropertyInteger* obj = &connectionTimeout;
		obj->fromJson(value.dump());

    }

    const char *socketTimeoutKey = "socketTimeout";

    if(object.has_key(socketTimeoutKey))
    {
        bourne::json value = object[socketTimeoutKey];




        ConfigNodePropertyInteger* obj = &socketTimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["endpointUri"] = getEndpointUri().toJson();






	object["connectionTimeout"] = getConnectionTimeout().toJson();






	object["socketTimeout"] = getSocketTimeout().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::getEndpointUri()
{
	return endpointUri;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::setEndpointUri(ConfigNodePropertyString endpointUri)
{
	this->endpointUri = endpointUri;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::getConnectionTimeout()
{
	return connectionTimeout;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout)
{
	this->connectionTimeout = connectionTimeout;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::getSocketTimeout()
{
	return socketTimeout;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::setSocketTimeout(ConfigNodePropertyInteger socketTimeout)
{
	this->socketTimeout = socketTimeout;
}



