

#include "OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.h"

using namespace Tiny;

OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties();
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::~OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo()
{

}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo::setProperties(OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties properties)
{
	this->properties = properties;
}



