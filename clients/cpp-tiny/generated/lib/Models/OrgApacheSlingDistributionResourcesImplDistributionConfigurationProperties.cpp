

#include "OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties()
{
	providerroots = ConfigNodePropertyString();
	kind = ConfigNodePropertyString();
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::~OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties()
{

}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providerrootsKey = "provider.roots";

    if(object.has_key(providerrootsKey))
    {
        bourne::json value = object[providerrootsKey];




        ConfigNodePropertyString* obj = &providerroots;
		obj->fromJson(value.dump());

    }

    const char *kindKey = "kind";

    if(object.has_key(kindKey))
    {
        bourne::json value = object[kindKey];




        ConfigNodePropertyString* obj = &kind;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerroots"] = getProviderroots().toJson();






	object["kind"] = getKind().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::getProviderroots()
{
	return providerroots;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::setProviderroots(ConfigNodePropertyString providerroots)
{
	this->providerroots = providerroots;
}

ConfigNodePropertyString
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::getKind()
{
	return kind;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::setKind(ConfigNodePropertyString kind)
{
	this->kind = kind;
}



