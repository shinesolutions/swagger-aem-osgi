

#include "ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.h"

using namespace Tiny;

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	webserveraddress = ConfigNodePropertyString();
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::~ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties()
{

}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *webserveraddressKey = "webserver.address";

    if(object.has_key(webserveraddressKey))
    {
        bourne::json value = object[webserveraddressKey];




        ConfigNodePropertyString* obj = &webserveraddress;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["webserveraddress"] = getWebserveraddress().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::getWebserveraddress()
{
	return webserveraddress;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::setWebserveraddress(ConfigNodePropertyString webserveraddress)
{
	this->webserveraddress = webserveraddress;
}



