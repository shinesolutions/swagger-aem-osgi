

#include "ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::ComDayCqWcmCoreStatsPageViewStatisticsImplProperties()
{
	pageviewstatisticstrackingurl = ConfigNodePropertyString();
	pageviewstatisticstrackingscriptenabled = ConfigNodePropertyString();
}

ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::~ComDayCqWcmCoreStatsPageViewStatisticsImplProperties()
{

}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pageviewstatisticstrackingurlKey = "pageviewstatistics.trackingurl";

    if(object.has_key(pageviewstatisticstrackingurlKey))
    {
        bourne::json value = object[pageviewstatisticstrackingurlKey];




        ConfigNodePropertyString* obj = &pageviewstatisticstrackingurl;
		obj->fromJson(value.dump());

    }

    const char *pageviewstatisticstrackingscriptenabledKey = "pageviewstatistics.trackingscript.enabled";

    if(object.has_key(pageviewstatisticstrackingscriptenabledKey))
    {
        bourne::json value = object[pageviewstatisticstrackingscriptenabledKey];




        ConfigNodePropertyString* obj = &pageviewstatisticstrackingscriptenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pageviewstatisticstrackingurl"] = getPageviewstatisticstrackingurl().toJson();






	object["pageviewstatisticstrackingscriptenabled"] = getPageviewstatisticstrackingscriptenabled().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::getPageviewstatisticstrackingurl()
{
	return pageviewstatisticstrackingurl;
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::setPageviewstatisticstrackingurl(ConfigNodePropertyString pageviewstatisticstrackingurl)
{
	this->pageviewstatisticstrackingurl = pageviewstatisticstrackingurl;
}

ConfigNodePropertyString
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::getPageviewstatisticstrackingscriptenabled()
{
	return pageviewstatisticstrackingscriptenabled;
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::setPageviewstatisticstrackingscriptenabled(ConfigNodePropertyString pageviewstatisticstrackingscriptenabled)
{
	this->pageviewstatisticstrackingscriptenabled = pageviewstatisticstrackingscriptenabled;
}



