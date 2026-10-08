

#include "ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties();
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::~ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo()
{

}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo::setProperties(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties properties)
{
	this->properties = properties;
}



