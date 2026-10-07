

#include "OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties();
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::~OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo()
{

}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo::setProperties(OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties properties)
{
	this->properties = properties;
}



