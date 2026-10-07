

#include "OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::OrgApacheSlingHcCoreImplScriptableHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingHcCoreImplScriptableHealthCheckProperties();
}

OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::OrgApacheSlingHcCoreImplScriptableHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::~OrgApacheSlingHcCoreImplScriptableHealthCheckInfo()
{

}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingHcCoreImplScriptableHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckInfo::setProperties(OrgApacheSlingHcCoreImplScriptableHealthCheckProperties properties)
{
	this->properties = properties;
}



