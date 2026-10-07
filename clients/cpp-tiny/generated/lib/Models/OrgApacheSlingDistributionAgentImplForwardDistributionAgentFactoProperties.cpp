

#include "OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties()
{
	name = ConfigNodePropertyString();
	title = ConfigNodePropertyString();
	details = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	serviceName = ConfigNodePropertyString();
	loglevel = ConfigNodePropertyDropDown();
	allowedroots = ConfigNodePropertyArray();
	queueprocessingenabled = ConfigNodePropertyBoolean();
	packageImporterendpoints = ConfigNodePropertyArray();
	passiveQueues = ConfigNodePropertyArray();
	priorityQueues = ConfigNodePropertyArray();
	retrystrategy = ConfigNodePropertyDropDown();
	retryattempts = ConfigNodePropertyInteger();
	requestAuthorizationStrategytarget = ConfigNodePropertyString();
	transportSecretProvidertarget = ConfigNodePropertyString();
	packageBuildertarget = ConfigNodePropertyString();
	triggerstarget = ConfigNodePropertyString();
	queueprovider = ConfigNodePropertyDropDown();
	asyncdelivery = ConfigNodePropertyBoolean();
	httpconntimeout = ConfigNodePropertyInteger();
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::~OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties()
{

}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::fromJson(std::string jsonObj)
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

    const char *queueprocessingenabledKey = "queue.processing.enabled";

    if(object.has_key(queueprocessingenabledKey))
    {
        bourne::json value = object[queueprocessingenabledKey];




        ConfigNodePropertyBoolean* obj = &queueprocessingenabled;
		obj->fromJson(value.dump());

    }

    const char *packageImporterendpointsKey = "packageImporter.endpoints";

    if(object.has_key(packageImporterendpointsKey))
    {
        bourne::json value = object[packageImporterendpointsKey];




        ConfigNodePropertyArray* obj = &packageImporterendpoints;
		obj->fromJson(value.dump());

    }

    const char *passiveQueuesKey = "passiveQueues";

    if(object.has_key(passiveQueuesKey))
    {
        bourne::json value = object[passiveQueuesKey];




        ConfigNodePropertyArray* obj = &passiveQueues;
		obj->fromJson(value.dump());

    }

    const char *priorityQueuesKey = "priorityQueues";

    if(object.has_key(priorityQueuesKey))
    {
        bourne::json value = object[priorityQueuesKey];




        ConfigNodePropertyArray* obj = &priorityQueues;
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

    const char *queueproviderKey = "queue.provider";

    if(object.has_key(queueproviderKey))
    {
        bourne::json value = object[queueproviderKey];




        ConfigNodePropertyDropDown* obj = &queueprovider;
		obj->fromJson(value.dump());

    }

    const char *asyncdeliveryKey = "async.delivery";

    if(object.has_key(asyncdeliveryKey))
    {
        bourne::json value = object[asyncdeliveryKey];




        ConfigNodePropertyBoolean* obj = &asyncdelivery;
		obj->fromJson(value.dump());

    }

    const char *httpconntimeoutKey = "http.conn.timeout";

    if(object.has_key(httpconntimeoutKey))
    {
        bourne::json value = object[httpconntimeoutKey];




        ConfigNodePropertyInteger* obj = &httpconntimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["title"] = getTitle().toJson();






	object["details"] = getDetails().toJson();






	object["enabled"] = getEnabled().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["loglevel"] = getLoglevel().toJson();






	object["allowedroots"] = getAllowedroots().toJson();






	object["queueprocessingenabled"] = getQueueprocessingenabled().toJson();






	object["packageImporterendpoints"] = getPackageImporterendpoints().toJson();






	object["passiveQueues"] = getPassiveQueues().toJson();






	object["priorityQueues"] = getPriorityQueues().toJson();






	object["retrystrategy"] = getRetrystrategy().toJson();






	object["retryattempts"] = getRetryattempts().toJson();






	object["requestAuthorizationStrategytarget"] = getRequestAuthorizationStrategytarget().toJson();






	object["transportSecretProvidertarget"] = getTransportSecretProvidertarget().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();






	object["triggerstarget"] = getTriggerstarget().toJson();






	object["queueprovider"] = getQueueprovider().toJson();






	object["asyncdelivery"] = getAsyncdelivery().toJson();






	object["httpconntimeout"] = getHttpconntimeout().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setTitle(ConfigNodePropertyString title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setDetails(ConfigNodePropertyString details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setLoglevel(ConfigNodePropertyDropDown loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getAllowedroots()
{
	return allowedroots;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setAllowedroots(ConfigNodePropertyArray allowedroots)
{
	this->allowedroots = allowedroots;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPackageImporterendpoints()
{
	return packageImporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPackageImporterendpoints(ConfigNodePropertyArray packageImporterendpoints)
{
	this->packageImporterendpoints = packageImporterendpoints;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPassiveQueues()
{
	return passiveQueues;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPassiveQueues(ConfigNodePropertyArray passiveQueues)
{
	this->passiveQueues = passiveQueues;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPriorityQueues()
{
	return priorityQueues;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPriorityQueues(ConfigNodePropertyArray priorityQueues)
{
	this->priorityQueues = priorityQueues;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getRetrystrategy()
{
	return retrystrategy;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setRetrystrategy(ConfigNodePropertyDropDown retrystrategy)
{
	this->retrystrategy = retrystrategy;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getRetryattempts()
{
	return retryattempts;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setRetryattempts(ConfigNodePropertyInteger retryattempts)
{
	this->retryattempts = retryattempts;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setTriggerstarget(ConfigNodePropertyString triggerstarget)
{
	this->triggerstarget = triggerstarget;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getQueueprovider()
{
	return queueprovider;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setQueueprovider(ConfigNodePropertyDropDown queueprovider)
{
	this->queueprovider = queueprovider;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getAsyncdelivery()
{
	return asyncdelivery;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setAsyncdelivery(ConfigNodePropertyBoolean asyncdelivery)
{
	this->asyncdelivery = asyncdelivery;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getHttpconntimeout()
{
	return httpconntimeout;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setHttpconntimeout(ConfigNodePropertyInteger httpconntimeout)
{
	this->httpconntimeout = httpconntimeout;
}



