

#include "ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.h"

using namespace Tiny;

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties()
{
	resourcetypes = ConfigNodePropertyArray();
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::~ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties()
{

}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resourcetypesKey = "resource.types";

    if(object.has_key(resourcetypesKey))
    {
        bourne::json value = object[resourcetypesKey];




        ConfigNodePropertyArray* obj = &resourcetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["resourcetypes"] = getResourcetypes().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::getResourcetypes()
{
	return resourcetypes;
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::setResourcetypes(ConfigNodePropertyArray resourcetypes)
{
	this->resourcetypes = resourcetypes;
}



