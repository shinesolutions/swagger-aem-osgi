

#include "ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.h"

using namespace Tiny;

ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::ComAdobeGraniteThreaddumpThreadDumpCollectorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteThreaddumpThreadDumpCollectorProperties();
}

ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::ComAdobeGraniteThreaddumpThreadDumpCollectorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::~ComAdobeGraniteThreaddumpThreadDumpCollectorInfo()
{

}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteThreaddumpThreadDumpCollectorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorInfo::setProperties(ComAdobeGraniteThreaddumpThreadDumpCollectorProperties properties)
{
	this->properties = properties;
}



