

#include "OrgApacheFelixSystemreadyImplComponentsCheckInfo.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplComponentsCheckInfo::OrgApacheFelixSystemreadyImplComponentsCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixSystemreadyImplComponentsCheckProperties();
}

OrgApacheFelixSystemreadyImplComponentsCheckInfo::OrgApacheFelixSystemreadyImplComponentsCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplComponentsCheckInfo::~OrgApacheFelixSystemreadyImplComponentsCheckInfo()
{

}

void
OrgApacheFelixSystemreadyImplComponentsCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixSystemreadyImplComponentsCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixSystemreadyImplComponentsCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixSystemreadyImplComponentsCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadyImplComponentsCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadyImplComponentsCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixSystemreadyImplComponentsCheckProperties
OrgApacheFelixSystemreadyImplComponentsCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckInfo::setProperties(OrgApacheFelixSystemreadyImplComponentsCheckProperties properties)
{
	this->properties = properties;
}



