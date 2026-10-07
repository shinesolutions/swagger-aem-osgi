

#include "ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.h"

using namespace Tiny;

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties();
}

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::~ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo()
{

}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo::setProperties(ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties properties)
{
	this->properties = properties;
}



