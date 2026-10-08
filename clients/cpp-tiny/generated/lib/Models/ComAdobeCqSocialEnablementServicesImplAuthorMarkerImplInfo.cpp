

#include "ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::~ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo()
{

}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties* obj = &properties;
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
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::toJson()
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
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::setProperties(ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties properties)
{
	this->properties = properties;
}

std::string
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::getServiceLocation()
{
	return service_location;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



