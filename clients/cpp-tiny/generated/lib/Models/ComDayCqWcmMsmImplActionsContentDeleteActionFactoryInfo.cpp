

#include "ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::~ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo()
{

}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties* obj = &properties;
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
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::toJson()
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
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::setProperties(ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



