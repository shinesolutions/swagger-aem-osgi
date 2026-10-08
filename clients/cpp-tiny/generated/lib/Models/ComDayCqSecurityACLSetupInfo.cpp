

#include "ComDayCqSecurityACLSetupInfo.h"

using namespace Tiny;

ComDayCqSecurityACLSetupInfo::ComDayCqSecurityACLSetupInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqSecurityACLSetupProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqSecurityACLSetupInfo::ComDayCqSecurityACLSetupInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSecurityACLSetupInfo::~ComDayCqSecurityACLSetupInfo()
{

}

void
ComDayCqSecurityACLSetupInfo::fromJson(std::string jsonObj)
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




        ComDayCqSecurityACLSetupProperties* obj = &properties;
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
ComDayCqSecurityACLSetupInfo::toJson()
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
ComDayCqSecurityACLSetupInfo::getPid()
{
	return pid;
}

void
ComDayCqSecurityACLSetupInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqSecurityACLSetupInfo::getTitle()
{
	return title;
}

void
ComDayCqSecurityACLSetupInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqSecurityACLSetupInfo::getDescription()
{
	return description;
}

void
ComDayCqSecurityACLSetupInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqSecurityACLSetupProperties
ComDayCqSecurityACLSetupInfo::getProperties()
{
	return properties;
}

void
ComDayCqSecurityACLSetupInfo::setProperties(ComDayCqSecurityACLSetupProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqSecurityACLSetupInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqSecurityACLSetupInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqSecurityACLSetupInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqSecurityACLSetupInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



