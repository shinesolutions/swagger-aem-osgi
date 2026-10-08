

#include "ComAdobeCqScreensDeviceImplDeviceServiceInfo.h"

using namespace Tiny;

ComAdobeCqScreensDeviceImplDeviceServiceInfo::ComAdobeCqScreensDeviceImplDeviceServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensDeviceImplDeviceServiceProperties();
}

ComAdobeCqScreensDeviceImplDeviceServiceInfo::ComAdobeCqScreensDeviceImplDeviceServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensDeviceImplDeviceServiceInfo::~ComAdobeCqScreensDeviceImplDeviceServiceInfo()
{

}

void
ComAdobeCqScreensDeviceImplDeviceServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensDeviceImplDeviceServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensDeviceImplDeviceServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensDeviceImplDeviceServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensDeviceImplDeviceServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensDeviceImplDeviceServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensDeviceImplDeviceServiceProperties
ComAdobeCqScreensDeviceImplDeviceServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceInfo::setProperties(ComAdobeCqScreensDeviceImplDeviceServiceProperties properties)
{
	this->properties = properties;
}



