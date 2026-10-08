

#include "ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.h"

using namespace Tiny;

ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::ComAdobeCqDamCfmImplComponentComponentConfigImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamCfmImplComponentComponentConfigImplProperties();
}

ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::ComAdobeCqDamCfmImplComponentComponentConfigImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::~ComAdobeCqDamCfmImplComponentComponentConfigImplInfo()
{

}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamCfmImplComponentComponentConfigImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo::setProperties(ComAdobeCqDamCfmImplComponentComponentConfigImplProperties properties)
{
	this->properties = properties;
}



