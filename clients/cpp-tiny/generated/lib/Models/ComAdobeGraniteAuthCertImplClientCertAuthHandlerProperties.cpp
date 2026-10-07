

#include "ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties()
{
	path = ConfigNodePropertyString();
	serviceranking = ConfigNodePropertyInteger();
}

ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::~ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties()
{

}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



