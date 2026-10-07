

#include "ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.h"

using namespace Tiny;

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::~ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo()
{

}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::fromJson(std::string jsonObj)
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




        ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::getPid()
{
	return pid;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::getTitle()
{
	return title;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::getDescription()
{
	return description;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::getProperties()
{
	return properties;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo::setProperties(ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties properties)
{
	this->properties = properties;
}



