

#include "ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.h"

using namespace Tiny;

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties();
	bundle_location = std::string();
	service_location = std::string();
}

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::~ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo()
{

}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties* obj = &properties;
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
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::toJson()
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
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::setProperties(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties properties)
{
	this->properties = properties;
}

std::string
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::getServiceLocation()
{
	return service_location;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



