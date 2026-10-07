

#include "ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties();
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::~ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo::setProperties(ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties properties)
{
	this->properties = properties;
}



