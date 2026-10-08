

#include "OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties();
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::~OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo()
{

}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo::setProperties(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties properties)
{
	this->properties = properties;
}



