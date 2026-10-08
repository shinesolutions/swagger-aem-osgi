

#include "ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.h"

using namespace Tiny;

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties();
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::~ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo()
{

}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo::setProperties(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties properties)
{
	this->properties = properties;
}



