

#include "OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties();
}

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::~OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo()
{

}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo::setProperties(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties properties)
{
	this->properties = properties;
}



