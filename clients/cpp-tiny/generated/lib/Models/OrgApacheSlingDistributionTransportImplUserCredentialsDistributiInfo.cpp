

#include "OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties();
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::~OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo()
{

}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo::setProperties(OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties properties)
{
	this->properties = properties;
}



