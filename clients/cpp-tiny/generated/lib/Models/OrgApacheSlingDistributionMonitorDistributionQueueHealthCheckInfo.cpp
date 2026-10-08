

#include "OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties();
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::~OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo()
{

}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo::setProperties(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties properties)
{
	this->properties = properties;
}



