

#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo::setProperties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties properties)
{
	this->properties = properties;
}



