

#include "ConfigNodePropertyString.h"

using namespace Tiny;

ConfigNodePropertyString::ConfigNodePropertyString()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	value = std::string();
	description = std::string();
}

ConfigNodePropertyString::ConfigNodePropertyString(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfigNodePropertyString::~ConfigNodePropertyString()
{

}

void
ConfigNodePropertyString::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *optionalKey = "optional";

    if(object.has_key(optionalKey))
    {
        bourne::json value = object[optionalKey];



        jsonToValue(&optional, value, "bool");


    }

    const char *is_setKey = "is_set";

    if(object.has_key(is_setKey))
    {
        bourne::json value = object[is_setKey];



        jsonToValue(&is_set, value, "bool");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "int");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
ConfigNodePropertyString::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["optional"] = isOptional();






    object["is_set"] = isIsSet();






    object["type"] = getType();






    object["value"] = getValue();






    object["description"] = getDescription();



    return object;

}

std::string
ConfigNodePropertyString::getName()
{
	return name;
}

void
ConfigNodePropertyString::setName(std::string name)
{
	this->name = name;
}

bool
ConfigNodePropertyString::isOptional()
{
	return optional;
}

void
ConfigNodePropertyString::setOptional(bool optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyString::isIsSet()
{
	return is_set;
}

void
ConfigNodePropertyString::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
ConfigNodePropertyString::getType()
{
	return type;
}

void
ConfigNodePropertyString::setType(int type)
{
	this->type = type;
}

std::string
ConfigNodePropertyString::getValue()
{
	return value;
}

void
ConfigNodePropertyString::setValue(std::string value)
{
	this->value = value;
}

std::string
ConfigNodePropertyString::getDescription()
{
	return description;
}

void
ConfigNodePropertyString::setDescription(std::string description)
{
	this->description = description;
}



