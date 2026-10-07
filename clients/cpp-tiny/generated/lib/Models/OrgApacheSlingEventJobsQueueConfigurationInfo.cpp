

#include "OrgApacheSlingEventJobsQueueConfigurationInfo.h"

using namespace Tiny;

OrgApacheSlingEventJobsQueueConfigurationInfo::OrgApacheSlingEventJobsQueueConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingEventJobsQueueConfigurationProperties();
}

OrgApacheSlingEventJobsQueueConfigurationInfo::OrgApacheSlingEventJobsQueueConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventJobsQueueConfigurationInfo::~OrgApacheSlingEventJobsQueueConfigurationInfo()
{

}

void
OrgApacheSlingEventJobsQueueConfigurationInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingEventJobsQueueConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventJobsQueueConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingEventJobsQueueConfigurationInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingEventJobsQueueConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingEventJobsQueueConfigurationInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingEventJobsQueueConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingEventJobsQueueConfigurationInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingEventJobsQueueConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingEventJobsQueueConfigurationProperties
OrgApacheSlingEventJobsQueueConfigurationInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingEventJobsQueueConfigurationInfo::setProperties(OrgApacheSlingEventJobsQueueConfigurationProperties properties)
{
	this->properties = properties;
}



