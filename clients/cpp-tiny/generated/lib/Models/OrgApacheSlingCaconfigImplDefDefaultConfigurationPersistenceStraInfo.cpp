

#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties();
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::~OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo()
{

}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo::setProperties(OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties properties)
{
	this->properties = properties;
}



