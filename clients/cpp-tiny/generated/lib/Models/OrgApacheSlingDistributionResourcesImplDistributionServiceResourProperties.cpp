

#include "OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties()
{
	providerroots = ConfigNodePropertyString();
	kind = ConfigNodePropertyString();
}

OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::~OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties()
{

}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::fromJson(std::string jsonObj)
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
OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerroots"] = getProviderroots().toJson();






	object["kind"] = getKind().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::getProviderroots()
{
	return providerroots;
}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::setProviderroots(ConfigNodePropertyString providerroots)
{
	this->providerroots = providerroots;
}

ConfigNodePropertyString
OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::getKind()
{
	return kind;
}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties::setKind(ConfigNodePropertyString kind)
{
	this->kind = kind;
}



