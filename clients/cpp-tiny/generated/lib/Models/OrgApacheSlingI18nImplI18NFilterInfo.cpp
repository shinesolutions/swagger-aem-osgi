

#include "OrgApacheSlingI18nImplI18NFilterInfo.h"

using namespace Tiny;

OrgApacheSlingI18nImplI18NFilterInfo::OrgApacheSlingI18nImplI18NFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingI18nImplI18NFilterProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheSlingI18nImplI18NFilterInfo::OrgApacheSlingI18nImplI18NFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingI18nImplI18NFilterInfo::~OrgApacheSlingI18nImplI18NFilterInfo()
{

}

void
OrgApacheSlingI18nImplI18NFilterInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingI18nImplI18NFilterProperties* obj = &properties;
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
OrgApacheSlingI18nImplI18NFilterInfo::toJson()
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
OrgApacheSlingI18nImplI18NFilterInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingI18nImplI18NFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingI18nImplI18NFilterInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingI18nImplI18NFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingI18nImplI18NFilterInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingI18nImplI18NFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingI18nImplI18NFilterProperties
OrgApacheSlingI18nImplI18NFilterInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingI18nImplI18NFilterInfo::setProperties(OrgApacheSlingI18nImplI18NFilterProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingI18nImplI18NFilterInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingI18nImplI18NFilterInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingI18nImplI18NFilterInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingI18nImplI18NFilterInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



