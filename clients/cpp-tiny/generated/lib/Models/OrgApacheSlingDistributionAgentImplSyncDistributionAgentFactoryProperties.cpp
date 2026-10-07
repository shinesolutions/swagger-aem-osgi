

#include "OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties()
{
	name = ConfigNodePropertyString();
	title = ConfigNodePropertyString();
	details = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	serviceName = ConfigNodePropertyString();
	loglevel = ConfigNodePropertyDropDown();
	queueprocessingenabled = ConfigNodePropertyBoolean();
	passiveQueues = ConfigNodePropertyArray();
	packageExporterendpoints = ConfigNodePropertyArray();
	packageImporterendpoints = ConfigNodePropertyArray();
	retrystrategy = ConfigNodePropertyDropDown();
	retryattempts = ConfigNodePropertyInteger();
	pullitems = ConfigNodePropertyInteger();
	httpconntimeout = ConfigNodePropertyInteger();
	requestAuthorizationStrategytarget = ConfigNodePropertyString();
	transportSecretProvidertarget = ConfigNodePropertyString();
	packageBuildertarget = ConfigNodePropertyString();
	triggerstarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::~OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties()
{

}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::fromJson(std::string jsonObj)
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

    const char *passiveQueuesKey = "passiveQueues";

    if(object.has_key(passiveQueuesKey))
    {
        bourne::json value = object[passiveQueuesKey];




        ConfigNodePropertyArray* obj = &passiveQueues;
		obj->fromJson(value.dump());

    }

    const char *packageExporterendpointsKey = "packageExporter.endpoints";

    if(object.has_key(packageExporterendpointsKey))
    {
        bourne::json value = object[packageExporterendpointsKey];




        ConfigNodePropertyArray* obj = &packageExporterendpoints;
		obj->fromJson(value.dump());

    }

    const char *packageImporterendpointsKey = "packageImporter.endpoints";

    if(object.has_key(packageImporterendpointsKey))
    {
        bourne::json value = object[packageImporterendpointsKey];




        ConfigNodePropertyArray* obj = &packageImporterendpoints;
		obj->fromJson(value.dump());

    }

    const char *retrystrategyKey = "retry.strategy";

    if(object.has_key(retrystrategyKey))
    {
        bourne::json value = object[retrystrategyKey];




        ConfigNodePropertyDropDown* obj = &retrystrategy;
		obj->fromJson(value.dump());

    }

    const char *retryattemptsKey = "retry.attempts";

    if(object.has_key(retryattemptsKey))
    {
        bourne::json value = object[retryattemptsKey];




        ConfigNodePropertyInteger* obj = &retryattempts;
		obj->fromJson(value.dump());

    }

    const char *pullitemsKey = "pull.items";

    if(object.has_key(pullitemsKey))
    {
        bourne::json value = object[pullitemsKey];




        ConfigNodePropertyInteger* obj = &pullitems;
		obj->fromJson(value.dump());

    }

    const char *httpconntimeoutKey = "http.conn.timeout";

    if(object.has_key(httpconntimeoutKey))
    {
        bourne::json value = object[httpconntimeoutKey];




        ConfigNodePropertyInteger* obj = &httpconntimeout;
		obj->fromJson(value.dump());

    }

    const char *requestAuthorizationStrategytargetKey = "requestAuthorizationStrategy.target";

    if(object.has_key(requestAuthorizationStrategytargetKey))
    {
        bourne::json value = object[requestAuthorizationStrategytargetKey];




        ConfigNodePropertyString* obj = &requestAuthorizationStrategytarget;
		obj->fromJson(value.dump());

    }

    const char *transportSecretProvidertargetKey = "transportSecretProvider.target";

    if(object.has_key(transportSecretProvidertargetKey))
    {
        bourne::json value = object[transportSecretProvidertargetKey];




        ConfigNodePropertyString* obj = &transportSecretProvidertarget;
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


}

bourne::json
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["title"] = getTitle().toJson();






	object["details"] = getDetails().toJson();






	object["enabled"] = getEnabled().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["loglevel"] = getLoglevel().toJson();






	object["queueprocessingenabled"] = getQueueprocessingenabled().toJson();






	object["passiveQueues"] = getPassiveQueues().toJson();






	object["packageExporterendpoints"] = getPackageExporterendpoints().toJson();






	object["packageImporterendpoints"] = getPackageImporterendpoints().toJson();






	object["retrystrategy"] = getRetrystrategy().toJson();






	object["retryattempts"] = getRetryattempts().toJson();






	object["pullitems"] = getPullitems().toJson();






	object["httpconntimeout"] = getHttpconntimeout().toJson();






	object["requestAuthorizationStrategytarget"] = getRequestAuthorizationStrategytarget().toJson();






	object["transportSecretProvidertarget"] = getTransportSecretProvidertarget().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();






	object["triggerstarget"] = getTriggerstarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setTitle(ConfigNodePropertyString title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setDetails(ConfigNodePropertyString details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setLoglevel(ConfigNodePropertyDropDown loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPassiveQueues()
{
	return passiveQueues;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPassiveQueues(ConfigNodePropertyArray passiveQueues)
{
	this->passiveQueues = passiveQueues;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPackageExporterendpoints()
{
	return packageExporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPackageExporterendpoints(ConfigNodePropertyArray packageExporterendpoints)
{
	this->packageExporterendpoints = packageExporterendpoints;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPackageImporterendpoints()
{
	return packageImporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPackageImporterendpoints(ConfigNodePropertyArray packageImporterendpoints)
{
	this->packageImporterendpoints = packageImporterendpoints;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getRetrystrategy()
{
	return retrystrategy;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setRetrystrategy(ConfigNodePropertyDropDown retrystrategy)
{
	this->retrystrategy = retrystrategy;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getRetryattempts()
{
	return retryattempts;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setRetryattempts(ConfigNodePropertyInteger retryattempts)
{
	this->retryattempts = retryattempts;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPullitems()
{
	return pullitems;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPullitems(ConfigNodePropertyInteger pullitems)
{
	this->pullitems = pullitems;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getHttpconntimeout()
{
	return httpconntimeout;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setHttpconntimeout(ConfigNodePropertyInteger httpconntimeout)
{
	this->httpconntimeout = httpconntimeout;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setTriggerstarget(ConfigNodePropertyString triggerstarget)
{
	this->triggerstarget = triggerstarget;
}



