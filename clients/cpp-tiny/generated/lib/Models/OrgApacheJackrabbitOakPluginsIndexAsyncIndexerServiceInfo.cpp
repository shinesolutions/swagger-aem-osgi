

#include "OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::~OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo()
{

}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties* obj = &properties;
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
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::toJson()
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
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::setProperties(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



