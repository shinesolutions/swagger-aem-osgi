

#include "ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::ComDayCqWcmCoreImplEventTemplatePostProcessorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplEventTemplatePostProcessorProperties();
}

ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::ComDayCqWcmCoreImplEventTemplatePostProcessorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::~ComDayCqWcmCoreImplEventTemplatePostProcessorInfo()
{

}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplEventTemplatePostProcessorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorInfo::setProperties(ComDayCqWcmCoreImplEventTemplatePostProcessorProperties properties)
{
	this->properties = properties;
}



