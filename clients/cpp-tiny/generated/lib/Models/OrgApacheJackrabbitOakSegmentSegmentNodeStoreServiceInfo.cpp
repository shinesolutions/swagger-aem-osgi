

#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties();
	additionalProperties = std::string();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo()
{

}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties* obj = &properties;
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
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::toJson()
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
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setProperties(OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setAdditionalProperties(std::string additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



