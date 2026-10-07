

#include "ComDayCqDamCoreImplServletAssetDownloadServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletAssetDownloadServletInfo::ComDayCqDamCoreImplServletAssetDownloadServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletAssetDownloadServletProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComDayCqDamCoreImplServletAssetDownloadServletInfo::ComDayCqDamCoreImplServletAssetDownloadServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletAssetDownloadServletInfo::~ComDayCqDamCoreImplServletAssetDownloadServletInfo()
{

}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletAssetDownloadServletProperties* obj = &properties;
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
ComDayCqDamCoreImplServletAssetDownloadServletInfo::toJson()
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
ComDayCqDamCoreImplServletAssetDownloadServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletAssetDownloadServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletAssetDownloadServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletAssetDownloadServletProperties
ComDayCqDamCoreImplServletAssetDownloadServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::setProperties(ComDayCqDamCoreImplServletAssetDownloadServletProperties properties)
{
	this->properties = properties;
}

std::string
ComDayCqDamCoreImplServletAssetDownloadServletInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqDamCoreImplServletAssetDownloadServletInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



