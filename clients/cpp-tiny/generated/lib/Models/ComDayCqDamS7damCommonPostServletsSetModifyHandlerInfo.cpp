

#include "ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties();
}

ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::~ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo()
{

}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo::setProperties(ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties properties)
{
	this->properties = properties;
}



