

#include "ComAdobeCqScreensImplScreensChannelPostProcessorInfo.h"

using namespace Tiny;

ComAdobeCqScreensImplScreensChannelPostProcessorInfo::ComAdobeCqScreensImplScreensChannelPostProcessorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensImplScreensChannelPostProcessorProperties();
}

ComAdobeCqScreensImplScreensChannelPostProcessorInfo::ComAdobeCqScreensImplScreensChannelPostProcessorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplScreensChannelPostProcessorInfo::~ComAdobeCqScreensImplScreensChannelPostProcessorInfo()
{

}

void
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensImplScreensChannelPostProcessorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensImplScreensChannelPostProcessorProperties
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorInfo::setProperties(ComAdobeCqScreensImplScreensChannelPostProcessorProperties properties)
{
	this->properties = properties;
}



