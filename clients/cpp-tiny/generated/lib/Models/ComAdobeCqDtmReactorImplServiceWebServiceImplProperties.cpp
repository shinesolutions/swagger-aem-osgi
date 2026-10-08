

#include "ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::ComAdobeCqDtmReactorImplServiceWebServiceImplProperties()
{
	endpointUri = ConfigNodePropertyString();
	connectionTimeout = ConfigNodePropertyInteger();
	socketTimeout = ConfigNodePropertyInteger();
}

ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::~ComAdobeCqDtmReactorImplServiceWebServiceImplProperties()
{

}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::fromJson(std::string jsonObj)
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
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["endpointUri"] = getEndpointUri().toJson();






	object["connectionTimeout"] = getConnectionTimeout().toJson();






	object["socketTimeout"] = getSocketTimeout().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::getEndpointUri()
{
	return endpointUri;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::setEndpointUri(ConfigNodePropertyString endpointUri)
{
	this->endpointUri = endpointUri;
}

ConfigNodePropertyInteger
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::getConnectionTimeout()
{
	return connectionTimeout;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout)
{
	this->connectionTimeout = connectionTimeout;
}

ConfigNodePropertyInteger
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::getSocketTimeout()
{
	return socketTimeout;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplProperties::setSocketTimeout(ConfigNodePropertyInteger socketTimeout)
{
	this->socketTimeout = socketTimeout;
}



