

#include "OrgApacheFelixSystemreadyImplComponentsCheckProperties.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplComponentsCheckProperties::OrgApacheFelixSystemreadyImplComponentsCheckProperties()
{
	componentslist = ConfigNodePropertyArray();
	type = ConfigNodePropertyDropDown();
}

OrgApacheFelixSystemreadyImplComponentsCheckProperties::OrgApacheFelixSystemreadyImplComponentsCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplComponentsCheckProperties::~OrgApacheFelixSystemreadyImplComponentsCheckProperties()
{

}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *componentslistKey = "components.list";

    if(object.has_key(componentslistKey))
    {
        bourne::json value = object[componentslistKey];




        ConfigNodePropertyArray* obj = &componentslist;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        ConfigNodePropertyDropDown* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixSystemreadyImplComponentsCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["componentslist"] = getComponentslist().toJson();






	object["type"] = getType().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheFelixSystemreadyImplComponentsCheckProperties::getComponentslist()
{
	return componentslist;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::setComponentslist(ConfigNodePropertyArray componentslist)
{
	this->componentslist = componentslist;
}

ConfigNodePropertyDropDown
OrgApacheFelixSystemreadyImplComponentsCheckProperties::getType()
{
	return type;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::setType(ConfigNodePropertyDropDown type)
{
	this->type = type;
}



