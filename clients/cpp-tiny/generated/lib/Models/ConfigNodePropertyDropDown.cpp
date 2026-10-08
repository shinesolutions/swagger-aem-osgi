

#include "ConfigNodePropertyDropDown.h"

using namespace Tiny;

ConfigNodePropertyDropDown::ConfigNodePropertyDropDown()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = ConfigNodePropertyDropDown_type();
	value = null;
	description = std::string();
}

ConfigNodePropertyDropDown::ConfigNodePropertyDropDown(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfigNodePropertyDropDown::~ConfigNodePropertyDropDown()
{

}

void
ConfigNodePropertyDropDown::fromJson(std::string jsonObj)
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




        ConfigNodePropertyDropDown_type* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];




        AnyType* obj = &value;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
ConfigNodePropertyDropDown::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["optional"] = isOptional();






    object["is_set"] = isIsSet();







	object["type"] = getType().toJson();






	object["value"] = getValue().toJson();





    object["description"] = getDescription();



    return object;

}

std::string
ConfigNodePropertyDropDown::getName()
{
	return name;
}

void
ConfigNodePropertyDropDown::setName(std::string name)
{
	this->name = name;
}

bool
ConfigNodePropertyDropDown::isOptional()
{
	return optional;
}

void
ConfigNodePropertyDropDown::setOptional(bool optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyDropDown::isIsSet()
{
	return is_set;
}

void
ConfigNodePropertyDropDown::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

ConfigNodePropertyDropDown_type
ConfigNodePropertyDropDown::getType()
{
	return type;
}

void
ConfigNodePropertyDropDown::setType(ConfigNodePropertyDropDown_type type)
{
	this->type = type;
}

AnyType
ConfigNodePropertyDropDown::getValue()
{
	return value;
}

void
ConfigNodePropertyDropDown::setValue(AnyType value)
{
	this->value = value;
}

std::string
ConfigNodePropertyDropDown::getDescription()
{
	return description;
}

void
ConfigNodePropertyDropDown::setDescription(std::string description)
{
	this->description = description;
}



