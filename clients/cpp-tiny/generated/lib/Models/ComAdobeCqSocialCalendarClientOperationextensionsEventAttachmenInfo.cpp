

#include "ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.h"

using namespace Tiny;

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties();
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::~ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo()
{

}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo::setProperties(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties properties)
{
	this->properties = properties;
}



