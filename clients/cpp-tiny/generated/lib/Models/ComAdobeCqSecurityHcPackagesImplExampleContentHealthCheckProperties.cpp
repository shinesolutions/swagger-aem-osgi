

#include "ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.h"

using namespace Tiny;

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::~ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties()
{

}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



