

#include "OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::~OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo()
{

}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo::setProperties(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties properties)
{
	this->properties = properties;
}



