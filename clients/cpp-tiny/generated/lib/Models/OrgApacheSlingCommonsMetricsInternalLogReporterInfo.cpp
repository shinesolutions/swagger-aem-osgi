

#include "OrgApacheSlingCommonsMetricsInternalLogReporterInfo.h"

using namespace Tiny;

OrgApacheSlingCommonsMetricsInternalLogReporterInfo::OrgApacheSlingCommonsMetricsInternalLogReporterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCommonsMetricsInternalLogReporterProperties();
}

OrgApacheSlingCommonsMetricsInternalLogReporterInfo::OrgApacheSlingCommonsMetricsInternalLogReporterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsMetricsInternalLogReporterInfo::~OrgApacheSlingCommonsMetricsInternalLogReporterInfo()
{

}

void
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCommonsMetricsInternalLogReporterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCommonsMetricsInternalLogReporterProperties
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterInfo::setProperties(OrgApacheSlingCommonsMetricsInternalLogReporterProperties properties)
{
	this->properties = properties;
}



