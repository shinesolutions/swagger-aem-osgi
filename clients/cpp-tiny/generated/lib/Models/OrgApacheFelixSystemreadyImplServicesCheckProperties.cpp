

#include "OrgApacheFelixSystemreadyImplServicesCheckProperties.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplServicesCheckProperties::OrgApacheFelixSystemreadyImplServicesCheckProperties()
{
	serviceslist = ConfigNodePropertyArray();
	type = ConfigNodePropertyDropDown();
}

OrgApacheFelixSystemreadyImplServicesCheckProperties::OrgApacheFelixSystemreadyImplServicesCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplServicesCheckProperties::~OrgApacheFelixSystemreadyImplServicesCheckProperties()
{

}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *serviceslistKey = "services.list";

    if(object.has_key(serviceslistKey))
    {
        bourne::json value = object[serviceslistKey];




        ConfigNodePropertyArray* obj = &serviceslist;
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
OrgApacheFelixSystemreadyImplServicesCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceslist"] = getServiceslist().toJson();






	object["type"] = getType().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheFelixSystemreadyImplServicesCheckProperties::getServiceslist()
{
	return serviceslist;
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::setServiceslist(ConfigNodePropertyArray serviceslist)
{
	this->serviceslist = serviceslist;
}

ConfigNodePropertyDropDown
OrgApacheFelixSystemreadyImplServicesCheckProperties::getType()
{
	return type;
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::setType(ConfigNodePropertyDropDown type)
{
	this->type = type;
}



