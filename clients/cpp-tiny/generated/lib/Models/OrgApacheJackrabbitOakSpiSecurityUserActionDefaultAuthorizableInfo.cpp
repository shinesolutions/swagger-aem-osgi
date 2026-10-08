

#include "OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::~OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo()
{

}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties* obj = &properties;
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
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::toJson()
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
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::setProperties(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



