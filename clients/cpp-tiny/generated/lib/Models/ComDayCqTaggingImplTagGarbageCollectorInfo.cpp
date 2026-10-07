

#include "ComDayCqTaggingImplTagGarbageCollectorInfo.h"

using namespace Tiny;

ComDayCqTaggingImplTagGarbageCollectorInfo::ComDayCqTaggingImplTagGarbageCollectorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqTaggingImplTagGarbageCollectorProperties();
}

ComDayCqTaggingImplTagGarbageCollectorInfo::ComDayCqTaggingImplTagGarbageCollectorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqTaggingImplTagGarbageCollectorInfo::~ComDayCqTaggingImplTagGarbageCollectorInfo()
{

}

void
ComDayCqTaggingImplTagGarbageCollectorInfo::fromJson(std::string jsonObj)
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




        ComDayCqTaggingImplTagGarbageCollectorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqTaggingImplTagGarbageCollectorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqTaggingImplTagGarbageCollectorInfo::getPid()
{
	return pid;
}

void
ComDayCqTaggingImplTagGarbageCollectorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqTaggingImplTagGarbageCollectorInfo::getTitle()
{
	return title;
}

void
ComDayCqTaggingImplTagGarbageCollectorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqTaggingImplTagGarbageCollectorInfo::getDescription()
{
	return description;
}

void
ComDayCqTaggingImplTagGarbageCollectorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqTaggingImplTagGarbageCollectorProperties
ComDayCqTaggingImplTagGarbageCollectorInfo::getProperties()
{
	return properties;
}

void
ComDayCqTaggingImplTagGarbageCollectorInfo::setProperties(ComDayCqTaggingImplTagGarbageCollectorProperties properties)
{
	this->properties = properties;
}



