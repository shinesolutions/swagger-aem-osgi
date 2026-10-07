

#include "ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.h"

using namespace Tiny;

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::~ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties()
{

}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



