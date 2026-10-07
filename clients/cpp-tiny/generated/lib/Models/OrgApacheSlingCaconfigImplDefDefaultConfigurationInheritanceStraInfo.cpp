

#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties();
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::~OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo()
{

}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo::setProperties(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties properties)
{
	this->properties = properties;
}



