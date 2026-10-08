

#include "OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties()
{
	ignorePropertyNameRegex = ConfigNodePropertyArray();
	configCollectionPropertiesResourceNames = ConfigNodePropertyArray();
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::~OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties()
{

}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ignorePropertyNameRegexKey = "ignorePropertyNameRegex";

    if(object.has_key(ignorePropertyNameRegexKey))
    {
        bourne::json value = object[ignorePropertyNameRegexKey];




        ConfigNodePropertyArray* obj = &ignorePropertyNameRegex;
		obj->fromJson(value.dump());

    }

    const char *configCollectionPropertiesResourceNamesKey = "configCollectionPropertiesResourceNames";

    if(object.has_key(configCollectionPropertiesResourceNamesKey))
    {
        bourne::json value = object[configCollectionPropertiesResourceNamesKey];




        ConfigNodePropertyArray* obj = &configCollectionPropertiesResourceNames;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["ignorePropertyNameRegex"] = getIgnorePropertyNameRegex().toJson();






	object["configCollectionPropertiesResourceNames"] = getConfigCollectionPropertiesResourceNames().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::getIgnorePropertyNameRegex()
{
	return ignorePropertyNameRegex;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex)
{
	this->ignorePropertyNameRegex = ignorePropertyNameRegex;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::getConfigCollectionPropertiesResourceNames()
{
	return configCollectionPropertiesResourceNames;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames)
{
	this->configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
}



