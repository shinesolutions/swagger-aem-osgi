

#include "OrgApacheSlingHapiImplHApiUtilImplInfo.h"

using namespace Tiny;

OrgApacheSlingHapiImplHApiUtilImplInfo::OrgApacheSlingHapiImplHApiUtilImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingHapiImplHApiUtilImplProperties();
}

OrgApacheSlingHapiImplHApiUtilImplInfo::OrgApacheSlingHapiImplHApiUtilImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHapiImplHApiUtilImplInfo::~OrgApacheSlingHapiImplHApiUtilImplInfo()
{

}

void
OrgApacheSlingHapiImplHApiUtilImplInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingHapiImplHApiUtilImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHapiImplHApiUtilImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingHapiImplHApiUtilImplInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingHapiImplHApiUtilImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingHapiImplHApiUtilImplInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingHapiImplHApiUtilImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingHapiImplHApiUtilImplInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingHapiImplHApiUtilImplInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingHapiImplHApiUtilImplProperties
OrgApacheSlingHapiImplHApiUtilImplInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingHapiImplHApiUtilImplInfo::setProperties(OrgApacheSlingHapiImplHApiUtilImplProperties properties)
{
	this->properties = properties;
}



