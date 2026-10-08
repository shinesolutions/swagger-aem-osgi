

#include "OrgApacheSlingResourcemergerPickerOverridingInfo.h"

using namespace Tiny;

OrgApacheSlingResourcemergerPickerOverridingInfo::OrgApacheSlingResourcemergerPickerOverridingInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingResourcemergerPickerOverridingProperties();
	additionalProperties = std::string();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheSlingResourcemergerPickerOverridingInfo::OrgApacheSlingResourcemergerPickerOverridingInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingResourcemergerPickerOverridingInfo::~OrgApacheSlingResourcemergerPickerOverridingInfo()
{

}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingResourcemergerPickerOverridingProperties* obj = &properties;
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
OrgApacheSlingResourcemergerPickerOverridingInfo::toJson()
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
OrgApacheSlingResourcemergerPickerOverridingInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingResourcemergerPickerOverridingInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingResourcemergerPickerOverridingInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingResourcemergerPickerOverridingProperties
OrgApacheSlingResourcemergerPickerOverridingInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setProperties(OrgApacheSlingResourcemergerPickerOverridingProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingResourcemergerPickerOverridingInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setAdditionalProperties(std::string additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
OrgApacheSlingResourcemergerPickerOverridingInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingResourcemergerPickerOverridingInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingResourcemergerPickerOverridingInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



