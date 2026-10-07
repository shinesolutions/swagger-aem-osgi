

#include "OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::~OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo()
{

}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties* obj = &properties;
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
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::toJson()
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
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::setProperties(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



