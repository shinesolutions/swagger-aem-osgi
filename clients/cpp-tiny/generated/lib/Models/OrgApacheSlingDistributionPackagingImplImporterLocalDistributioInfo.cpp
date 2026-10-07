

#include "OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties();
}

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::~OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo()
{

}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo::setProperties(OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties properties)
{
	this->properties = properties;
}



