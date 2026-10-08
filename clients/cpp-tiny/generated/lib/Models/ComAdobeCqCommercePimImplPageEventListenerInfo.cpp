

#include "ComAdobeCqCommercePimImplPageEventListenerInfo.h"

using namespace Tiny;

ComAdobeCqCommercePimImplPageEventListenerInfo::ComAdobeCqCommercePimImplPageEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommercePimImplPageEventListenerProperties();
}

ComAdobeCqCommercePimImplPageEventListenerInfo::ComAdobeCqCommercePimImplPageEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommercePimImplPageEventListenerInfo::~ComAdobeCqCommercePimImplPageEventListenerInfo()
{

}

void
ComAdobeCqCommercePimImplPageEventListenerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommercePimImplPageEventListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommercePimImplPageEventListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommercePimImplPageEventListenerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommercePimImplPageEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommercePimImplPageEventListenerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommercePimImplPageEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommercePimImplPageEventListenerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommercePimImplPageEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommercePimImplPageEventListenerProperties
ComAdobeCqCommercePimImplPageEventListenerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommercePimImplPageEventListenerInfo::setProperties(ComAdobeCqCommercePimImplPageEventListenerProperties properties)
{
	this->properties = properties;
}



