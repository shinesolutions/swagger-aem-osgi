

#include "ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.h"

using namespace Tiny;

ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::ComAdobeCqDamCfmImplConfFeatureConfigImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamCfmImplConfFeatureConfigImplProperties();
}

ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::ComAdobeCqDamCfmImplConfFeatureConfigImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::~ComAdobeCqDamCfmImplConfFeatureConfigImplInfo()
{

}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamCfmImplConfFeatureConfigImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplInfo::setProperties(ComAdobeCqDamCfmImplConfFeatureConfigImplProperties properties)
{
	this->properties = properties;
}



