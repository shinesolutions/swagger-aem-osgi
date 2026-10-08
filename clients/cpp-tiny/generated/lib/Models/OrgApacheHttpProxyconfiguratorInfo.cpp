

#include "OrgApacheHttpProxyconfiguratorInfo.h"

using namespace Tiny;

OrgApacheHttpProxyconfiguratorInfo::OrgApacheHttpProxyconfiguratorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheHttpProxyconfiguratorProperties();
}

OrgApacheHttpProxyconfiguratorInfo::OrgApacheHttpProxyconfiguratorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheHttpProxyconfiguratorInfo::~OrgApacheHttpProxyconfiguratorInfo()
{

}

void
OrgApacheHttpProxyconfiguratorInfo::fromJson(std::string jsonObj)
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




        OrgApacheHttpProxyconfiguratorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheHttpProxyconfiguratorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheHttpProxyconfiguratorInfo::getPid()
{
	return pid;
}

void
OrgApacheHttpProxyconfiguratorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheHttpProxyconfiguratorInfo::getTitle()
{
	return title;
}

void
OrgApacheHttpProxyconfiguratorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheHttpProxyconfiguratorInfo::getDescription()
{
	return description;
}

void
OrgApacheHttpProxyconfiguratorInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheHttpProxyconfiguratorProperties
OrgApacheHttpProxyconfiguratorInfo::getProperties()
{
	return properties;
}

void
OrgApacheHttpProxyconfiguratorInfo::setProperties(OrgApacheHttpProxyconfiguratorProperties properties)
{
	this->properties = properties;
}



