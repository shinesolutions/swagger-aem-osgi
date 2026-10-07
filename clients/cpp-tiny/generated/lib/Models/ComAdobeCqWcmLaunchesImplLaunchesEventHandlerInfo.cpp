

#include "ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.h"

using namespace Tiny;

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::~ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo()
{

}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo::setProperties(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties properties)
{
	this->properties = properties;
}



