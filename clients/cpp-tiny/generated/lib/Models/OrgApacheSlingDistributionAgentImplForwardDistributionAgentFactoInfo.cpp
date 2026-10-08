

#include "OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties();
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::~OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo()
{

}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo::setProperties(OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties properties)
{
	this->properties = properties;
}



