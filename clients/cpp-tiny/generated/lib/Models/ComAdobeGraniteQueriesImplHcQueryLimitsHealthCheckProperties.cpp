

#include "ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::~ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties()
{

}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



