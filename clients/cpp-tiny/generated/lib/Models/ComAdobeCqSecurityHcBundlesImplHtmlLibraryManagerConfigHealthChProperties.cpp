

#include "ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.h"

using namespace Tiny;

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::~ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties()
{

}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



