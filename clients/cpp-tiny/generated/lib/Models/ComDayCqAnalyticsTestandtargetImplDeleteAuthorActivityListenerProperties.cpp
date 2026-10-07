

#include "ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties()
{
	cqanalyticstestandtargetdeleteauthoractivitylistenerenabled = ConfigNodePropertyBoolean();
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::~ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey = "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled";

    if(object.has_key(cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey))
    {
        bourne::json value = object[cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticstestandtargetdeleteauthoractivitylistenerenabled"] = getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled()
{
	return cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::setCqanalyticstestandtargetdeleteauthoractivitylistenerenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetdeleteauthoractivitylistenerenabled)
{
	this->cqanalyticstestandtargetdeleteauthoractivitylistenerenabled = cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
}



