

#include "ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo.h"

using namespace Tiny;

ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties();
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::~ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo()
{

}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::fromJson(std::string jsonObj)
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




        ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::getPid()
{
	return pid;
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::getTitle()
{
	return title;
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::getDescription()
{
	return description;
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::getProperties()
{
	return properties;
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo::setProperties(ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties properties)
{
	this->properties = properties;
}



