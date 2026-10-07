

#include "OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties();
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::~OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo()
{

}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setProperties(OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties properties)
{
	this->properties = properties;
}



