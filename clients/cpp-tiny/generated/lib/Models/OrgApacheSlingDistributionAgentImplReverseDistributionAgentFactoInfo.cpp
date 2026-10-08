

#include "OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties();
}

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::~OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo()
{

}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo::setProperties(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties properties)
{
	this->properties = properties;
}



