

#include "ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::~ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo()
{

}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties* obj = &properties;
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
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::toJson()
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
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::setProperties(ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



