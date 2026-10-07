

#include "ConfigNodePropertyBoolean.h"

using namespace Tiny;

ConfigNodePropertyBoolean::ConfigNodePropertyBoolean()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	value = bool(false);
	description = std::string();
}

ConfigNodePropertyBoolean::ConfigNodePropertyBoolean(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfigNodePropertyBoolean::~ConfigNodePropertyBoolean()
{

}

void
ConfigNodePropertyBoolean::fromJson(std::string jsonObj)
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



        jsonToValue(&value, value, "bool");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
ConfigNodePropertyBoolean::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["optional"] = isOptional();






    object["is_set"] = isIsSet();






    object["type"] = getType();






    object["value"] = isValue();






    object["description"] = getDescription();



    return object;

}

std::string
ConfigNodePropertyBoolean::getName()
{
	return name;
}

void
ConfigNodePropertyBoolean::setName(std::string name)
{
	this->name = name;
}

bool
ConfigNodePropertyBoolean::isOptional()
{
	return optional;
}

void
ConfigNodePropertyBoolean::setOptional(bool optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyBoolean::isIsSet()
{
	return is_set;
}

void
ConfigNodePropertyBoolean::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
ConfigNodePropertyBoolean::getType()
{
	return type;
}

void
ConfigNodePropertyBoolean::setType(int type)
{
	this->type = type;
}

bool
ConfigNodePropertyBoolean::isValue()
{
	return value;
}

void
ConfigNodePropertyBoolean::setValue(bool value)
{
	this->value = value;
}

std::string
ConfigNodePropertyBoolean::getDescription()
{
	return description;
}

void
ConfigNodePropertyBoolean::setDescription(std::string description)
{
	this->description = description;
}



