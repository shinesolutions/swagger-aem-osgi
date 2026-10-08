

#include "ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties();
}

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::~ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo::setProperties(ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties properties)
{
	this->properties = properties;
}



