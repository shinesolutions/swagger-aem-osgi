

#include "OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::~OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo()
{

}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo::setProperties(OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties properties)
{
	this->properties = properties;
}



