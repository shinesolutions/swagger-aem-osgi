

#include "ConfigNodePropertyArray.h"

using namespace Tiny;

ConfigNodePropertyArray::ConfigNodePropertyArray()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	values = std::list<std::string>();
	description = std::string();
}

ConfigNodePropertyArray::ConfigNodePropertyArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfigNodePropertyArray::~ConfigNodePropertyArray()
{

}

void
ConfigNodePropertyArray::fromJson(std::string jsonObj)
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

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<std::string> values_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            values_list.push_back(element);
        }
        values = values_list;


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
ConfigNodePropertyArray::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["optional"] = isOptional();






    object["is_set"] = isIsSet();






    object["type"] = getType();





    std::list<std::string> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        values_arr.append(var);
    }
    object["values"] = values_arr;









    object["description"] = getDescription();



    return object;

}

std::string
ConfigNodePropertyArray::getName()
{
	return name;
}

void
ConfigNodePropertyArray::setName(std::string name)
{
	this->name = name;
}

bool
ConfigNodePropertyArray::isOptional()
{
	return optional;
}

void
ConfigNodePropertyArray::setOptional(bool optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyArray::isIsSet()
{
	return is_set;
}

void
ConfigNodePropertyArray::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
ConfigNodePropertyArray::getType()
{
	return type;
}

void
ConfigNodePropertyArray::setType(int type)
{
	this->type = type;
}

std::list<std::string>
ConfigNodePropertyArray::getValues()
{
	return values;
}

void
ConfigNodePropertyArray::setValues(std::list<std::string> values)
{
	this->values = values;
}

std::string
ConfigNodePropertyArray::getDescription()
{
	return description;
}

void
ConfigNodePropertyArray::setDescription(std::string description)
{
	this->description = description;
}



