

#include "OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::~OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo()
{

}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties* obj = &properties;
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
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::toJson()
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
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::setProperties(OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



