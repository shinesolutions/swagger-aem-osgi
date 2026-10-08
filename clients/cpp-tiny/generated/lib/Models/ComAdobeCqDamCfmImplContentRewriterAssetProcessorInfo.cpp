

#include "ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo.h"

using namespace Tiny;

ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties();
}

ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::~ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo()
{

}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo::setProperties(ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties properties)
{
	this->properties = properties;
}



