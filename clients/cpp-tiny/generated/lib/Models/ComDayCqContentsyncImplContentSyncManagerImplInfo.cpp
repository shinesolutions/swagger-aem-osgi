

#include "ComDayCqContentsyncImplContentSyncManagerImplInfo.h"

using namespace Tiny;

ComDayCqContentsyncImplContentSyncManagerImplInfo::ComDayCqContentsyncImplContentSyncManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqContentsyncImplContentSyncManagerImplProperties();
}

ComDayCqContentsyncImplContentSyncManagerImplInfo::ComDayCqContentsyncImplContentSyncManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqContentsyncImplContentSyncManagerImplInfo::~ComDayCqContentsyncImplContentSyncManagerImplInfo()
{

}

void
ComDayCqContentsyncImplContentSyncManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqContentsyncImplContentSyncManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqContentsyncImplContentSyncManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqContentsyncImplContentSyncManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqContentsyncImplContentSyncManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqContentsyncImplContentSyncManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqContentsyncImplContentSyncManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqContentsyncImplContentSyncManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqContentsyncImplContentSyncManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqContentsyncImplContentSyncManagerImplProperties
ComDayCqContentsyncImplContentSyncManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqContentsyncImplContentSyncManagerImplInfo::setProperties(ComDayCqContentsyncImplContentSyncManagerImplProperties properties)
{
	this->properties = properties;
}



