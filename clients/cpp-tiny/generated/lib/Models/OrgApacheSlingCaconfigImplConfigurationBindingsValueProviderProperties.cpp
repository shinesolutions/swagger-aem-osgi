

#include "OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::~OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties()
{

}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::fromJson(std::string jsonObj)
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
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



