

#include "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties();
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo::setProperties(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties properties)
{
	this->properties = properties;
}



