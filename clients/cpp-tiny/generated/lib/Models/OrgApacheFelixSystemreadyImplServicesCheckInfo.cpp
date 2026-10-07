

#include "OrgApacheFelixSystemreadyImplServicesCheckInfo.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplServicesCheckInfo::OrgApacheFelixSystemreadyImplServicesCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheFelixSystemreadyImplServicesCheckProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheFelixSystemreadyImplServicesCheckInfo::OrgApacheFelixSystemreadyImplServicesCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplServicesCheckInfo::~OrgApacheFelixSystemreadyImplServicesCheckInfo()
{

}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheFelixSystemreadyImplServicesCheckProperties* obj = &properties;
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
OrgApacheFelixSystemreadyImplServicesCheckInfo::toJson()
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
OrgApacheFelixSystemreadyImplServicesCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadyImplServicesCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadyImplServicesCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheFelixSystemreadyImplServicesCheckProperties
OrgApacheFelixSystemreadyImplServicesCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::setProperties(OrgApacheFelixSystemreadyImplServicesCheckProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheFelixSystemreadyImplServicesCheckInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheFelixSystemreadyImplServicesCheckInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheFelixSystemreadyImplServicesCheckInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



