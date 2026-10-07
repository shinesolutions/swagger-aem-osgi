

#include "ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties();
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::~ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo()
{

}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo::setProperties(ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties properties)
{
	this->properties = properties;
}



