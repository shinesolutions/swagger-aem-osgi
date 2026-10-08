

#include "ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties()
{
	cqdams7damdynamicmediaconfigeventlistenerenabled = ConfigNodePropertyBoolean();
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::~ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties()
{

}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdams7damdynamicmediaconfigeventlistenerenabledKey = "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled";

    if(object.has_key(cqdams7damdynamicmediaconfigeventlistenerenabledKey))
    {
        bourne::json value = object[cqdams7damdynamicmediaconfigeventlistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqdams7damdynamicmediaconfigeventlistenerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdams7damdynamicmediaconfigeventlistenerenabled"] = getCqdams7damdynamicmediaconfigeventlistenerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::getCqdams7damdynamicmediaconfigeventlistenerenabled()
{
	return cqdams7damdynamicmediaconfigeventlistenerenabled;
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::setCqdams7damdynamicmediaconfigeventlistenerenabled(ConfigNodePropertyBoolean cqdams7damdynamicmediaconfigeventlistenerenabled)
{
	this->cqdams7damdynamicmediaconfigeventlistenerenabled = cqdams7damdynamicmediaconfigeventlistenerenabled;
}



