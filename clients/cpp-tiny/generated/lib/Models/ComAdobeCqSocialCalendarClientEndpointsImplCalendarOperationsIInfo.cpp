

#include "ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.h"

using namespace Tiny;

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties();
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::~ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo()
{

}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo::setProperties(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties properties)
{
	this->properties = properties;
}



