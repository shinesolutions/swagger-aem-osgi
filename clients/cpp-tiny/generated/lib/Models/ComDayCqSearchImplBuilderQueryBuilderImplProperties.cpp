

#include "ComDayCqSearchImplBuilderQueryBuilderImplProperties.h"

using namespace Tiny;

ComDayCqSearchImplBuilderQueryBuilderImplProperties::ComDayCqSearchImplBuilderQueryBuilderImplProperties()
{
	excerptproperties = ConfigNodePropertyArray();
	cachemaxentries = ConfigNodePropertyInteger();
	cacheentrylifetime = ConfigNodePropertyInteger();
	xpathunion = ConfigNodePropertyBoolean();
}

ComDayCqSearchImplBuilderQueryBuilderImplProperties::ComDayCqSearchImplBuilderQueryBuilderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchImplBuilderQueryBuilderImplProperties::~ComDayCqSearchImplBuilderQueryBuilderImplProperties()
{

}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *excerptpropertiesKey = "excerpt.properties";

    if(object.has_key(excerptpropertiesKey))
    {
        bourne::json value = object[excerptpropertiesKey];




        ConfigNodePropertyArray* obj = &excerptproperties;
		obj->fromJson(value.dump());

    }

    const char *cachemaxentriesKey = "cache.max.entries";

    if(object.has_key(cachemaxentriesKey))
    {
        bourne::json value = object[cachemaxentriesKey];




        ConfigNodePropertyInteger* obj = &cachemaxentries;
		obj->fromJson(value.dump());

    }

    const char *cacheentrylifetimeKey = "cache.entry.lifetime";

    if(object.has_key(cacheentrylifetimeKey))
    {
        bourne::json value = object[cacheentrylifetimeKey];




        ConfigNodePropertyInteger* obj = &cacheentrylifetime;
		obj->fromJson(value.dump());

    }

    const char *xpathunionKey = "xpath.union";

    if(object.has_key(xpathunionKey))
    {
        bourne::json value = object[xpathunionKey];




        ConfigNodePropertyBoolean* obj = &xpathunion;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSearchImplBuilderQueryBuilderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["excerptproperties"] = getExcerptproperties().toJson();






	object["cachemaxentries"] = getCachemaxentries().toJson();






	object["cacheentrylifetime"] = getCacheentrylifetime().toJson();






	object["xpathunion"] = getXpathunion().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getExcerptproperties()
{
	return excerptproperties;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setExcerptproperties(ConfigNodePropertyArray excerptproperties)
{
	this->excerptproperties = excerptproperties;
}

ConfigNodePropertyInteger
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getCachemaxentries()
{
	return cachemaxentries;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setCachemaxentries(ConfigNodePropertyInteger cachemaxentries)
{
	this->cachemaxentries = cachemaxentries;
}

ConfigNodePropertyInteger
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getCacheentrylifetime()
{
	return cacheentrylifetime;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setCacheentrylifetime(ConfigNodePropertyInteger cacheentrylifetime)
{
	this->cacheentrylifetime = cacheentrylifetime;
}

ConfigNodePropertyBoolean
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getXpathunion()
{
	return xpathunion;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setXpathunion(ConfigNodePropertyBoolean xpathunion)
{
	this->xpathunion = xpathunion;
}



