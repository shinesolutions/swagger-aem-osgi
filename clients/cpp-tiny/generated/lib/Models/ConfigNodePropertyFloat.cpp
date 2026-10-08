

#include "ConfigNodePropertyFloat.h"

using namespace Tiny;

ConfigNodePropertyFloat::ConfigNodePropertyFloat()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	value = float(0);
	description = std::string();
}

ConfigNodePropertyFloat::ConfigNodePropertyFloat(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfigNodePropertyFloat::~ConfigNodePropertyFloat()
{

}

void
ConfigNodePropertyFloat::fromJson(std::string jsonObj)
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



        jsonToValue(&value, value, "long");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
ConfigNodePropertyFloat::toJson()
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
ConfigNodePropertyFloat::getName()
{
	return name;
}

void
ConfigNodePropertyFloat::setName(std::string name)
{
	this->name = name;
}

bool
ConfigNodePropertyFloat::isOptional()
{
	return optional;
}

void
ConfigNodePropertyFloat::setOptional(bool optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyFloat::isIsSet()
{
	return is_set;
}

void
ConfigNodePropertyFloat::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
ConfigNodePropertyFloat::getType()
{
	return type;
}

void
ConfigNodePropertyFloat::setType(int type)
{
	this->type = type;
}

long
ConfigNodePropertyFloat::getValue()
{
	return value;
}

void
ConfigNodePropertyFloat::setValue(long value)
{
	this->value = value;
}

std::string
ConfigNodePropertyFloat::getDescription()
{
	return description;
}

void
ConfigNodePropertyFloat::setDescription(std::string description)
{
	this->description = description;
}



