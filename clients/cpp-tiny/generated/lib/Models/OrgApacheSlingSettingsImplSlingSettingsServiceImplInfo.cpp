

#include "OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo.h"

using namespace Tiny;

OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties();
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::~OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo()
{

}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo::setProperties(OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties properties)
{
	this->properties = properties;
}



