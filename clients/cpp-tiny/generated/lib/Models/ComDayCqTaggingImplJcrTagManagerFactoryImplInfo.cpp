

#include "ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.h"

using namespace Tiny;

ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::ComDayCqTaggingImplJcrTagManagerFactoryImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqTaggingImplJcrTagManagerFactoryImplProperties();
}

ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::ComDayCqTaggingImplJcrTagManagerFactoryImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::~ComDayCqTaggingImplJcrTagManagerFactoryImplInfo()
{

}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqTaggingImplJcrTagManagerFactoryImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::getPid()
{
	return pid;
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::getTitle()
{
	return title;
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::getDescription()
{
	return description;
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplInfo::setProperties(ComDayCqTaggingImplJcrTagManagerFactoryImplProperties properties)
{
	this->properties = properties;
}



