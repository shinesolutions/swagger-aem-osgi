

#include "OrgApacheSlingAuthCoreImplLogoutServletInfo.h"

using namespace Tiny;

OrgApacheSlingAuthCoreImplLogoutServletInfo::OrgApacheSlingAuthCoreImplLogoutServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingAuthCoreImplLogoutServletProperties();
}

OrgApacheSlingAuthCoreImplLogoutServletInfo::OrgApacheSlingAuthCoreImplLogoutServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingAuthCoreImplLogoutServletInfo::~OrgApacheSlingAuthCoreImplLogoutServletInfo()
{

}

void
OrgApacheSlingAuthCoreImplLogoutServletInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingAuthCoreImplLogoutServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingAuthCoreImplLogoutServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingAuthCoreImplLogoutServletInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingAuthCoreImplLogoutServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingAuthCoreImplLogoutServletInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingAuthCoreImplLogoutServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingAuthCoreImplLogoutServletInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingAuthCoreImplLogoutServletInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingAuthCoreImplLogoutServletProperties
OrgApacheSlingAuthCoreImplLogoutServletInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingAuthCoreImplLogoutServletInfo::setProperties(OrgApacheSlingAuthCoreImplLogoutServletProperties properties)
{
	this->properties = properties;
}



