

#include "ComDayCqWcmFoundationImplHTTPAuthHandlerInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::ComDayCqWcmFoundationImplHTTPAuthHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationImplHTTPAuthHandlerProperties();
}

ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::ComDayCqWcmFoundationImplHTTPAuthHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::~ComDayCqWcmFoundationImplHTTPAuthHandlerInfo()
{

}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationImplHTTPAuthHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerInfo::setProperties(ComDayCqWcmFoundationImplHTTPAuthHandlerProperties properties)
{
	this->properties = properties;
}



