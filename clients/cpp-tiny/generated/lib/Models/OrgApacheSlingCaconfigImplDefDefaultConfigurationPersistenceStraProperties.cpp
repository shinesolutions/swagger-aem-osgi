

#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::~OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties()
{

}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



