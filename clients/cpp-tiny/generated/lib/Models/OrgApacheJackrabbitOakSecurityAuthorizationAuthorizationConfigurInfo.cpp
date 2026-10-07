

#include "OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::~OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo()
{

}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties* obj = &properties;
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
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::toJson()
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
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::setProperties(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



