

#include "OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties();
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::~OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo()
{

}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo::setProperties(OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties properties)
{
	this->properties = properties;
}



