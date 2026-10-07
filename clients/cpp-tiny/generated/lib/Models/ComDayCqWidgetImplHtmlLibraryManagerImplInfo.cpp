

#include "ComDayCqWidgetImplHtmlLibraryManagerImplInfo.h"

using namespace Tiny;

ComDayCqWidgetImplHtmlLibraryManagerImplInfo::ComDayCqWidgetImplHtmlLibraryManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWidgetImplHtmlLibraryManagerImplProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqWidgetImplHtmlLibraryManagerImplInfo::ComDayCqWidgetImplHtmlLibraryManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWidgetImplHtmlLibraryManagerImplInfo::~ComDayCqWidgetImplHtmlLibraryManagerImplInfo()
{

}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWidgetImplHtmlLibraryManagerImplProperties* obj = &properties;
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
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::toJson()
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
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWidgetImplHtmlLibraryManagerImplProperties
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::setProperties(ComDayCqWidgetImplHtmlLibraryManagerImplProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



