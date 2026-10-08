

#include "ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties();
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::~ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo()
{

}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo::setProperties(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties properties)
{
	this->properties = properties;
}



