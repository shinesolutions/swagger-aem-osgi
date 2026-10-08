

#include "OrgApacheSlingEventImplEventingThreadPoolInfo.h"

using namespace Tiny;

OrgApacheSlingEventImplEventingThreadPoolInfo::OrgApacheSlingEventImplEventingThreadPoolInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingEventImplEventingThreadPoolProperties();
}

OrgApacheSlingEventImplEventingThreadPoolInfo::OrgApacheSlingEventImplEventingThreadPoolInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventImplEventingThreadPoolInfo::~OrgApacheSlingEventImplEventingThreadPoolInfo()
{

}

void
OrgApacheSlingEventImplEventingThreadPoolInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingEventImplEventingThreadPoolProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventImplEventingThreadPoolInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingEventImplEventingThreadPoolInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingEventImplEventingThreadPoolInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingEventImplEventingThreadPoolInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingEventImplEventingThreadPoolInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingEventImplEventingThreadPoolInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingEventImplEventingThreadPoolInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingEventImplEventingThreadPoolProperties
OrgApacheSlingEventImplEventingThreadPoolInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingEventImplEventingThreadPoolInfo::setProperties(OrgApacheSlingEventImplEventingThreadPoolProperties properties)
{
	this->properties = properties;
}



