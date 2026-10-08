

#include "OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties()
{
	name = ConfigNodePropertyString();
	endpoints = ConfigNodePropertyArray();
	pullitems = ConfigNodePropertyInteger();
	packageBuildertarget = ConfigNodePropertyString();
	transportSecretProvidertarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::~OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties()
{

}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::fromJson(std::string jsonObj)
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

    const char *pullitemsKey = "pull.items";

    if(object.has_key(pullitemsKey))
    {
        bourne::json value = object[pullitemsKey];




        ConfigNodePropertyInteger* obj = &pullitems;
		obj->fromJson(value.dump());

    }

    const char *packageBuildertargetKey = "packageBuilder.target";

    if(object.has_key(packageBuildertargetKey))
    {
        bourne::json value = object[packageBuildertargetKey];




        ConfigNodePropertyString* obj = &packageBuildertarget;
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
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["endpoints"] = getEndpoints().toJson();






	object["pullitems"] = getPullitems().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();






	object["transportSecretProvidertarget"] = getTransportSecretProvidertarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getEndpoints()
{
	return endpoints;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setEndpoints(ConfigNodePropertyArray endpoints)
{
	this->endpoints = endpoints;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getPullitems()
{
	return pullitems;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setPullitems(ConfigNodePropertyInteger pullitems)
{
	this->pullitems = pullitems;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}



