

#include "OrgApacheSlingTracerInternalLogTracerInfo.h"

using namespace Tiny;

OrgApacheSlingTracerInternalLogTracerInfo::OrgApacheSlingTracerInternalLogTracerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingTracerInternalLogTracerProperties();
}

OrgApacheSlingTracerInternalLogTracerInfo::OrgApacheSlingTracerInternalLogTracerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingTracerInternalLogTracerInfo::~OrgApacheSlingTracerInternalLogTracerInfo()
{

}

void
OrgApacheSlingTracerInternalLogTracerInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingTracerInternalLogTracerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingTracerInternalLogTracerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingTracerInternalLogTracerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingTracerInternalLogTracerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingTracerInternalLogTracerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingTracerInternalLogTracerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingTracerInternalLogTracerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingTracerInternalLogTracerInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingTracerInternalLogTracerProperties
OrgApacheSlingTracerInternalLogTracerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingTracerInternalLogTracerInfo::setProperties(OrgApacheSlingTracerInternalLogTracerProperties properties)
{
	this->properties = properties;
}



