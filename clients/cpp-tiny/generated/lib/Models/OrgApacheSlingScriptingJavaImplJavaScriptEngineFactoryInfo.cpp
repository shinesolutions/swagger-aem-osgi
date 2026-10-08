

#include "OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::~OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo()
{

}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties* obj = &properties;
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
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::toJson()
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
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::setProperties(OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



