

#include "ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties()
{
	cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled = ConfigNodePropertyBoolean();
}

ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::~ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey = "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled";

    if(object.has_key(cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey))
    {
        bourne::json value = object[cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled"] = getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled()
{
	return cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
}

void
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::setCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled)
{
	this->cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled = cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
}



