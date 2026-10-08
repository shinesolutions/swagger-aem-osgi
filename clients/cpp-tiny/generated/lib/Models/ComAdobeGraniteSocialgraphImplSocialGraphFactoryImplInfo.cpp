

#include "ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.h"

using namespace Tiny;

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties();
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::~ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo()
{

}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo::setProperties(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties properties)
{
	this->properties = properties;
}



