

#include "ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties();
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::~ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo()
{

}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setProperties(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties properties)
{
	this->properties = properties;
}



