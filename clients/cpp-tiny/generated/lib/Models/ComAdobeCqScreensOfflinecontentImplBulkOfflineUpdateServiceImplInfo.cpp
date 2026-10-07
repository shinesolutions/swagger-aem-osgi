

#include "ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties();
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::~ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo()
{

}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo::setProperties(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties properties)
{
	this->properties = properties;
}



