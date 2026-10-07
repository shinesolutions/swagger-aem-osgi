

#include "OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties();
}

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::~OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo()
{

}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo::setProperties(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties properties)
{
	this->properties = properties;
}



