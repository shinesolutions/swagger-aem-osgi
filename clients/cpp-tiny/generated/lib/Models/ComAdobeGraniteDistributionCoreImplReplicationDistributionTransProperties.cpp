

#include "ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties()
{
	forwardrequests = ConfigNodePropertyBoolean();
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::~ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *forwardrequestsKey = "forward.requests";

    if(object.has_key(forwardrequestsKey))
    {
        bourne::json value = object[forwardrequestsKey];




        ConfigNodePropertyBoolean* obj = &forwardrequests;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["forwardrequests"] = getForwardrequests().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::getForwardrequests()
{
	return forwardrequests;
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::setForwardrequests(ConfigNodePropertyBoolean forwardrequests)
{
	this->forwardrequests = forwardrequests;
}



