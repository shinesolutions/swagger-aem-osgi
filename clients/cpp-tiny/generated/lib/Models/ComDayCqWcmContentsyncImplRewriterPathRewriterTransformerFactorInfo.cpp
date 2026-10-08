

#include "ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.h"

using namespace Tiny;

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties();
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::~ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo()
{

}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo::setProperties(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties properties)
{
	this->properties = properties;
}



