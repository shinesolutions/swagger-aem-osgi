

#include "ComDayCqDamCoreImplServletCollectionsServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletCollectionsServletInfo::ComDayCqDamCoreImplServletCollectionsServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletCollectionsServletProperties();
}

ComDayCqDamCoreImplServletCollectionsServletInfo::ComDayCqDamCoreImplServletCollectionsServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletCollectionsServletInfo::~ComDayCqDamCoreImplServletCollectionsServletInfo()
{

}

void
ComDayCqDamCoreImplServletCollectionsServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletCollectionsServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletCollectionsServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletCollectionsServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletCollectionsServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletCollectionsServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletCollectionsServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletCollectionsServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletCollectionsServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletCollectionsServletProperties
ComDayCqDamCoreImplServletCollectionsServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletCollectionsServletInfo::setProperties(ComDayCqDamCoreImplServletCollectionsServletProperties properties)
{
	this->properties = properties;
}



