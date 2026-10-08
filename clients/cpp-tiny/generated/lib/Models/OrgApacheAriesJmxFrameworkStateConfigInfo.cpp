

#include "OrgApacheAriesJmxFrameworkStateConfigInfo.h"

using namespace Tiny;

OrgApacheAriesJmxFrameworkStateConfigInfo::OrgApacheAriesJmxFrameworkStateConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheAriesJmxFrameworkStateConfigProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheAriesJmxFrameworkStateConfigInfo::OrgApacheAriesJmxFrameworkStateConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheAriesJmxFrameworkStateConfigInfo::~OrgApacheAriesJmxFrameworkStateConfigInfo()
{

}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::fromJson(std::string jsonObj)
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




        OrgApacheAriesJmxFrameworkStateConfigProperties* obj = &properties;
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
OrgApacheAriesJmxFrameworkStateConfigInfo::toJson()
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
OrgApacheAriesJmxFrameworkStateConfigInfo::getPid()
{
	return pid;
}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheAriesJmxFrameworkStateConfigInfo::getTitle()
{
	return title;
}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheAriesJmxFrameworkStateConfigInfo::getDescription()
{
	return description;
}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheAriesJmxFrameworkStateConfigProperties
OrgApacheAriesJmxFrameworkStateConfigInfo::getProperties()
{
	return properties;
}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::setProperties(OrgApacheAriesJmxFrameworkStateConfigProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheAriesJmxFrameworkStateConfigInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheAriesJmxFrameworkStateConfigInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheAriesJmxFrameworkStateConfigInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



