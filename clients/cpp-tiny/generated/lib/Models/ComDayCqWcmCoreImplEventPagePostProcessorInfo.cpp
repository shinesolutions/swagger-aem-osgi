

#include "ComDayCqWcmCoreImplEventPagePostProcessorInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplEventPagePostProcessorInfo::ComDayCqWcmCoreImplEventPagePostProcessorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplEventPagePostProcessorProperties();
}

ComDayCqWcmCoreImplEventPagePostProcessorInfo::ComDayCqWcmCoreImplEventPagePostProcessorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplEventPagePostProcessorInfo::~ComDayCqWcmCoreImplEventPagePostProcessorInfo()
{

}

void
ComDayCqWcmCoreImplEventPagePostProcessorInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplEventPagePostProcessorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplEventPagePostProcessorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplEventPagePostProcessorInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplEventPagePostProcessorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplEventPagePostProcessorInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplEventPagePostProcessorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplEventPagePostProcessorInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplEventPagePostProcessorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplEventPagePostProcessorProperties
ComDayCqWcmCoreImplEventPagePostProcessorInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplEventPagePostProcessorInfo::setProperties(ComDayCqWcmCoreImplEventPagePostProcessorProperties properties)
{
	this->properties = properties;
}



