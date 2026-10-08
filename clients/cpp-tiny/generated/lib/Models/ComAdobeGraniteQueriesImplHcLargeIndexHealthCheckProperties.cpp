

#include "ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties()
{
	largeindexcriticalthreshold = ConfigNodePropertyInteger();
	largeindexwarnthreshold = ConfigNodePropertyInteger();
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties()
{

}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *largeindexcriticalthresholdKey = "large.index.critical.threshold";

    if(object.has_key(largeindexcriticalthresholdKey))
    {
        bourne::json value = object[largeindexcriticalthresholdKey];




        ConfigNodePropertyInteger* obj = &largeindexcriticalthreshold;
		obj->fromJson(value.dump());

    }

    const char *largeindexwarnthresholdKey = "large.index.warn.threshold";

    if(object.has_key(largeindexwarnthresholdKey))
    {
        bourne::json value = object[largeindexwarnthresholdKey];




        ConfigNodePropertyInteger* obj = &largeindexwarnthreshold;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["largeindexcriticalthreshold"] = getLargeindexcriticalthreshold().toJson();






	object["largeindexwarnthreshold"] = getLargeindexwarnthreshold().toJson();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::getLargeindexcriticalthreshold()
{
	return largeindexcriticalthreshold;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::setLargeindexcriticalthreshold(ConfigNodePropertyInteger largeindexcriticalthreshold)
{
	this->largeindexcriticalthreshold = largeindexcriticalthreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::getLargeindexwarnthreshold()
{
	return largeindexwarnthreshold;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::setLargeindexwarnthreshold(ConfigNodePropertyInteger largeindexwarnthreshold)
{
	this->largeindexwarnthreshold = largeindexwarnthreshold;
}

ConfigNodePropertyArray
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



