

#include "OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::~OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo()
{

}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties* obj = &properties;
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
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::toJson()
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
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::setProperties(OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



