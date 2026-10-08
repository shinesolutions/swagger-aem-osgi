

#include "OrgApacheFelixSystemreadySystemReadyMonitorInfo.h"

using namespace Tiny;

OrgApacheFelixSystemreadySystemReadyMonitorInfo::OrgApacheFelixSystemreadySystemReadyMonitorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixSystemreadySystemReadyMonitorProperties();
}

OrgApacheFelixSystemreadySystemReadyMonitorInfo::OrgApacheFelixSystemreadySystemReadyMonitorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadySystemReadyMonitorInfo::~OrgApacheFelixSystemreadySystemReadyMonitorInfo()
{

}

void
OrgApacheFelixSystemreadySystemReadyMonitorInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixSystemreadySystemReadyMonitorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixSystemreadySystemReadyMonitorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixSystemreadySystemReadyMonitorInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadySystemReadyMonitorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadySystemReadyMonitorInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadySystemReadyMonitorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadySystemReadyMonitorInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadySystemReadyMonitorInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixSystemreadySystemReadyMonitorProperties
OrgApacheFelixSystemreadySystemReadyMonitorInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadySystemReadyMonitorInfo::setProperties(OrgApacheFelixSystemreadySystemReadyMonitorProperties properties)
{
	this->properties = properties;
}



