

#include "OrgApacheFelixScrScrServiceInfo.h"

using namespace Tiny;

OrgApacheFelixScrScrServiceInfo::OrgApacheFelixScrScrServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixScrScrServiceProperties();
}

OrgApacheFelixScrScrServiceInfo::OrgApacheFelixScrScrServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixScrScrServiceInfo::~OrgApacheFelixScrScrServiceInfo()
{

}

void
OrgApacheFelixScrScrServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixScrScrServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixScrScrServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixScrScrServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixScrScrServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixScrScrServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixScrScrServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixScrScrServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixScrScrServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixScrScrServiceProperties
OrgApacheFelixScrScrServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixScrScrServiceInfo::setProperties(OrgApacheFelixScrScrServiceProperties properties)
{
	this->properties = properties;
}



