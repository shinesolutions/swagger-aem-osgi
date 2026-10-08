

#include "ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.h"

using namespace Tiny;

ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties();
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::~ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo()
{

}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo::setProperties(ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties properties)
{
	this->properties = properties;
}



