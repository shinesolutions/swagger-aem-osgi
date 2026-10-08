

#include "ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



