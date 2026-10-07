

#include "OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.h"

using namespace Tiny;

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties();
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::~OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo()
{

}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo::setProperties(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties properties)
{
	this->properties = properties;
}



