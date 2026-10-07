

#include "ComDayCqReportingImplCacheCacheImplProperties.h"

using namespace Tiny;

ComDayCqReportingImplCacheCacheImplProperties::ComDayCqReportingImplCacheCacheImplProperties()
{
	repcacheenable = ConfigNodePropertyBoolean();
	repcachettl = ConfigNodePropertyInteger();
	repcachemax = ConfigNodePropertyInteger();
}

ComDayCqReportingImplCacheCacheImplProperties::ComDayCqReportingImplCacheCacheImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReportingImplCacheCacheImplProperties::~ComDayCqReportingImplCacheCacheImplProperties()
{

}

void
ComDayCqReportingImplCacheCacheImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *repcacheenableKey = "repcache.enable";

    if(object.has_key(repcacheenableKey))
    {
        bourne::json value = object[repcacheenableKey];




        ConfigNodePropertyBoolean* obj = &repcacheenable;
		obj->fromJson(value.dump());

    }

    const char *repcachettlKey = "repcache.ttl";

    if(object.has_key(repcachettlKey))
    {
        bourne::json value = object[repcachettlKey];




        ConfigNodePropertyInteger* obj = &repcachettl;
		obj->fromJson(value.dump());

    }

    const char *repcachemaxKey = "repcache.max";

    if(object.has_key(repcachemaxKey))
    {
        bourne::json value = object[repcachemaxKey];




        ConfigNodePropertyInteger* obj = &repcachemax;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReportingImplCacheCacheImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["repcacheenable"] = getRepcacheenable().toJson();






	object["repcachettl"] = getRepcachettl().toJson();






	object["repcachemax"] = getRepcachemax().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqReportingImplCacheCacheImplProperties::getRepcacheenable()
{
	return repcacheenable;
}

void
ComDayCqReportingImplCacheCacheImplProperties::setRepcacheenable(ConfigNodePropertyBoolean repcacheenable)
{
	this->repcacheenable = repcacheenable;
}

ConfigNodePropertyInteger
ComDayCqReportingImplCacheCacheImplProperties::getRepcachettl()
{
	return repcachettl;
}

void
ComDayCqReportingImplCacheCacheImplProperties::setRepcachettl(ConfigNodePropertyInteger repcachettl)
{
	this->repcachettl = repcachettl;
}

ConfigNodePropertyInteger
ComDayCqReportingImplCacheCacheImplProperties::getRepcachemax()
{
	return repcachemax;
}

void
ComDayCqReportingImplCacheCacheImplProperties::setRepcachemax(ConfigNodePropertyInteger repcachemax)
{
	this->repcachemax = repcachemax;
}



