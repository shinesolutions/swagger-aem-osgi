

#include "OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties();
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::~OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo()
{

}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo::setProperties(OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties properties)
{
	this->properties = properties;
}



