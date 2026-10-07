

#include "ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties()
{
	purgeCompleted = ConfigNodePropertyBoolean();
	completedAge = ConfigNodePropertyInteger();
	purgeActive = ConfigNodePropertyBoolean();
	activeAge = ConfigNodePropertyInteger();
	saveThreshold = ConfigNodePropertyInteger();
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::~ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties()
{

}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *purgeCompletedKey = "purgeCompleted";

    if(object.has_key(purgeCompletedKey))
    {
        bourne::json value = object[purgeCompletedKey];




        ConfigNodePropertyBoolean* obj = &purgeCompleted;
		obj->fromJson(value.dump());

    }

    const char *completedAgeKey = "completedAge";

    if(object.has_key(completedAgeKey))
    {
        bourne::json value = object[completedAgeKey];




        ConfigNodePropertyInteger* obj = &completedAge;
		obj->fromJson(value.dump());

    }

    const char *purgeActiveKey = "purgeActive";

    if(object.has_key(purgeActiveKey))
    {
        bourne::json value = object[purgeActiveKey];




        ConfigNodePropertyBoolean* obj = &purgeActive;
		obj->fromJson(value.dump());

    }

    const char *activeAgeKey = "activeAge";

    if(object.has_key(activeAgeKey))
    {
        bourne::json value = object[activeAgeKey];




        ConfigNodePropertyInteger* obj = &activeAge;
		obj->fromJson(value.dump());

    }

    const char *saveThresholdKey = "saveThreshold";

    if(object.has_key(saveThresholdKey))
    {
        bourne::json value = object[saveThresholdKey];




        ConfigNodePropertyInteger* obj = &saveThreshold;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["purgeCompleted"] = getPurgeCompleted().toJson();






	object["completedAge"] = getCompletedAge().toJson();






	object["purgeActive"] = getPurgeActive().toJson();






	object["activeAge"] = getActiveAge().toJson();






	object["saveThreshold"] = getSaveThreshold().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getPurgeCompleted()
{
	return purgeCompleted;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted)
{
	this->purgeCompleted = purgeCompleted;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getCompletedAge()
{
	return completedAge;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setCompletedAge(ConfigNodePropertyInteger completedAge)
{
	this->completedAge = completedAge;
}

ConfigNodePropertyBoolean
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getPurgeActive()
{
	return purgeActive;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setPurgeActive(ConfigNodePropertyBoolean purgeActive)
{
	this->purgeActive = purgeActive;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getActiveAge()
{
	return activeAge;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setActiveAge(ConfigNodePropertyInteger activeAge)
{
	this->activeAge = activeAge;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getSaveThreshold()
{
	return saveThreshold;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setSaveThreshold(ConfigNodePropertyInteger saveThreshold)
{
	this->saveThreshold = saveThreshold;
}



