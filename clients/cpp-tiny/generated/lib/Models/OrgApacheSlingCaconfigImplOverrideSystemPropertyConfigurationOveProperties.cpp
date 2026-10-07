

#include "OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties()
{
	enabled = ConfigNodePropertyBoolean();
	serviceranking = ConfigNodePropertyInteger();
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::~OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties()
{

}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyInteger
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



