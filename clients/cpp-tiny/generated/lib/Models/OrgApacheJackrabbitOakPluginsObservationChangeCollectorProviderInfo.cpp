

#include "OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::~OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo()
{

}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties* obj = &properties;
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
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::toJson()
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
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::setProperties(OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



