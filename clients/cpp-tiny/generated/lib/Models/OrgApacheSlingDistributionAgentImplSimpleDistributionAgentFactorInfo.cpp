

#include "OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties();
}

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::~OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo()
{

}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo::setProperties(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties properties)
{
	this->properties = properties;
}



