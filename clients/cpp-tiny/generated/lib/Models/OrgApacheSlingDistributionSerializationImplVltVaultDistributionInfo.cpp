

#include "OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties();
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::~OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo()
{

}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo::setProperties(OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties properties)
{
	this->properties = properties;
}



