

#include "ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.h"

using namespace Tiny;

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	dispatcheraddress = ConfigNodePropertyString();
	dispatcherfilterallowed = ConfigNodePropertyArray();
	dispatcherfilterblocked = ConfigNodePropertyArray();
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::~ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties()
{

}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *dispatcheraddressKey = "dispatcher.address";

    if(object.has_key(dispatcheraddressKey))
    {
        bourne::json value = object[dispatcheraddressKey];




        ConfigNodePropertyString* obj = &dispatcheraddress;
		obj->fromJson(value.dump());

    }

    const char *dispatcherfilterallowedKey = "dispatcher.filter.allowed";

    if(object.has_key(dispatcherfilterallowedKey))
    {
        bourne::json value = object[dispatcherfilterallowedKey];




        ConfigNodePropertyArray* obj = &dispatcherfilterallowed;
		obj->fromJson(value.dump());

    }

    const char *dispatcherfilterblockedKey = "dispatcher.filter.blocked";

    if(object.has_key(dispatcherfilterblockedKey))
    {
        bourne::json value = object[dispatcherfilterblockedKey];




        ConfigNodePropertyArray* obj = &dispatcherfilterblocked;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["dispatcheraddress"] = getDispatcheraddress().toJson();






	object["dispatcherfilterallowed"] = getDispatcherfilterallowed().toJson();






	object["dispatcherfilterblocked"] = getDispatcherfilterblocked().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getDispatcheraddress()
{
	return dispatcheraddress;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setDispatcheraddress(ConfigNodePropertyString dispatcheraddress)
{
	this->dispatcheraddress = dispatcheraddress;
}

ConfigNodePropertyArray
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getDispatcherfilterallowed()
{
	return dispatcherfilterallowed;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setDispatcherfilterallowed(ConfigNodePropertyArray dispatcherfilterallowed)
{
	this->dispatcherfilterallowed = dispatcherfilterallowed;
}

ConfigNodePropertyArray
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getDispatcherfilterblocked()
{
	return dispatcherfilterblocked;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setDispatcherfilterblocked(ConfigNodePropertyArray dispatcherfilterblocked)
{
	this->dispatcherfilterblocked = dispatcherfilterblocked;
}



