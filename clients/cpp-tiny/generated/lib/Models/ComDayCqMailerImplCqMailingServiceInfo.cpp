

#include "ComDayCqMailerImplCqMailingServiceInfo.h"

using namespace Tiny;

ComDayCqMailerImplCqMailingServiceInfo::ComDayCqMailerImplCqMailingServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMailerImplCqMailingServiceProperties();
}

ComDayCqMailerImplCqMailingServiceInfo::ComDayCqMailerImplCqMailingServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerImplCqMailingServiceInfo::~ComDayCqMailerImplCqMailingServiceInfo()
{

}

void
ComDayCqMailerImplCqMailingServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCqMailerImplCqMailingServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerImplCqMailingServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMailerImplCqMailingServiceInfo::getPid()
{
	return pid;
}

void
ComDayCqMailerImplCqMailingServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMailerImplCqMailingServiceInfo::getTitle()
{
	return title;
}

void
ComDayCqMailerImplCqMailingServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMailerImplCqMailingServiceInfo::getDescription()
{
	return description;
}

void
ComDayCqMailerImplCqMailingServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMailerImplCqMailingServiceProperties
ComDayCqMailerImplCqMailingServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCqMailerImplCqMailingServiceInfo::setProperties(ComDayCqMailerImplCqMailingServiceProperties properties)
{
	this->properties = properties;
}



