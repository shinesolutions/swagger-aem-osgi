

#include "OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties();
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::~OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo()
{

}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo::setProperties(OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties properties)
{
	this->properties = properties;
}



