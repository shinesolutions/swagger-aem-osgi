

#include "ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.h"

using namespace Tiny;

ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::~ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo()
{

}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo::setProperties(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties properties)
{
	this->properties = properties;
}



