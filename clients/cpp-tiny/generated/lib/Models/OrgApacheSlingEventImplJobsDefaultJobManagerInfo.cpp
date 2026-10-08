

#include "OrgApacheSlingEventImplJobsDefaultJobManagerInfo.h"

using namespace Tiny;

OrgApacheSlingEventImplJobsDefaultJobManagerInfo::OrgApacheSlingEventImplJobsDefaultJobManagerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
}

OrgApacheSlingEventImplJobsDefaultJobManagerInfo::OrgApacheSlingEventImplJobsDefaultJobManagerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventImplJobsDefaultJobManagerInfo::~OrgApacheSlingEventImplJobsDefaultJobManagerInfo()
{

}

void
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingEventImplJobsDefaultJobManagerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingEventImplJobsDefaultJobManagerProperties
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerInfo::setProperties(OrgApacheSlingEventImplJobsDefaultJobManagerProperties properties)
{
	this->properties = properties;
}



