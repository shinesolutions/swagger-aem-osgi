

#include "ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.h"

using namespace Tiny;

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::~ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo()
{

}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo::setProperties(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties properties)
{
	this->properties = properties;
}



