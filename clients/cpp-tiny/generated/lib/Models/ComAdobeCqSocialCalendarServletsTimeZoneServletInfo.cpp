

#include "ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.h"

using namespace Tiny;

ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::ComAdobeCqSocialCalendarServletsTimeZoneServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCalendarServletsTimeZoneServletProperties();
}

ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::ComAdobeCqSocialCalendarServletsTimeZoneServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::~ComAdobeCqSocialCalendarServletsTimeZoneServletInfo()
{

}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCalendarServletsTimeZoneServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletInfo::setProperties(ComAdobeCqSocialCalendarServletsTimeZoneServletProperties properties)
{
	this->properties = properties;
}



