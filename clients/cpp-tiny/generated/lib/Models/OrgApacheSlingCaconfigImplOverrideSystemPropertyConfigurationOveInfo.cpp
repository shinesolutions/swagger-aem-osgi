

#include "OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties();
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::~OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo()
{

}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo::setProperties(OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties properties)
{
	this->properties = properties;
}



