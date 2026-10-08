

#include "OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties()
{
	name = ConfigNodePropertyString();
	title = ConfigNodePropertyString();
	details = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	serviceName = ConfigNodePropertyString();
	loglevel = ConfigNodePropertyDropDown();
	allowedroots = ConfigNodePropertyArray();
	requestAuthorizationStrategytarget = ConfigNodePropertyString();
	queueProviderFactorytarget = ConfigNodePropertyString();
	packageBuildertarget = ConfigNodePropertyString();
	triggerstarget = ConfigNodePropertyString();
	priorityQueues = ConfigNodePropertyArray();
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::~OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties()
{

}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];




        ConfigNodePropertyString* obj = &title;
		obj->fromJson(value.dump());

    }

    const char *detailsKey = "details";

    if(object.has_key(detailsKey))
    {
        bourne::json value = object[detailsKey];




        ConfigNodePropertyString* obj = &details;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }

    const char *loglevelKey = "log.level";

    if(object.has_key(loglevelKey))
    {
        bourne::json value = object[loglevelKey];




        ConfigNodePropertyDropDown* obj = &loglevel;
		obj->fromJson(value.dump());

    }

    const char *allowedrootsKey = "allowed.roots";

    if(object.has_key(allowedrootsKey))
    {
        bourne::json value = object[allowedrootsKey];




        ConfigNodePropertyArray* obj = &allowedroots;
		obj->fromJson(value.dump());

    }

    const char *requestAuthorizationStrategytargetKey = "requestAuthorizationStrategy.target";

    if(object.has_key(requestAuthorizationStrategytargetKey))
    {
        bourne::json value = object[requestAuthorizationStrategytargetKey];




        ConfigNodePropertyString* obj = &requestAuthorizationStrategytarget;
		obj->fromJson(value.dump());

    }

    const char *queueProviderFactorytargetKey = "queueProviderFactory.target";

    if(object.has_key(queueProviderFactorytargetKey))
    {
        bourne::json value = object[queueProviderFactorytargetKey];




        ConfigNodePropertyString* obj = &queueProviderFactorytarget;
		obj->fromJson(value.dump());

    }

    const char *packageBuildertargetKey = "packageBuilder.target";

    if(object.has_key(packageBuildertargetKey))
    {
        bourne::json value = object[packageBuildertargetKey];




        ConfigNodePropertyString* obj = &packageBuildertarget;
		obj->fromJson(value.dump());

    }

    const char *triggerstargetKey = "triggers.target";

    if(object.has_key(triggerstargetKey))
    {
        bourne::json value = object[triggerstargetKey];




        ConfigNodePropertyString* obj = &triggerstarget;
		obj->fromJson(value.dump());

    }

    const char *priorityQueuesKey = "priorityQueues";

    if(object.has_key(priorityQueuesKey))
    {
        bourne::json value = object[priorityQueuesKey];




        ConfigNodePropertyArray* obj = &priorityQueues;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["title"] = getTitle().toJson();






	object["details"] = getDetails().toJson();






	object["enabled"] = getEnabled().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["loglevel"] = getLoglevel().toJson();






	object["allowedroots"] = getAllowedroots().toJson();






	object["requestAuthorizationStrategytarget"] = getRequestAuthorizationStrategytarget().toJson();






	object["queueProviderFactorytarget"] = getQueueProviderFactorytarget().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();






	object["triggerstarget"] = getTriggerstarget().toJson();






	object["priorityQueues"] = getPriorityQueues().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setTitle(ConfigNodePropertyString title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setDetails(ConfigNodePropertyString details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setLoglevel(ConfigNodePropertyDropDown loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getAllowedroots()
{
	return allowedroots;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setAllowedroots(ConfigNodePropertyArray allowedroots)
{
	this->allowedroots = allowedroots;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getQueueProviderFactorytarget()
{
	return queueProviderFactorytarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setQueueProviderFactorytarget(ConfigNodePropertyString queueProviderFactorytarget)
{
	this->queueProviderFactorytarget = queueProviderFactorytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setTriggerstarget(ConfigNodePropertyString triggerstarget)
{
	this->triggerstarget = triggerstarget;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getPriorityQueues()
{
	return priorityQueues;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setPriorityQueues(ConfigNodePropertyArray priorityQueues)
{
	this->priorityQueues = priorityQueues;
}



