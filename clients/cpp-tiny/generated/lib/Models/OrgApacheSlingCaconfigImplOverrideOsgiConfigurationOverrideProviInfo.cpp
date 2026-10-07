

#include "OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties();
}

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::~OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo()
{

}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo::setProperties(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties properties)
{
	this->properties = properties;
}



