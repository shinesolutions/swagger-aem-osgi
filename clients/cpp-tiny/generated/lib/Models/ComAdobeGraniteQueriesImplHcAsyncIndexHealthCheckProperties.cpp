

#include "ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties()
{
	indexingcriticalthreshold = ConfigNodePropertyInteger();
	indexingwarnthreshold = ConfigNodePropertyInteger();
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::~ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties()
{

}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexingcriticalthresholdKey = "indexing.critical.threshold";

    if(object.has_key(indexingcriticalthresholdKey))
    {
        bourne::json value = object[indexingcriticalthresholdKey];




        ConfigNodePropertyInteger* obj = &indexingcriticalthreshold;
		obj->fromJson(value.dump());

    }

    const char *indexingwarnthresholdKey = "indexing.warn.threshold";

    if(object.has_key(indexingwarnthresholdKey))
    {
        bourne::json value = object[indexingwarnthresholdKey];




        ConfigNodePropertyInteger* obj = &indexingwarnthreshold;
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
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["indexingcriticalthreshold"] = getIndexingcriticalthreshold().toJson();






	object["indexingwarnthreshold"] = getIndexingwarnthreshold().toJson();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::getIndexingcriticalthreshold()
{
	return indexingcriticalthreshold;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::setIndexingcriticalthreshold(ConfigNodePropertyInteger indexingcriticalthreshold)
{
	this->indexingcriticalthreshold = indexingcriticalthreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::getIndexingwarnthreshold()
{
	return indexingwarnthreshold;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::setIndexingwarnthreshold(ConfigNodePropertyInteger indexingwarnthreshold)
{
	this->indexingwarnthreshold = indexingwarnthreshold;
}

ConfigNodePropertyArray
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



