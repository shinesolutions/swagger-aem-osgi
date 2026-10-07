

#include "ComAdobeCqSocialSyncImplDiffChangesObserverProperties.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplDiffChangesObserverProperties::ComAdobeCqSocialSyncImplDiffChangesObserverProperties()
{
	enabled = ConfigNodePropertyBoolean();
	agentName = ConfigNodePropertyString();
	diffPath = ConfigNodePropertyString();
	propertyNames = ConfigNodePropertyString();
}

ComAdobeCqSocialSyncImplDiffChangesObserverProperties::ComAdobeCqSocialSyncImplDiffChangesObserverProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplDiffChangesObserverProperties::~ComAdobeCqSocialSyncImplDiffChangesObserverProperties()
{

}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::fromJson(std::string jsonObj)
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

    const char *propertyNamesKey = "propertyNames";

    if(object.has_key(propertyNamesKey))
    {
        bourne::json value = object[propertyNamesKey];




        ConfigNodePropertyString* obj = &propertyNames;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["agentName"] = getAgentName().toJson();






	object["diffPath"] = getDiffPath().toJson();






	object["propertyNames"] = getPropertyNames().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getAgentName()
{
	return agentName;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setAgentName(ConfigNodePropertyString agentName)
{
	this->agentName = agentName;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getDiffPath()
{
	return diffPath;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setDiffPath(ConfigNodePropertyString diffPath)
{
	this->diffPath = diffPath;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getPropertyNames()
{
	return propertyNames;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setPropertyNames(ConfigNodePropertyString propertyNames)
{
	this->propertyNames = propertyNames;
}



