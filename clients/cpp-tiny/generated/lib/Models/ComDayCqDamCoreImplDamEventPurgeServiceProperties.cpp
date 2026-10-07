

#include "ComDayCqDamCoreImplDamEventPurgeServiceProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplDamEventPurgeServiceProperties::ComDayCqDamCoreImplDamEventPurgeServiceProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	maxSavedActivities = ConfigNodePropertyInteger();
	saveInterval = ConfigNodePropertyInteger();
	enableActivityPurge = ConfigNodePropertyBoolean();
	eventTypes = ConfigNodePropertyDropDown();
}

ComDayCqDamCoreImplDamEventPurgeServiceProperties::ComDayCqDamCoreImplDamEventPurgeServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplDamEventPurgeServiceProperties::~ComDayCqDamCoreImplDamEventPurgeServiceProperties()
{

}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *maxSavedActivitiesKey = "maxSavedActivities";

    if(object.has_key(maxSavedActivitiesKey))
    {
        bourne::json value = object[maxSavedActivitiesKey];




        ConfigNodePropertyInteger* obj = &maxSavedActivities;
		obj->fromJson(value.dump());

    }

    const char *saveIntervalKey = "saveInterval";

    if(object.has_key(saveIntervalKey))
    {
        bourne::json value = object[saveIntervalKey];




        ConfigNodePropertyInteger* obj = &saveInterval;
		obj->fromJson(value.dump());

    }

    const char *enableActivityPurgeKey = "enableActivityPurge";

    if(object.has_key(enableActivityPurgeKey))
    {
        bourne::json value = object[enableActivityPurgeKey];




        ConfigNodePropertyBoolean* obj = &enableActivityPurge;
		obj->fromJson(value.dump());

    }

    const char *eventTypesKey = "eventTypes";

    if(object.has_key(eventTypesKey))
    {
        bourne::json value = object[eventTypesKey];




        ConfigNodePropertyDropDown* obj = &eventTypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplDamEventPurgeServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["maxSavedActivities"] = getMaxSavedActivities().toJson();






	object["saveInterval"] = getSaveInterval().toJson();






	object["enableActivityPurge"] = getEnableActivityPurge().toJson();






	object["eventTypes"] = getEventTypes().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getMaxSavedActivities()
{
	return maxSavedActivities;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities)
{
	this->maxSavedActivities = maxSavedActivities;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getSaveInterval()
{
	return saveInterval;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setSaveInterval(ConfigNodePropertyInteger saveInterval)
{
	this->saveInterval = saveInterval;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getEnableActivityPurge()
{
	return enableActivityPurge;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge)
{
	this->enableActivityPurge = enableActivityPurge;
}

ConfigNodePropertyDropDown
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getEventTypes()
{
	return eventTypes;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setEventTypes(ConfigNodePropertyDropDown eventTypes)
{
	this->eventTypes = eventTypes;
}



