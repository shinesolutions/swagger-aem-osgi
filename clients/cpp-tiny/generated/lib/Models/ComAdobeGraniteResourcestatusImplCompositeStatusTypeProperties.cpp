

#include "ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.h"

using namespace Tiny;

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties()
{
	name = ConfigNodePropertyString();
	types = ConfigNodePropertyArray();
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::~ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties()
{

}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];




        ConfigNodePropertyArray* obj = &types;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["types"] = getTypes().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::getName()
{
	return name;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyArray
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::getTypes()
{
	return types;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::setTypes(ConfigNodePropertyArray types)
{
	this->types = types;
}



