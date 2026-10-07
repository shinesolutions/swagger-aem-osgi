

#include "ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.h"

using namespace Tiny;

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::ComAdobeFormsCommonServiceImplDefaultDataProviderProperties()
{
	alloweddataFileLocations = ConfigNodePropertyArray();
}

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::~ComAdobeFormsCommonServiceImplDefaultDataProviderProperties()
{

}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *alloweddataFileLocationsKey = "alloweddataFileLocations";

    if(object.has_key(alloweddataFileLocationsKey))
    {
        bourne::json value = object[alloweddataFileLocationsKey];




        ConfigNodePropertyArray* obj = &alloweddataFileLocations;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["alloweddataFileLocations"] = getAlloweddataFileLocations().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::getAlloweddataFileLocations()
{
	return alloweddataFileLocations;
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::setAlloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations)
{
	this->alloweddataFileLocations = alloweddataFileLocations;
}



