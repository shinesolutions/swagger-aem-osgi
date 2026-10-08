

#include "OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::OrgApacheSlingHcCoreImplCompositeHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingHcCoreImplCompositeHealthCheckProperties();
}

OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::OrgApacheSlingHcCoreImplCompositeHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::~OrgApacheSlingHcCoreImplCompositeHealthCheckInfo()
{

}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingHcCoreImplCompositeHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckInfo::setProperties(OrgApacheSlingHcCoreImplCompositeHealthCheckProperties properties)
{
	this->properties = properties;
}



