

#include "ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::~ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties()
{

}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



