

#include "OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.h"

using namespace Tiny;

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::~OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo()
{

}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties* obj = &properties;
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
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::toJson()
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
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::setProperties(OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



