

#include "ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



