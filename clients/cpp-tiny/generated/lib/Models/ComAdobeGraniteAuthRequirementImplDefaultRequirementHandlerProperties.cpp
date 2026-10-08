

#include "ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties()
{
	supportedPaths = ConfigNodePropertyArray();
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::~ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties()
{

}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *supportedPathsKey = "supportedPaths";

    if(object.has_key(supportedPathsKey))
    {
        bourne::json value = object[supportedPathsKey];




        ConfigNodePropertyArray* obj = &supportedPaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["supportedPaths"] = getSupportedPaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::getSupportedPaths()
{
	return supportedPaths;
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::setSupportedPaths(ConfigNodePropertyArray supportedPaths)
{
	this->supportedPaths = supportedPaths;
}



