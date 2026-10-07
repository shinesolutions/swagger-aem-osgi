

#include "ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.h"

using namespace Tiny;

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::~ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo()
{

}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties* obj = &properties;
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
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::toJson()
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
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::setProperties(ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



