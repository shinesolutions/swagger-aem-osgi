

#include "ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo.h"

using namespace Tiny;

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties();
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::~ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo()
{

}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo::setProperties(ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties properties)
{
	this->properties = properties;
}



