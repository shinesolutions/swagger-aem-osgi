

#include "OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties();
}

OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::~OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo()
{

}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo::setProperties(OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties properties)
{
	this->properties = properties;
}



