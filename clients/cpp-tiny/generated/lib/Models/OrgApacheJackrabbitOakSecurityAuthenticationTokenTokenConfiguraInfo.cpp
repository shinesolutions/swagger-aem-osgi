

#include "OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::~OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo()
{

}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties* obj = &properties;
		obj->fromJson(value.dump());

    }

    const char *bundle_locationKey = "bundle_location";

    if(object.has_key(bundle_locationKey))
    {
        bourne::json value = object[bundle_locationKey];



        jsonToValue(&bundle_location, value, "std::string");


    }

    const char *service_locationKey = "service_location";

    if(object.has_key(service_locationKey))
    {
        bourne::json value = object[service_locationKey];



        jsonToValue(&service_location, value, "std::string");


    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();





    object["bundle_location"] = getBundleLocation();






    object["service_location"] = getServiceLocation();



    return object;

}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::setProperties(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



