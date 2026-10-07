

#include "ComAdobeGraniteWorkflowPurgeSchedulerProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowPurgeSchedulerProperties::ComAdobeGraniteWorkflowPurgeSchedulerProperties()
{
	scheduledpurgename = ConfigNodePropertyString();
	scheduledpurgeworkflowStatus = ConfigNodePropertyDropDown();
	scheduledpurgemodelIds = ConfigNodePropertyArray();
	scheduledpurgedaysold = ConfigNodePropertyInteger();
}

ComAdobeGraniteWorkflowPurgeSchedulerProperties::ComAdobeGraniteWorkflowPurgeSchedulerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowPurgeSchedulerProperties::~ComAdobeGraniteWorkflowPurgeSchedulerProperties()
{

}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scheduledpurgenameKey = "scheduledpurge.name";

    if(object.has_key(scheduledpurgenameKey))
    {
        bourne::json value = object[scheduledpurgenameKey];




        ConfigNodePropertyString* obj = &scheduledpurgename;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgeworkflowStatusKey = "scheduledpurge.workflowStatus";

    if(object.has_key(scheduledpurgeworkflowStatusKey))
    {
        bourne::json value = object[scheduledpurgeworkflowStatusKey];




        ConfigNodePropertyDropDown* obj = &scheduledpurgeworkflowStatus;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgemodelIdsKey = "scheduledpurge.modelIds";

    if(object.has_key(scheduledpurgemodelIdsKey))
    {
        bourne::json value = object[scheduledpurgemodelIdsKey];




        ConfigNodePropertyArray* obj = &scheduledpurgemodelIds;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgedaysoldKey = "scheduledpurge.daysold";

    if(object.has_key(scheduledpurgedaysoldKey))
    {
        bourne::json value = object[scheduledpurgedaysoldKey];




        ConfigNodePropertyInteger* obj = &scheduledpurgedaysold;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowPurgeSchedulerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["scheduledpurgename"] = getScheduledpurgename().toJson();






	object["scheduledpurgeworkflowStatus"] = getScheduledpurgeworkflowStatus().toJson();






	object["scheduledpurgemodelIds"] = getScheduledpurgemodelIds().toJson();






	object["scheduledpurgedaysold"] = getScheduledpurgedaysold().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgename()
{
	return scheduledpurgename;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgename(ConfigNodePropertyString scheduledpurgename)
{
	this->scheduledpurgename = scheduledpurgename;
}

ConfigNodePropertyDropDown
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgeworkflowStatus()
{
	return scheduledpurgeworkflowStatus;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgeworkflowStatus(ConfigNodePropertyDropDown scheduledpurgeworkflowStatus)
{
	this->scheduledpurgeworkflowStatus = scheduledpurgeworkflowStatus;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgemodelIds()
{
	return scheduledpurgemodelIds;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgemodelIds(ConfigNodePropertyArray scheduledpurgemodelIds)
{
	this->scheduledpurgemodelIds = scheduledpurgemodelIds;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgedaysold()
{
	return scheduledpurgedaysold;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgedaysold(ConfigNodePropertyInteger scheduledpurgedaysold)
{
	this->scheduledpurgedaysold = scheduledpurgedaysold;
}



