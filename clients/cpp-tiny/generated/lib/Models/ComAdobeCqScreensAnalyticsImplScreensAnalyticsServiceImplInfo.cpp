

#include "ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties();
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::~ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo()
{

}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo::setProperties(ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties properties)
{
	this->properties = properties;
}



