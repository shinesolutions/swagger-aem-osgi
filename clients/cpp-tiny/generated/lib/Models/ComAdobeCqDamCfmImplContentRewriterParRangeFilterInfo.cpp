

#include "ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.h"

using namespace Tiny;

ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();
}

ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::~ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo()
{

}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo::setProperties(ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties properties)
{
	this->properties = properties;
}



