

#include "OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties()
{
	enabled = ConfigNodePropertyBoolean();
	configRefResourceNames = ConfigNodePropertyArray();
	configRefPropertyNames = ConfigNodePropertyArray();
	serviceranking = ConfigNodePropertyInteger();
}

OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::~OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties()
{

}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *configRefResourceNamesKey = "configRefResourceNames";

    if(object.has_key(configRefResourceNamesKey))
    {
        bourne::json value = object[configRefResourceNamesKey];




        ConfigNodePropertyArray* obj = &configRefResourceNames;
		obj->fromJson(value.dump());

    }

    const char *configRefPropertyNamesKey = "configRefPropertyNames";

    if(object.has_key(configRefPropertyNamesKey))
    {
        bourne::json value = object[configRefPropertyNamesKey];




        ConfigNodePropertyArray* obj = &configRefPropertyNames;
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
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["configRefResourceNames"] = getConfigRefResourceNames().toJson();






	object["configRefPropertyNames"] = getConfigRefPropertyNames().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getConfigRefResourceNames()
{
	return configRefResourceNames;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames)
{
	this->configRefResourceNames = configRefResourceNames;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getConfigRefPropertyNames()
{
	return configRefPropertyNames;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames)
{
	this->configRefPropertyNames = configRefPropertyNames;
}

ConfigNodePropertyInteger
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



