

#include "ComAdobeCqProjectsPurgeSchedulerProperties.h"

using namespace Tiny;

ComAdobeCqProjectsPurgeSchedulerProperties::ComAdobeCqProjectsPurgeSchedulerProperties()
{
	scheduledpurgename = ConfigNodePropertyString();
	scheduledpurgepurgeActive = ConfigNodePropertyBoolean();
	scheduledpurgetemplates = ConfigNodePropertyArray();
	scheduledpurgepurgeGroups = ConfigNodePropertyBoolean();
	scheduledpurgepurgeAssets = ConfigNodePropertyBoolean();
	scheduledpurgeterminateRunningWorkflows = ConfigNodePropertyBoolean();
	scheduledpurgedaysold = ConfigNodePropertyInteger();
	scheduledpurgesaveThreshold = ConfigNodePropertyInteger();
}

ComAdobeCqProjectsPurgeSchedulerProperties::ComAdobeCqProjectsPurgeSchedulerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqProjectsPurgeSchedulerProperties::~ComAdobeCqProjectsPurgeSchedulerProperties()
{

}

void
ComAdobeCqProjectsPurgeSchedulerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scheduledpurgenameKey = "scheduledpurge.name";

    if(object.has_key(scheduledpurgenameKey))
    {
        bourne::json value = object[scheduledpurgenameKey];




        ConfigNodePropertyString* obj = &scheduledpurgename;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgepurgeActiveKey = "scheduledpurge.purgeActive";

    if(object.has_key(scheduledpurgepurgeActiveKey))
    {
        bourne::json value = object[scheduledpurgepurgeActiveKey];




        ConfigNodePropertyBoolean* obj = &scheduledpurgepurgeActive;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgetemplatesKey = "scheduledpurge.templates";

    if(object.has_key(scheduledpurgetemplatesKey))
    {
        bourne::json value = object[scheduledpurgetemplatesKey];




        ConfigNodePropertyArray* obj = &scheduledpurgetemplates;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgepurgeGroupsKey = "scheduledpurge.purgeGroups";

    if(object.has_key(scheduledpurgepurgeGroupsKey))
    {
        bourne::json value = object[scheduledpurgepurgeGroupsKey];




        ConfigNodePropertyBoolean* obj = &scheduledpurgepurgeGroups;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgepurgeAssetsKey = "scheduledpurge.purgeAssets";

    if(object.has_key(scheduledpurgepurgeAssetsKey))
    {
        bourne::json value = object[scheduledpurgepurgeAssetsKey];




        ConfigNodePropertyBoolean* obj = &scheduledpurgepurgeAssets;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgeterminateRunningWorkflowsKey = "scheduledpurge.terminateRunningWorkflows";

    if(object.has_key(scheduledpurgeterminateRunningWorkflowsKey))
    {
        bourne::json value = object[scheduledpurgeterminateRunningWorkflowsKey];




        ConfigNodePropertyBoolean* obj = &scheduledpurgeterminateRunningWorkflows;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgedaysoldKey = "scheduledpurge.daysold";

    if(object.has_key(scheduledpurgedaysoldKey))
    {
        bourne::json value = object[scheduledpurgedaysoldKey];




        ConfigNodePropertyInteger* obj = &scheduledpurgedaysold;
		obj->fromJson(value.dump());

    }

    const char *scheduledpurgesaveThresholdKey = "scheduledpurge.saveThreshold";

    if(object.has_key(scheduledpurgesaveThresholdKey))
    {
        bourne::json value = object[scheduledpurgesaveThresholdKey];




        ConfigNodePropertyInteger* obj = &scheduledpurgesaveThreshold;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqProjectsPurgeSchedulerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["scheduledpurgename"] = getScheduledpurgename().toJson();






	object["scheduledpurgepurgeActive"] = getScheduledpurgepurgeActive().toJson();






	object["scheduledpurgetemplates"] = getScheduledpurgetemplates().toJson();






	object["scheduledpurgepurgeGroups"] = getScheduledpurgepurgeGroups().toJson();






	object["scheduledpurgepurgeAssets"] = getScheduledpurgepurgeAssets().toJson();






	object["scheduledpurgeterminateRunningWorkflows"] = getScheduledpurgeterminateRunningWorkflows().toJson();






	object["scheduledpurgedaysold"] = getScheduledpurgedaysold().toJson();






	object["scheduledpurgesaveThreshold"] = getScheduledpurgesaveThreshold().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgename()
{
	return scheduledpurgename;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgename(ConfigNodePropertyString scheduledpurgename)
{
	this->scheduledpurgename = scheduledpurgename;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgepurgeActive()
{
	return scheduledpurgepurgeActive;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgepurgeActive(ConfigNodePropertyBoolean scheduledpurgepurgeActive)
{
	this->scheduledpurgepurgeActive = scheduledpurgepurgeActive;
}

ConfigNodePropertyArray
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgetemplates()
{
	return scheduledpurgetemplates;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgetemplates(ConfigNodePropertyArray scheduledpurgetemplates)
{
	this->scheduledpurgetemplates = scheduledpurgetemplates;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgepurgeGroups()
{
	return scheduledpurgepurgeGroups;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgepurgeGroups(ConfigNodePropertyBoolean scheduledpurgepurgeGroups)
{
	this->scheduledpurgepurgeGroups = scheduledpurgepurgeGroups;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgepurgeAssets()
{
	return scheduledpurgepurgeAssets;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgepurgeAssets(ConfigNodePropertyBoolean scheduledpurgepurgeAssets)
{
	this->scheduledpurgepurgeAssets = scheduledpurgepurgeAssets;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeterminateRunningWorkflows()
{
	return scheduledpurgeterminateRunningWorkflows;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeterminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeterminateRunningWorkflows)
{
	this->scheduledpurgeterminateRunningWorkflows = scheduledpurgeterminateRunningWorkflows;
}

ConfigNodePropertyInteger
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgedaysold()
{
	return scheduledpurgedaysold;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgedaysold(ConfigNodePropertyInteger scheduledpurgedaysold)
{
	this->scheduledpurgedaysold = scheduledpurgedaysold;
}

ConfigNodePropertyInteger
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgesaveThreshold()
{
	return scheduledpurgesaveThreshold;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgesaveThreshold(ConfigNodePropertyInteger scheduledpurgesaveThreshold)
{
	this->scheduledpurgesaveThreshold = scheduledpurgesaveThreshold;
}



