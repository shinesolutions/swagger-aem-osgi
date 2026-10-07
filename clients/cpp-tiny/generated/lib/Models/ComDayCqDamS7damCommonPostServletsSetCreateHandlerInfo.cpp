

#include "ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties();
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::~ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo()
{

}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo::setProperties(ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties properties)
{
	this->properties = properties;
}



