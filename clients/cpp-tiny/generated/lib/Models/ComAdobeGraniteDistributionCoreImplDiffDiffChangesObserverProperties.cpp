

#include "ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties()
{
	enabled = ConfigNodePropertyBoolean();
	agentName = ConfigNodePropertyString();
	diffPath = ConfigNodePropertyString();
	observedPath = ConfigNodePropertyString();
	serviceName = ConfigNodePropertyString();
	propertyNames = ConfigNodePropertyString();
	distributionDelay = ConfigNodePropertyInteger();
	serviceUsertarget = ConfigNodePropertyString();
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::~ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *agentNameKey = "agentName";

    if(object.has_key(agentNameKey))
    {
        bourne::json value = object[agentNameKey];




        ConfigNodePropertyString* obj = &agentName;
		obj->fromJson(value.dump());

    }

    const char *diffPathKey = "diffPath";

    if(object.has_key(diffPathKey))
    {
        bourne::json value = object[diffPathKey];




        ConfigNodePropertyString* obj = &diffPath;
		obj->fromJson(value.dump());

    }

    const char *observedPathKey = "observedPath";

    if(object.has_key(observedPathKey))
    {
        bourne::json value = object[observedPathKey];




        ConfigNodePropertyString* obj = &observedPath;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }

    const char *propertyNamesKey = "propertyNames";

    if(object.has_key(propertyNamesKey))
    {
        bourne::json value = object[propertyNamesKey];




        ConfigNodePropertyString* obj = &propertyNames;
		obj->fromJson(value.dump());

    }

    const char *distributionDelayKey = "distributionDelay";

    if(object.has_key(distributionDelayKey))
    {
        bourne::json value = object[distributionDelayKey];




        ConfigNodePropertyInteger* obj = &distributionDelay;
		obj->fromJson(value.dump());

    }

    const char *serviceUsertargetKey = "serviceUser.target";

    if(object.has_key(serviceUsertargetKey))
    {
        bourne::json value = object[serviceUsertargetKey];




        ConfigNodePropertyString* obj = &serviceUsertarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["agentName"] = getAgentName().toJson();






	object["diffPath"] = getDiffPath().toJson();






	object["observedPath"] = getObservedPath().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["propertyNames"] = getPropertyNames().toJson();






	object["distributionDelay"] = getDistributionDelay().toJson();






	object["serviceUsertarget"] = getServiceUsertarget().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getAgentName()
{
	return agentName;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setAgentName(ConfigNodePropertyString agentName)
{
	this->agentName = agentName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getDiffPath()
{
	return diffPath;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setDiffPath(ConfigNodePropertyString diffPath)
{
	this->diffPath = diffPath;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getObservedPath()
{
	return observedPath;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setObservedPath(ConfigNodePropertyString observedPath)
{
	this->observedPath = observedPath;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getServiceName()
{
	return serviceName;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getPropertyNames()
{
	return propertyNames;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setPropertyNames(ConfigNodePropertyString propertyNames)
{
	this->propertyNames = propertyNames;
}

ConfigNodePropertyInteger
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getDistributionDelay()
{
	return distributionDelay;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setDistributionDelay(ConfigNodePropertyInteger distributionDelay)
{
	this->distributionDelay = distributionDelay;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getServiceUsertarget()
{
	return serviceUsertarget;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setServiceUsertarget(ConfigNodePropertyString serviceUsertarget)
{
	this->serviceUsertarget = serviceUsertarget;
}



