

#include "ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties()
{
	numberofretriesallowed = ConfigNodePropertyInteger();
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::~ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties()
{

}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *numberofretriesallowedKey = "number.of.retries.allowed";

    if(object.has_key(numberofretriesallowedKey))
    {
        bourne::json value = object[numberofretriesallowedKey];




        ConfigNodePropertyInteger* obj = &numberofretriesallowed;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["numberofretriesallowed"] = getNumberofretriesallowed().toJson();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::getNumberofretriesallowed()
{
	return numberofretriesallowed;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::setNumberofretriesallowed(ConfigNodePropertyInteger numberofretriesallowed)
{
	this->numberofretriesallowed = numberofretriesallowed;
}

ConfigNodePropertyArray
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



