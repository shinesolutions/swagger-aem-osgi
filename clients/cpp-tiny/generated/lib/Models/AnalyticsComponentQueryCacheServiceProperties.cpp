

#include "AnalyticsComponentQueryCacheServiceProperties.h"

using namespace Tiny;

AnalyticsComponentQueryCacheServiceProperties::AnalyticsComponentQueryCacheServiceProperties()
{
	cqanalyticscomponentquerycachesize = ConfigNodePropertyInteger();
}

AnalyticsComponentQueryCacheServiceProperties::AnalyticsComponentQueryCacheServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

AnalyticsComponentQueryCacheServiceProperties::~AnalyticsComponentQueryCacheServiceProperties()
{

}

void
AnalyticsComponentQueryCacheServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticscomponentquerycachesizeKey = "cq.analytics.component.query.cache.size";

    if(object.has_key(cqanalyticscomponentquerycachesizeKey))
    {
        bourne::json value = object[cqanalyticscomponentquerycachesizeKey];




        ConfigNodePropertyInteger* obj = &cqanalyticscomponentquerycachesize;
		obj->fromJson(value.dump());

    }


}

bourne::json
AnalyticsComponentQueryCacheServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticscomponentquerycachesize"] = getCqanalyticscomponentquerycachesize().toJson();


    return object;

}

ConfigNodePropertyInteger
AnalyticsComponentQueryCacheServiceProperties::getCqanalyticscomponentquerycachesize()
{
	return cqanalyticscomponentquerycachesize;
}

void
AnalyticsComponentQueryCacheServiceProperties::setCqanalyticscomponentquerycachesize(ConfigNodePropertyInteger cqanalyticscomponentquerycachesize)
{
	this->cqanalyticscomponentquerycachesize = cqanalyticscomponentquerycachesize;
}



