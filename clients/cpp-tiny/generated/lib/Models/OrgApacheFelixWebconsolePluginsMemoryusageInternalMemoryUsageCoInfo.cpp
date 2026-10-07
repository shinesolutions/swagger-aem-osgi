

#include "OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.h"

using namespace Tiny;

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties();
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::~OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo()
{

}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo::setProperties(OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties properties)
{
	this->properties = properties;
}



