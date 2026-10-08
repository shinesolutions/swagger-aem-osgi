

#include "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.h"

using namespace Tiny;

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties();
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo()
{

}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo::setProperties(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties properties)
{
	this->properties = properties;
}



