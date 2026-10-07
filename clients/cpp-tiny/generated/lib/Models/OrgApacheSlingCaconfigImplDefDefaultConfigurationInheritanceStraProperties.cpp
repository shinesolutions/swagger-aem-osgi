

#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
{
	enabled = ConfigNodePropertyBoolean();
	configPropertyInheritancePropertyNames = ConfigNodePropertyArray();
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::~OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
{

}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *configPropertyInheritancePropertyNamesKey = "configPropertyInheritancePropertyNames";

    if(object.has_key(configPropertyInheritancePropertyNamesKey))
    {
        bourne::json value = object[configPropertyInheritancePropertyNamesKey];




        ConfigNodePropertyArray* obj = &configPropertyInheritancePropertyNames;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["configPropertyInheritancePropertyNames"] = getConfigPropertyInheritancePropertyNames().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::getConfigPropertyInheritancePropertyNames()
{
	return configPropertyInheritancePropertyNames;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames)
{
	this->configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
}



