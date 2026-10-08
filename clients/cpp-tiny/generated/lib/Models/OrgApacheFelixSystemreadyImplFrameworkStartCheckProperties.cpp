

#include "OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties()
{
	timeout = ConfigNodePropertyInteger();
	targetstartlevel = ConfigNodePropertyInteger();
	targetstartlevelpropname = ConfigNodePropertyString();
	type = ConfigNodePropertyDropDown();
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::~OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties()
{

}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *timeoutKey = "timeout";

    if(object.has_key(timeoutKey))
    {
        bourne::json value = object[timeoutKey];




        ConfigNodePropertyInteger* obj = &timeout;
		obj->fromJson(value.dump());

    }

    const char *targetstartlevelKey = "target.start.level";

    if(object.has_key(targetstartlevelKey))
    {
        bourne::json value = object[targetstartlevelKey];




        ConfigNodePropertyInteger* obj = &targetstartlevel;
		obj->fromJson(value.dump());

    }

    const char *targetstartlevelpropnameKey = "target.start.level.prop.name";

    if(object.has_key(targetstartlevelpropnameKey))
    {
        bourne::json value = object[targetstartlevelpropnameKey];




        ConfigNodePropertyString* obj = &targetstartlevelpropname;
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
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["timeout"] = getTimeout().toJson();






	object["targetstartlevel"] = getTargetstartlevel().toJson();






	object["targetstartlevelpropname"] = getTargetstartlevelpropname().toJson();






	object["type"] = getType().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getTimeout()
{
	return timeout;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setTimeout(ConfigNodePropertyInteger timeout)
{
	this->timeout = timeout;
}

ConfigNodePropertyInteger
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getTargetstartlevel()
{
	return targetstartlevel;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setTargetstartlevel(ConfigNodePropertyInteger targetstartlevel)
{
	this->targetstartlevel = targetstartlevel;
}

ConfigNodePropertyString
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getTargetstartlevelpropname()
{
	return targetstartlevelpropname;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setTargetstartlevelpropname(ConfigNodePropertyString targetstartlevelpropname)
{
	this->targetstartlevelpropname = targetstartlevelpropname;
}

ConfigNodePropertyDropDown
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getType()
{
	return type;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setType(ConfigNodePropertyDropDown type)
{
	this->type = type;
}



