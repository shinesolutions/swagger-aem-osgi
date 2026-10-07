

#include "ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::~ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



