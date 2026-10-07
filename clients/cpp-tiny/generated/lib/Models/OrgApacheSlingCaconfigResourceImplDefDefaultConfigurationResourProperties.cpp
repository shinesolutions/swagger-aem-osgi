

#include "OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
{
	enabled = ConfigNodePropertyBoolean();
	configPath = ConfigNodePropertyString();
	fallbackPaths = ConfigNodePropertyArray();
	configCollectionInheritancePropertyNames = ConfigNodePropertyArray();
}

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::~OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
{

}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *configPathKey = "configPath";

    if(object.has_key(configPathKey))
    {
        bourne::json value = object[configPathKey];




        ConfigNodePropertyString* obj = &configPath;
		obj->fromJson(value.dump());

    }

    const char *fallbackPathsKey = "fallbackPaths";

    if(object.has_key(fallbackPathsKey))
    {
        bourne::json value = object[fallbackPathsKey];




        ConfigNodePropertyArray* obj = &fallbackPaths;
		obj->fromJson(value.dump());

    }

    const char *configCollectionInheritancePropertyNamesKey = "configCollectionInheritancePropertyNames";

    if(object.has_key(configCollectionInheritancePropertyNamesKey))
    {
        bourne::json value = object[configCollectionInheritancePropertyNamesKey];




        ConfigNodePropertyArray* obj = &configCollectionInheritancePropertyNames;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["configPath"] = getConfigPath().toJson();






	object["fallbackPaths"] = getFallbackPaths().toJson();






	object["configCollectionInheritancePropertyNames"] = getConfigCollectionInheritancePropertyNames().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigPath()
{
	return configPath;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigPath(ConfigNodePropertyString configPath)
{
	this->configPath = configPath;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getFallbackPaths()
{
	return fallbackPaths;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setFallbackPaths(ConfigNodePropertyArray fallbackPaths)
{
	this->fallbackPaths = fallbackPaths;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigCollectionInheritancePropertyNames()
{
	return configCollectionInheritancePropertyNames;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames)
{
	this->configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
}



