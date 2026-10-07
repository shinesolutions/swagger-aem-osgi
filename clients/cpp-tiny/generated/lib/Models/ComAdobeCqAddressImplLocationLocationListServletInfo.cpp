

#include "ComAdobeCqAddressImplLocationLocationListServletInfo.h"

using namespace Tiny;

ComAdobeCqAddressImplLocationLocationListServletInfo::ComAdobeCqAddressImplLocationLocationListServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqAddressImplLocationLocationListServletProperties();
}

ComAdobeCqAddressImplLocationLocationListServletInfo::ComAdobeCqAddressImplLocationLocationListServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAddressImplLocationLocationListServletInfo::~ComAdobeCqAddressImplLocationLocationListServletInfo()
{

}

void
ComAdobeCqAddressImplLocationLocationListServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqAddressImplLocationLocationListServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAddressImplLocationLocationListServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqAddressImplLocationLocationListServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqAddressImplLocationLocationListServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqAddressImplLocationLocationListServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqAddressImplLocationLocationListServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqAddressImplLocationLocationListServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqAddressImplLocationLocationListServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqAddressImplLocationLocationListServletProperties
ComAdobeCqAddressImplLocationLocationListServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqAddressImplLocationLocationListServletInfo::setProperties(ComAdobeCqAddressImplLocationLocationListServletProperties properties)
{
	this->properties = properties;
}



