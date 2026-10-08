

#include "OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties()
{
	name = ConfigNodePropertyString();
	endpoint = ConfigNodePropertyString();
	transportSecretProvidertarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::~OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties()
{

}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *endpointKey = "endpoint";

    if(object.has_key(endpointKey))
    {
        bourne::json value = object[endpointKey];




        ConfigNodePropertyString* obj = &endpoint;
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
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["endpoint"] = getEndpoint().toJson();






	object["transportSecretProvidertarget"] = getTransportSecretProvidertarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::getEndpoint()
{
	return endpoint;
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::setEndpoint(ConfigNodePropertyString endpoint)
{
	this->endpoint = endpoint;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}



