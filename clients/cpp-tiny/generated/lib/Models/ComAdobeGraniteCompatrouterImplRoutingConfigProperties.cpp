

#include "ComAdobeGraniteCompatrouterImplRoutingConfigProperties.h"

using namespace Tiny;

ComAdobeGraniteCompatrouterImplRoutingConfigProperties::ComAdobeGraniteCompatrouterImplRoutingConfigProperties()
{
	id = ConfigNodePropertyString();
	compatPath = ConfigNodePropertyString();
	newPath = ConfigNodePropertyString();
}

ComAdobeGraniteCompatrouterImplRoutingConfigProperties::ComAdobeGraniteCompatrouterImplRoutingConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCompatrouterImplRoutingConfigProperties::~ComAdobeGraniteCompatrouterImplRoutingConfigProperties()
{

}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];




        ConfigNodePropertyString* obj = &id;
		obj->fromJson(value.dump());

    }

    const char *compatPathKey = "compatPath";

    if(object.has_key(compatPathKey))
    {
        bourne::json value = object[compatPathKey];




        ConfigNodePropertyString* obj = &compatPath;
		obj->fromJson(value.dump());

    }

    const char *newPathKey = "newPath";

    if(object.has_key(newPathKey))
    {
        bourne::json value = object[newPathKey];




        ConfigNodePropertyString* obj = &newPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["id"] = getId().toJson();






	object["compatPath"] = getCompatPath().toJson();






	object["newPath"] = getNewPath().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::getId()
{
	return id;
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::setId(ConfigNodePropertyString id)
{
	this->id = id;
}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::getCompatPath()
{
	return compatPath;
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::setCompatPath(ConfigNodePropertyString compatPath)
{
	this->compatPath = compatPath;
}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::getNewPath()
{
	return newPath;
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::setNewPath(ConfigNodePropertyString newPath)
{
	this->newPath = newPath;
}



