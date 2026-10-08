

#include "ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::~ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo()
{

}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties* obj = &properties;
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
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::toJson()
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
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setProperties(ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



