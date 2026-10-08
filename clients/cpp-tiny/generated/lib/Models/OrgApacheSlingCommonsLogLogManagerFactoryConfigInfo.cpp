

#include "OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.h"

using namespace Tiny;

OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::~OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo()
{

}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo::setProperties(OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties properties)
{
	this->properties = properties;
}



