

#include "ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::ComDayCqDamCoreImplMissingMetadataNotificationJobProperties()
{
	cqdammissingmetadatanotificationscheduleristimebased = ConfigNodePropertyBoolean();
	cqdammissingmetadatanotificationschedulertimebasedrule = ConfigNodePropertyString();
	cqdammissingmetadatanotificationschedulerperiodrule = ConfigNodePropertyInteger();
	cqdammissingmetadatanotificationrecipient = ConfigNodePropertyString();
}

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::~ComDayCqDamCoreImplMissingMetadataNotificationJobProperties()
{

}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdammissingmetadatanotificationscheduleristimebasedKey = "cq.dam.missingmetadata.notification.scheduler.istimebased";

    if(object.has_key(cqdammissingmetadatanotificationscheduleristimebasedKey))
    {
        bourne::json value = object[cqdammissingmetadatanotificationscheduleristimebasedKey];




        ConfigNodePropertyBoolean* obj = &cqdammissingmetadatanotificationscheduleristimebased;
		obj->fromJson(value.dump());

    }

    const char *cqdammissingmetadatanotificationschedulertimebasedruleKey = "cq.dam.missingmetadata.notification.scheduler.timebased.rule";

    if(object.has_key(cqdammissingmetadatanotificationschedulertimebasedruleKey))
    {
        bourne::json value = object[cqdammissingmetadatanotificationschedulertimebasedruleKey];




        ConfigNodePropertyString* obj = &cqdammissingmetadatanotificationschedulertimebasedrule;
		obj->fromJson(value.dump());

    }

    const char *cqdammissingmetadatanotificationschedulerperiodruleKey = "cq.dam.missingmetadata.notification.scheduler.period.rule";

    if(object.has_key(cqdammissingmetadatanotificationschedulerperiodruleKey))
    {
        bourne::json value = object[cqdammissingmetadatanotificationschedulerperiodruleKey];




        ConfigNodePropertyInteger* obj = &cqdammissingmetadatanotificationschedulerperiodrule;
		obj->fromJson(value.dump());

    }

    const char *cqdammissingmetadatanotificationrecipientKey = "cq.dam.missingmetadata.notification.recipient";

    if(object.has_key(cqdammissingmetadatanotificationrecipientKey))
    {
        bourne::json value = object[cqdammissingmetadatanotificationrecipientKey];




        ConfigNodePropertyString* obj = &cqdammissingmetadatanotificationrecipient;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdammissingmetadatanotificationscheduleristimebased"] = getCqdammissingmetadatanotificationscheduleristimebased().toJson();






	object["cqdammissingmetadatanotificationschedulertimebasedrule"] = getCqdammissingmetadatanotificationschedulertimebasedrule().toJson();






	object["cqdammissingmetadatanotificationschedulerperiodrule"] = getCqdammissingmetadatanotificationschedulerperiodrule().toJson();






	object["cqdammissingmetadatanotificationrecipient"] = getCqdammissingmetadatanotificationrecipient().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationscheduleristimebased()
{
	return cqdammissingmetadatanotificationscheduleristimebased;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationscheduleristimebased(ConfigNodePropertyBoolean cqdammissingmetadatanotificationscheduleristimebased)
{
	this->cqdammissingmetadatanotificationscheduleristimebased = cqdammissingmetadatanotificationscheduleristimebased;
}

ConfigNodePropertyString
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationschedulertimebasedrule()
{
	return cqdammissingmetadatanotificationschedulertimebasedrule;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationschedulertimebasedrule(ConfigNodePropertyString cqdammissingmetadatanotificationschedulertimebasedrule)
{
	this->cqdammissingmetadatanotificationschedulertimebasedrule = cqdammissingmetadatanotificationschedulertimebasedrule;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationschedulerperiodrule()
{
	return cqdammissingmetadatanotificationschedulerperiodrule;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationschedulerperiodrule(ConfigNodePropertyInteger cqdammissingmetadatanotificationschedulerperiodrule)
{
	this->cqdammissingmetadatanotificationschedulerperiodrule = cqdammissingmetadatanotificationschedulerperiodrule;
}

ConfigNodePropertyString
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationrecipient()
{
	return cqdammissingmetadatanotificationrecipient;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationrecipient(ConfigNodePropertyString cqdammissingmetadatanotificationrecipient)
{
	this->cqdammissingmetadatanotificationrecipient = cqdammissingmetadatanotificationrecipient;
}



