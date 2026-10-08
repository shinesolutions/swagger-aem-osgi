

#include "OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.h"

using namespace Tiny;

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties();
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::~OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo()
{

}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo::setProperties(OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties properties)
{
	this->properties = properties;
}



