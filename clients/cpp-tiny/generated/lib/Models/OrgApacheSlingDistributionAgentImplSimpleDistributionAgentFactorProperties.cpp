

#include "OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties()
{
	name = ConfigNodePropertyString();
	title = ConfigNodePropertyString();
	details = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	serviceName = ConfigNodePropertyString();
	loglevel = ConfigNodePropertyDropDown();
	queueprocessingenabled = ConfigNodePropertyBoolean();
	packageExportertarget = ConfigNodePropertyString();
	packageImportertarget = ConfigNodePropertyString();
	requestAuthorizationStrategytarget = ConfigNodePropertyString();
	triggerstarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::~OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties()
{

}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::fromJson(std::string jsonObj)
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

    const char *queueprocessingenabledKey = "queue.processing.enabled";

    if(object.has_key(queueprocessingenabledKey))
    {
        bourne::json value = object[queueprocessingenabledKey];




        ConfigNodePropertyBoolean* obj = &queueprocessingenabled;
		obj->fromJson(value.dump());

    }

    const char *packageExportertargetKey = "packageExporter.target";

    if(object.has_key(packageExportertargetKey))
    {
        bourne::json value = object[packageExportertargetKey];




        ConfigNodePropertyString* obj = &packageExportertarget;
		obj->fromJson(value.dump());

    }

    const char *packageImportertargetKey = "packageImporter.target";

    if(object.has_key(packageImportertargetKey))
    {
        bourne::json value = object[packageImportertargetKey];




        ConfigNodePropertyString* obj = &packageImportertarget;
		obj->fromJson(value.dump());

    }

    const char *requestAuthorizationStrategytargetKey = "requestAuthorizationStrategy.target";

    if(object.has_key(requestAuthorizationStrategytargetKey))
    {
        bourne::json value = object[requestAuthorizationStrategytargetKey];




        ConfigNodePropertyString* obj = &requestAuthorizationStrategytarget;
		obj->fromJson(value.dump());

    }

    const char *triggerstargetKey = "triggers.target";

    if(object.has_key(triggerstargetKey))
    {
        bourne::json value = object[triggerstargetKey];




        ConfigNodePropertyString* obj = &triggerstarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["title"] = getTitle().toJson();






	object["details"] = getDetails().toJson();






	object["enabled"] = getEnabled().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["loglevel"] = getLoglevel().toJson();






	object["queueprocessingenabled"] = getQueueprocessingenabled().toJson();






	object["packageExportertarget"] = getPackageExportertarget().toJson();






	object["packageImportertarget"] = getPackageImportertarget().toJson();






	object["requestAuthorizationStrategytarget"] = getRequestAuthorizationStrategytarget().toJson();






	object["triggerstarget"] = getTriggerstarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setTitle(ConfigNodePropertyString title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setDetails(ConfigNodePropertyString details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setLoglevel(ConfigNodePropertyDropDown loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getPackageExportertarget()
{
	return packageExportertarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setPackageExportertarget(ConfigNodePropertyString packageExportertarget)
{
	this->packageExportertarget = packageExportertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getPackageImportertarget()
{
	return packageImportertarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setPackageImportertarget(ConfigNodePropertyString packageImportertarget)
{
	this->packageImportertarget = packageImportertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setTriggerstarget(ConfigNodePropertyString triggerstarget)
{
	this->triggerstarget = triggerstarget;
}



