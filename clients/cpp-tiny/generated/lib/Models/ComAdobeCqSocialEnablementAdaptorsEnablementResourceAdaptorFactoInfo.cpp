

#include "ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.h"

using namespace Tiny;

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties();
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::~ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo()
{

}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo::setProperties(ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties properties)
{
	this->properties = properties;
}



