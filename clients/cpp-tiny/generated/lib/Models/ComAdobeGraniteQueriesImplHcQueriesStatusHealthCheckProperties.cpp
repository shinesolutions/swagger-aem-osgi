

#include "ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::~ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties()
{

}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



