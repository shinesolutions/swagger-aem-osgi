

#include "OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties()
{
	description = ConfigNodePropertyString();
	overrides = ConfigNodePropertyArray();
	enabled = ConfigNodePropertyBoolean();
	serviceranking = ConfigNodePropertyInteger();
}

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::~OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties()
{

}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];




        ConfigNodePropertyString* obj = &description;
		obj->fromJson(value.dump());

    }

    const char *overridesKey = "overrides";

    if(object.has_key(overridesKey))
    {
        bourne::json value = object[overridesKey];




        ConfigNodePropertyArray* obj = &overrides;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["description"] = getDescription().toJson();






	object["overrides"] = getOverrides().toJson();






	object["enabled"] = getEnabled().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setDescription(ConfigNodePropertyString description)
{
	this->description = description;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getOverrides()
{
	return overrides;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setOverrides(ConfigNodePropertyArray overrides)
{
	this->overrides = overrides;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyInteger
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



