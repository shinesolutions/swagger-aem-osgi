

#include "OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties();
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::~OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo()
{

}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo::setProperties(OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties properties)
{
	this->properties = properties;
}



