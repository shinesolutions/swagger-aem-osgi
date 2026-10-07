

#include "ConfigNodePropertyDropDown_type.h"

using namespace Tiny;

ConfigNodePropertyDropDown_type::ConfigNodePropertyDropDown_type()
{
	labels = null;
	values = null;
}

ConfigNodePropertyDropDown_type::ConfigNodePropertyDropDown_type(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfigNodePropertyDropDown_type::~ConfigNodePropertyDropDown_type()
{

}

void
ConfigNodePropertyDropDown_type::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *labelsKey = "labels";

    if(object.has_key(labelsKey))
    {
        bourne::json value = object[labelsKey];




        AnyType* obj = &labels;
		obj->fromJson(value.dump());

    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];




        AnyType* obj = &values;
		obj->fromJson(value.dump());

    }


}

bourne::json
ConfigNodePropertyDropDown_type::toJson()
{
    bourne::json object = bourne::json::object();






	object["labels"] = getLabels().toJson();






	object["values"] = getValues().toJson();


    return object;

}

AnyType
ConfigNodePropertyDropDown_type::getLabels()
{
	return labels;
}

void
ConfigNodePropertyDropDown_type::setLabels(AnyType labels)
{
	this->labels = labels;
}

AnyType
ConfigNodePropertyDropDown_type::getValues()
{
	return values;
}

void
ConfigNodePropertyDropDown_type::setValues(AnyType values)
{
	this->values = values;
}



