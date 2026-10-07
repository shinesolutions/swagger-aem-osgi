

#include "ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo.h"

using namespace Tiny;

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo()
{

}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo::setProperties(ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties properties)
{
	this->properties = properties;
}



