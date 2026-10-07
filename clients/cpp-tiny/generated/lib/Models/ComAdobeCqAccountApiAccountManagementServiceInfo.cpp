

#include "ComAdobeCqAccountApiAccountManagementServiceInfo.h"

using namespace Tiny;

ComAdobeCqAccountApiAccountManagementServiceInfo::ComAdobeCqAccountApiAccountManagementServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqAccountApiAccountManagementServiceProperties();
	additionalProperties = std::string();
	bundle_location = std::string();
	service_location = std::string();
}

ComAdobeCqAccountApiAccountManagementServiceInfo::ComAdobeCqAccountApiAccountManagementServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAccountApiAccountManagementServiceInfo::~ComAdobeCqAccountApiAccountManagementServiceInfo()
{

}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqAccountApiAccountManagementServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }

    const char *additionalPropertiesKey = "additionalProperties";

    if(object.has_key(additionalPropertiesKey))
    {
        bourne::json value = object[additionalPropertiesKey];



        jsonToValue(&additionalProperties, value, "std::string");


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
ComAdobeCqAccountApiAccountManagementServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();





    object["additionalProperties"] = getAdditionalProperties();






    object["bundle_location"] = getBundleLocation();






    object["service_location"] = getServiceLocation();



    return object;

}

std::string
ComAdobeCqAccountApiAccountManagementServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqAccountApiAccountManagementServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqAccountApiAccountManagementServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqAccountApiAccountManagementServiceProperties
ComAdobeCqAccountApiAccountManagementServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setProperties(ComAdobeCqAccountApiAccountManagementServiceProperties properties)
{
	this->properties = properties;
}

std::string
ComAdobeCqAccountApiAccountManagementServiceInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setAdditionalProperties(std::string additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
ComAdobeCqAccountApiAccountManagementServiceInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComAdobeCqAccountApiAccountManagementServiceInfo::getServiceLocation()
{
	return service_location;
}

void
ComAdobeCqAccountApiAccountManagementServiceInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



