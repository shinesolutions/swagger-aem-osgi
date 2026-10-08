

#include "OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.h"

using namespace Tiny;

OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::OrgApacheSlingI18nImplJcrResourceBundleProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingI18nImplJcrResourceBundleProviderProperties();
	additionalProperties = std::string();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::~OrgApacheSlingI18nImplJcrResourceBundleProviderInfo()
{

}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingI18nImplJcrResourceBundleProviderProperties* obj = &properties;
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
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::toJson()
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
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setProperties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setAdditionalProperties(std::string additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



