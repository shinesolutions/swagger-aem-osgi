

#include "ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.h"

using namespace Tiny;

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::~ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties()
{

}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



