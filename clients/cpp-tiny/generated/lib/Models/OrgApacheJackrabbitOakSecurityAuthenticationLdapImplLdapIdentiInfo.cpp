

#include "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo()
{

}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setProperties(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties properties)
{
	this->properties = properties;
}



