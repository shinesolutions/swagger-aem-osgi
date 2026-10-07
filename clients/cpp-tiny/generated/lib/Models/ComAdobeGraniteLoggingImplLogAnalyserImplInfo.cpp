

#include "ComAdobeGraniteLoggingImplLogAnalyserImplInfo.h"

using namespace Tiny;

ComAdobeGraniteLoggingImplLogAnalyserImplInfo::ComAdobeGraniteLoggingImplLogAnalyserImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteLoggingImplLogAnalyserImplProperties();
}

ComAdobeGraniteLoggingImplLogAnalyserImplInfo::ComAdobeGraniteLoggingImplLogAnalyserImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteLoggingImplLogAnalyserImplInfo::~ComAdobeGraniteLoggingImplLogAnalyserImplInfo()
{

}

void
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteLoggingImplLogAnalyserImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteLoggingImplLogAnalyserImplProperties
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplInfo::setProperties(ComAdobeGraniteLoggingImplLogAnalyserImplProperties properties)
{
	this->properties = properties;
}



