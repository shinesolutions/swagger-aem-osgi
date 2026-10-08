

#include "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.h"

using namespace Tiny;

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo()
{

}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo::setProperties(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties properties)
{
	this->properties = properties;
}



