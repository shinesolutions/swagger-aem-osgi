

#include "ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.h"

using namespace Tiny;

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties();
	additionalProperties = std::string();
	bundle_location = std::string();
	service_location = std::string();
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::~ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo()
{

}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties* obj = &properties;
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
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::toJson()
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
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setProperties(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties properties)
{
	this->properties = properties;
}

std::string
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setAdditionalProperties(std::string additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::getServiceLocation()
{
	return service_location;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



