

#include "ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties();
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::~ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo()
{

}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo::setProperties(ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties properties)
{
	this->properties = properties;
}



