

#include "ComDayCqCommonsServletsRootMappingServletInfo.h"

using namespace Tiny;

ComDayCqCommonsServletsRootMappingServletInfo::ComDayCqCommonsServletsRootMappingServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqCommonsServletsRootMappingServletProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqCommonsServletsRootMappingServletInfo::ComDayCqCommonsServletsRootMappingServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCommonsServletsRootMappingServletInfo::~ComDayCqCommonsServletsRootMappingServletInfo()
{

}

void
ComDayCqCommonsServletsRootMappingServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqCommonsServletsRootMappingServletProperties* obj = &properties;
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
ComDayCqCommonsServletsRootMappingServletInfo::toJson()
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
ComDayCqCommonsServletsRootMappingServletInfo::getPid()
{
	return pid;
}

void
ComDayCqCommonsServletsRootMappingServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqCommonsServletsRootMappingServletInfo::getTitle()
{
	return title;
}

void
ComDayCqCommonsServletsRootMappingServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqCommonsServletsRootMappingServletInfo::getDescription()
{
	return description;
}

void
ComDayCqCommonsServletsRootMappingServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqCommonsServletsRootMappingServletProperties
ComDayCqCommonsServletsRootMappingServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqCommonsServletsRootMappingServletInfo::setProperties(ComDayCqCommonsServletsRootMappingServletProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqCommonsServletsRootMappingServletInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqCommonsServletsRootMappingServletInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqCommonsServletsRootMappingServletInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqCommonsServletsRootMappingServletInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



