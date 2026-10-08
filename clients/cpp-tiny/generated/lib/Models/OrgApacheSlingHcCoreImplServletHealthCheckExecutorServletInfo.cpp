

#include "OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties();
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::~OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo()
{

}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo::setProperties(OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties properties)
{
	this->properties = properties;
}



