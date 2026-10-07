

#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo()
{

}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties* obj = &properties;
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
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::toJson()
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
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::setProperties(OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



