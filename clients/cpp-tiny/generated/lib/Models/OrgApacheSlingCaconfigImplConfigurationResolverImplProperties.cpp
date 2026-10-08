

#include "OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::OrgApacheSlingCaconfigImplConfigurationResolverImplProperties()
{
	configBucketNames = ConfigNodePropertyArray();
}

OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::~OrgApacheSlingCaconfigImplConfigurationResolverImplProperties()
{

}

void
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *configBucketNamesKey = "configBucketNames";

    if(object.has_key(configBucketNamesKey))
    {
        bourne::json value = object[configBucketNamesKey];




        ConfigNodePropertyArray* obj = &configBucketNames;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["configBucketNames"] = getConfigBucketNames().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::getConfigBucketNames()
{
	return configBucketNames;
}

void
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::setConfigBucketNames(ConfigNodePropertyArray configBucketNames)
{
	this->configBucketNames = configBucketNames;
}



