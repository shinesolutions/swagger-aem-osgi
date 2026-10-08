

#include "ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
{
	cqanalyticstestandtargetaccountoptionsupdaterenabled = ConfigNodePropertyBoolean();
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
{

}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticstestandtargetaccountoptionsupdaterenabledKey = "cq.analytics.testandtarget.accountoptionsupdater.enabled";

    if(object.has_key(cqanalyticstestandtargetaccountoptionsupdaterenabledKey))
    {
        bourne::json value = object[cqanalyticstestandtargetaccountoptionsupdaterenabledKey];




        ConfigNodePropertyBoolean* obj = &cqanalyticstestandtargetaccountoptionsupdaterenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticstestandtargetaccountoptionsupdaterenabled"] = getCqanalyticstestandtargetaccountoptionsupdaterenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::getCqanalyticstestandtargetaccountoptionsupdaterenabled()
{
	return cqanalyticstestandtargetaccountoptionsupdaterenabled;
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::setCqanalyticstestandtargetaccountoptionsupdaterenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetaccountoptionsupdaterenabled)
{
	this->cqanalyticstestandtargetaccountoptionsupdaterenabled = cqanalyticstestandtargetaccountoptionsupdaterenabled;
}



