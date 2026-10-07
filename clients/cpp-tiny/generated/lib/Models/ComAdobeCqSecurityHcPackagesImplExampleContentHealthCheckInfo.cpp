

#include "ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.h"

using namespace Tiny;

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties();
	additionalProperties = std::string();
	bundle_location = std::string();
	service_location = std::string();
}

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::~ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo()
{

}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties* obj = &properties;
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
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::toJson()
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
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setProperties(ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties properties)
{
	this->properties = properties;
}

std::string
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setAdditionalProperties(std::string additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::getServiceLocation()
{
	return service_location;
}

void
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



