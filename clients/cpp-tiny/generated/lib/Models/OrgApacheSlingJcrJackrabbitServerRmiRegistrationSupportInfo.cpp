

#include "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.h"

using namespace Tiny;

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo()
{

}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setProperties(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties properties)
{
	this->properties = properties;
}



