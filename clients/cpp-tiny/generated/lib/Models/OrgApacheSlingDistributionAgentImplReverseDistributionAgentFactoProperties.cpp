

#include "OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties()
{
	name = ConfigNodePropertyString();
	title = ConfigNodePropertyString();
	details = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	serviceName = ConfigNodePropertyString();
	loglevel = ConfigNodePropertyDropDown();
	queueprocessingenabled = ConfigNodePropertyBoolean();
	packageExporterendpoints = ConfigNodePropertyArray();
	pullitems = ConfigNodePropertyInteger();
	httpconntimeout = ConfigNodePropertyInteger();
	requestAuthorizationStrategytarget = ConfigNodePropertyString();
	transportSecretProvidertarget = ConfigNodePropertyString();
	packageBuildertarget = ConfigNodePropertyString();
	triggerstarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::~OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties()
{

}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::fromJson(std::string jsonObj)
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

    const char *packageExporterendpointsKey = "packageExporter.endpoints";

    if(object.has_key(packageExporterendpointsKey))
    {
        bourne::json value = object[packageExporterendpointsKey];




        ConfigNodePropertyArray* obj = &packageExporterendpoints;
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
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["title"] = getTitle().toJson();






	object["details"] = getDetails().toJson();






	object["enabled"] = getEnabled().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["loglevel"] = getLoglevel().toJson();






	object["queueprocessingenabled"] = getQueueprocessingenabled().toJson();






	object["packageExporterendpoints"] = getPackageExporterendpoints().toJson();






	object["pullitems"] = getPullitems().toJson();






	object["httpconntimeout"] = getHttpconntimeout().toJson();






	object["requestAuthorizationStrategytarget"] = getRequestAuthorizationStrategytarget().toJson();






	object["transportSecretProvidertarget"] = getTransportSecretProvidertarget().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();






	object["triggerstarget"] = getTriggerstarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setTitle(ConfigNodePropertyString title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setDetails(ConfigNodePropertyString details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setLoglevel(ConfigNodePropertyDropDown loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getPackageExporterendpoints()
{
	return packageExporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setPackageExporterendpoints(ConfigNodePropertyArray packageExporterendpoints)
{
	this->packageExporterendpoints = packageExporterendpoints;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getPullitems()
{
	return pullitems;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setPullitems(ConfigNodePropertyInteger pullitems)
{
	this->pullitems = pullitems;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getHttpconntimeout()
{
	return httpconntimeout;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setHttpconntimeout(ConfigNodePropertyInteger httpconntimeout)
{
	this->httpconntimeout = httpconntimeout;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties::setTriggerstarget(ConfigNodePropertyString triggerstarget)
{
	this->triggerstarget = triggerstarget;
}



