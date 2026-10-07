

#include "OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties();
}

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::~OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo()
{

}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo::setProperties(OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties properties)
{
	this->properties = properties;
}



