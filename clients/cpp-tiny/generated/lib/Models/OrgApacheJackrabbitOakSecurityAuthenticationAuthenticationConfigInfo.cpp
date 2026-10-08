

#include "OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties();
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::~OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo()
{

}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo::setProperties(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties properties)
{
	this->properties = properties;
}



