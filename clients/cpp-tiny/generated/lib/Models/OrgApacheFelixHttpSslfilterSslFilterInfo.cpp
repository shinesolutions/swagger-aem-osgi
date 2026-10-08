

#include "OrgApacheFelixHttpSslfilterSslFilterInfo.h"

using namespace Tiny;

OrgApacheFelixHttpSslfilterSslFilterInfo::OrgApacheFelixHttpSslfilterSslFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixHttpSslfilterSslFilterProperties();
}

OrgApacheFelixHttpSslfilterSslFilterInfo::OrgApacheFelixHttpSslfilterSslFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixHttpSslfilterSslFilterInfo::~OrgApacheFelixHttpSslfilterSslFilterInfo()
{

}

void
OrgApacheFelixHttpSslfilterSslFilterInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixHttpSslfilterSslFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixHttpSslfilterSslFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixHttpSslfilterSslFilterInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixHttpSslfilterSslFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixHttpSslfilterSslFilterInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixHttpSslfilterSslFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixHttpSslfilterSslFilterInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixHttpSslfilterSslFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixHttpSslfilterSslFilterProperties
OrgApacheFelixHttpSslfilterSslFilterInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixHttpSslfilterSslFilterInfo::setProperties(OrgApacheFelixHttpSslfilterSslFilterProperties properties)
{
	this->properties = properties;
}



