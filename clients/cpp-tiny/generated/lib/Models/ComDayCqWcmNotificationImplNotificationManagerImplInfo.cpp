

#include "ComDayCqWcmNotificationImplNotificationManagerImplInfo.h"

using namespace Tiny;

ComDayCqWcmNotificationImplNotificationManagerImplInfo::ComDayCqWcmNotificationImplNotificationManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmNotificationImplNotificationManagerImplProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqWcmNotificationImplNotificationManagerImplInfo::ComDayCqWcmNotificationImplNotificationManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmNotificationImplNotificationManagerImplInfo::~ComDayCqWcmNotificationImplNotificationManagerImplInfo()
{

}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmNotificationImplNotificationManagerImplProperties* obj = &properties;
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
ComDayCqWcmNotificationImplNotificationManagerImplInfo::toJson()
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
ComDayCqWcmNotificationImplNotificationManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmNotificationImplNotificationManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmNotificationImplNotificationManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmNotificationImplNotificationManagerImplProperties
ComDayCqWcmNotificationImplNotificationManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::setProperties(ComDayCqWcmNotificationImplNotificationManagerImplProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqWcmNotificationImplNotificationManagerImplInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqWcmNotificationImplNotificationManagerImplInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



