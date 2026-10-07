

#include "ComAdobeCqProjectsImplServletProjectImageServletInfo.h"

using namespace Tiny;

ComAdobeCqProjectsImplServletProjectImageServletInfo::ComAdobeCqProjectsImplServletProjectImageServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqProjectsImplServletProjectImageServletProperties();
}

ComAdobeCqProjectsImplServletProjectImageServletInfo::ComAdobeCqProjectsImplServletProjectImageServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqProjectsImplServletProjectImageServletInfo::~ComAdobeCqProjectsImplServletProjectImageServletInfo()
{

}

void
ComAdobeCqProjectsImplServletProjectImageServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqProjectsImplServletProjectImageServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqProjectsImplServletProjectImageServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqProjectsImplServletProjectImageServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqProjectsImplServletProjectImageServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqProjectsImplServletProjectImageServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqProjectsImplServletProjectImageServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqProjectsImplServletProjectImageServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqProjectsImplServletProjectImageServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqProjectsImplServletProjectImageServletProperties
ComAdobeCqProjectsImplServletProjectImageServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqProjectsImplServletProjectImageServletInfo::setProperties(ComAdobeCqProjectsImplServletProjectImageServletProperties properties)
{
	this->properties = properties;
}



