

#include "ComDayCqDamScene7ImplScene7APIClientImplInfo.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7APIClientImplInfo::ComDayCqDamScene7ImplScene7APIClientImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamScene7ImplScene7APIClientImplProperties();
}

ComDayCqDamScene7ImplScene7APIClientImplInfo::ComDayCqDamScene7ImplScene7APIClientImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7APIClientImplInfo::~ComDayCqDamScene7ImplScene7APIClientImplInfo()
{

}

void
ComDayCqDamScene7ImplScene7APIClientImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamScene7ImplScene7APIClientImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7APIClientImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamScene7ImplScene7APIClientImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamScene7ImplScene7APIClientImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamScene7ImplScene7APIClientImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamScene7ImplScene7APIClientImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamScene7ImplScene7APIClientImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamScene7ImplScene7APIClientImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamScene7ImplScene7APIClientImplProperties
ComDayCqDamScene7ImplScene7APIClientImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamScene7ImplScene7APIClientImplInfo::setProperties(ComDayCqDamScene7ImplScene7APIClientImplProperties properties)
{
	this->properties = properties;
}



