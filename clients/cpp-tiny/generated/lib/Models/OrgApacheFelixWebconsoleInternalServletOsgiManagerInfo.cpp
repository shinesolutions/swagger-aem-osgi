

#include "OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo.h"

using namespace Tiny;

OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties();
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::~OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo()
{

}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo::setProperties(OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties properties)
{
	this->properties = properties;
}



