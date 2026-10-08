

#include "OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties()
{
	name = ConfigNodePropertyString();
	endpoints = ConfigNodePropertyArray();
	transportSecretProvidertarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::~OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties()
{

}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *endpointsKey = "endpoints";

    if(object.has_key(endpointsKey))
    {
        bourne::json value = object[endpointsKey];




        ConfigNodePropertyArray* obj = &endpoints;
		obj->fromJson(value.dump());

    }

    const char *transportSecretProvidertargetKey = "transportSecretProvider.target";

    if(object.has_key(transportSecretProvidertargetKey))
    {
        bourne::json value = object[transportSecretProvidertargetKey];




        ConfigNodePropertyString* obj = &transportSecretProvidertarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["endpoints"] = getEndpoints().toJson();






	object["transportSecretProvidertarget"] = getTransportSecretProvidertarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::getEndpoints()
{
	return endpoints;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::setEndpoints(ConfigNodePropertyArray endpoints)
{
	this->endpoints = endpoints;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}



