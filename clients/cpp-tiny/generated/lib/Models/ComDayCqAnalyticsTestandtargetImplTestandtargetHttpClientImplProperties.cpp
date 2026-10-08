

#include "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties()
{
	cqanalyticstestandtargetapiurl = ConfigNodePropertyString();
	cqanalyticstestandtargettimeout = ConfigNodePropertyInteger();
	cqanalyticstestandtargetsockettimeout = ConfigNodePropertyInteger();
	cqanalyticstestandtargetrecommendationsurlreplace = ConfigNodePropertyString();
	cqanalyticstestandtargetrecommendationsurlreplacewith = ConfigNodePropertyString();
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticstestandtargetapiurlKey = "cq.analytics.testandtarget.api.url";

    if(object.has_key(cqanalyticstestandtargetapiurlKey))
    {
        bourne::json value = object[cqanalyticstestandtargetapiurlKey];




        ConfigNodePropertyString* obj = &cqanalyticstestandtargetapiurl;
		obj->fromJson(value.dump());

    }

    const char *cqanalyticstestandtargettimeoutKey = "cq.analytics.testandtarget.timeout";

    if(object.has_key(cqanalyticstestandtargettimeoutKey))
    {
        bourne::json value = object[cqanalyticstestandtargettimeoutKey];




        ConfigNodePropertyInteger* obj = &cqanalyticstestandtargettimeout;
		obj->fromJson(value.dump());

    }

    const char *cqanalyticstestandtargetsockettimeoutKey = "cq.analytics.testandtarget.sockettimeout";

    if(object.has_key(cqanalyticstestandtargetsockettimeoutKey))
    {
        bourne::json value = object[cqanalyticstestandtargetsockettimeoutKey];




        ConfigNodePropertyInteger* obj = &cqanalyticstestandtargetsockettimeout;
		obj->fromJson(value.dump());

    }

    const char *cqanalyticstestandtargetrecommendationsurlreplaceKey = "cq.analytics.testandtarget.recommendations.url.replace";

    if(object.has_key(cqanalyticstestandtargetrecommendationsurlreplaceKey))
    {
        bourne::json value = object[cqanalyticstestandtargetrecommendationsurlreplaceKey];




        ConfigNodePropertyString* obj = &cqanalyticstestandtargetrecommendationsurlreplace;
		obj->fromJson(value.dump());

    }

    const char *cqanalyticstestandtargetrecommendationsurlreplacewithKey = "cq.analytics.testandtarget.recommendations.url.replacewith";

    if(object.has_key(cqanalyticstestandtargetrecommendationsurlreplacewithKey))
    {
        bourne::json value = object[cqanalyticstestandtargetrecommendationsurlreplacewithKey];




        ConfigNodePropertyString* obj = &cqanalyticstestandtargetrecommendationsurlreplacewith;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticstestandtargetapiurl"] = getCqanalyticstestandtargetapiurl().toJson();






	object["cqanalyticstestandtargettimeout"] = getCqanalyticstestandtargettimeout().toJson();






	object["cqanalyticstestandtargetsockettimeout"] = getCqanalyticstestandtargetsockettimeout().toJson();






	object["cqanalyticstestandtargetrecommendationsurlreplace"] = getCqanalyticstestandtargetrecommendationsurlreplace().toJson();






	object["cqanalyticstestandtargetrecommendationsurlreplacewith"] = getCqanalyticstestandtargetrecommendationsurlreplacewith().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetapiurl()
{
	return cqanalyticstestandtargetapiurl;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetapiurl(ConfigNodePropertyString cqanalyticstestandtargetapiurl)
{
	this->cqanalyticstestandtargetapiurl = cqanalyticstestandtargetapiurl;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargettimeout()
{
	return cqanalyticstestandtargettimeout;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargettimeout(ConfigNodePropertyInteger cqanalyticstestandtargettimeout)
{
	this->cqanalyticstestandtargettimeout = cqanalyticstestandtargettimeout;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetsockettimeout()
{
	return cqanalyticstestandtargetsockettimeout;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetsockettimeout(ConfigNodePropertyInteger cqanalyticstestandtargetsockettimeout)
{
	this->cqanalyticstestandtargetsockettimeout = cqanalyticstestandtargetsockettimeout;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetrecommendationsurlreplace()
{
	return cqanalyticstestandtargetrecommendationsurlreplace;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetrecommendationsurlreplace(ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplace)
{
	this->cqanalyticstestandtargetrecommendationsurlreplace = cqanalyticstestandtargetrecommendationsurlreplace;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::getCqanalyticstestandtargetrecommendationsurlreplacewith()
{
	return cqanalyticstestandtargetrecommendationsurlreplacewith;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties::setCqanalyticstestandtargetrecommendationsurlreplacewith(ConfigNodePropertyString cqanalyticstestandtargetrecommendationsurlreplacewith)
{
	this->cqanalyticstestandtargetrecommendationsurlreplacewith = cqanalyticstestandtargetrecommendationsurlreplacewith;
}



