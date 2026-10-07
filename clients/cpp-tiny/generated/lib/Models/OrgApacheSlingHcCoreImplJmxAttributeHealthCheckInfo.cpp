

#include "OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties();
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::~OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo()
{

}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo::setProperties(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties properties)
{
	this->properties = properties;
}



