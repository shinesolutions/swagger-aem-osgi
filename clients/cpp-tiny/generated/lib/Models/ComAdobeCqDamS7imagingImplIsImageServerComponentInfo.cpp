

#include "ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.h"

using namespace Tiny;

ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::ComAdobeCqDamS7imagingImplIsImageServerComponentInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties();
}

ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::~ComAdobeCqDamS7imagingImplIsImageServerComponentInfo()
{

}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamS7imagingImplIsImageServerComponentProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo::setProperties(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties)
{
	this->properties = properties;
}



