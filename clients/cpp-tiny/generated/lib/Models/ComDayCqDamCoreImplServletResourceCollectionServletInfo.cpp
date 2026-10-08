

#include "ComDayCqDamCoreImplServletResourceCollectionServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletResourceCollectionServletInfo::ComDayCqDamCoreImplServletResourceCollectionServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletResourceCollectionServletProperties();
}

ComDayCqDamCoreImplServletResourceCollectionServletInfo::ComDayCqDamCoreImplServletResourceCollectionServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletResourceCollectionServletInfo::~ComDayCqDamCoreImplServletResourceCollectionServletInfo()
{

}

void
ComDayCqDamCoreImplServletResourceCollectionServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletResourceCollectionServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletResourceCollectionServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletResourceCollectionServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletResourceCollectionServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletResourceCollectionServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletResourceCollectionServletProperties
ComDayCqDamCoreImplServletResourceCollectionServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletInfo::setProperties(ComDayCqDamCoreImplServletResourceCollectionServletProperties properties)
{
	this->properties = properties;
}



