

#include "OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.h"

using namespace Tiny;

OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::~OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo()
{

}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo::setProperties(OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties properties)
{
	this->properties = properties;
}



