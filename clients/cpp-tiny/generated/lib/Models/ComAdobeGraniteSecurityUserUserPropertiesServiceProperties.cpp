

#include "ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.h"

using namespace Tiny;

ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::ComAdobeGraniteSecurityUserUserPropertiesServiceProperties()
{
	adaptercondition = ConfigNodePropertyString();
	graniteuserpropertiesnodetypes = ConfigNodePropertyArray();
	graniteuserpropertiesresourcetypes = ConfigNodePropertyArray();
}

ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::~ComAdobeGraniteSecurityUserUserPropertiesServiceProperties()
{

}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *adapterconditionKey = "adapter.condition";

    if(object.has_key(adapterconditionKey))
    {
        bourne::json value = object[adapterconditionKey];




        ConfigNodePropertyString* obj = &adaptercondition;
		obj->fromJson(value.dump());

    }

    const char *graniteuserpropertiesnodetypesKey = "granite.userproperties.nodetypes";

    if(object.has_key(graniteuserpropertiesnodetypesKey))
    {
        bourne::json value = object[graniteuserpropertiesnodetypesKey];




        ConfigNodePropertyArray* obj = &graniteuserpropertiesnodetypes;
		obj->fromJson(value.dump());

    }

    const char *graniteuserpropertiesresourcetypesKey = "granite.userproperties.resourcetypes";

    if(object.has_key(graniteuserpropertiesresourcetypesKey))
    {
        bourne::json value = object[graniteuserpropertiesresourcetypesKey];




        ConfigNodePropertyArray* obj = &graniteuserpropertiesresourcetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["adaptercondition"] = getAdaptercondition().toJson();






	object["graniteuserpropertiesnodetypes"] = getGraniteuserpropertiesnodetypes().toJson();






	object["graniteuserpropertiesresourcetypes"] = getGraniteuserpropertiesresourcetypes().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::getAdaptercondition()
{
	return adaptercondition;
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::setAdaptercondition(ConfigNodePropertyString adaptercondition)
{
	this->adaptercondition = adaptercondition;
}

ConfigNodePropertyArray
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::getGraniteuserpropertiesnodetypes()
{
	return graniteuserpropertiesnodetypes;
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::setGraniteuserpropertiesnodetypes(ConfigNodePropertyArray graniteuserpropertiesnodetypes)
{
	this->graniteuserpropertiesnodetypes = graniteuserpropertiesnodetypes;
}

ConfigNodePropertyArray
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::getGraniteuserpropertiesresourcetypes()
{
	return graniteuserpropertiesresourcetypes;
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::setGraniteuserpropertiesresourcetypes(ConfigNodePropertyArray graniteuserpropertiesresourcetypes)
{
	this->graniteuserpropertiesresourcetypes = graniteuserpropertiesresourcetypes;
}



