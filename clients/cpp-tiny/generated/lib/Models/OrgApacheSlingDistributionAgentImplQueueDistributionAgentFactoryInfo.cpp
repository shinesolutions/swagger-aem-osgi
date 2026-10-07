

#include "OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties();
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::~OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo()
{

}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo::setProperties(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties properties)
{
	this->properties = properties;
}



