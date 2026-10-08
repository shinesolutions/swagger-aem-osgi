

#include "OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo()
{

}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo::setProperties(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties properties)
{
	this->properties = properties;
}



