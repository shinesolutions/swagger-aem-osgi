

#include "ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties()
{
	providerName = ConfigNodePropertyString();
	forwardrequests = ConfigNodePropertyBoolean();
}

ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::~ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providerNameKey = "providerName";

    if(object.has_key(providerNameKey))
    {
        bourne::json value = object[providerNameKey];




        ConfigNodePropertyString* obj = &providerName;
		obj->fromJson(value.dump());

    }

    const char *forwardrequestsKey = "forward.requests";

    if(object.has_key(forwardrequestsKey))
    {
        bourne::json value = object[forwardrequestsKey];




        ConfigNodePropertyBoolean* obj = &forwardrequests;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerName"] = getProviderName().toJson();






	object["forwardrequests"] = getForwardrequests().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::getProviderName()
{
	return providerName;
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::setProviderName(ConfigNodePropertyString providerName)
{
	this->providerName = providerName;
}

ConfigNodePropertyBoolean
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::getForwardrequests()
{
	return forwardrequests;
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::setForwardrequests(ConfigNodePropertyBoolean forwardrequests)
{
	this->forwardrequests = forwardrequests;
}



