

#include "ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties();
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::~ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo()
{

}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo::setProperties(ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties properties)
{
	this->properties = properties;
}



