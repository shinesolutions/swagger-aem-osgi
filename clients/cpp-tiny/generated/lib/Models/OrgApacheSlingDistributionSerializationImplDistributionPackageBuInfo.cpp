

#include "OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties();
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::~OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo()
{

}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo::setProperties(OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties properties)
{
	this->properties = properties;
}



