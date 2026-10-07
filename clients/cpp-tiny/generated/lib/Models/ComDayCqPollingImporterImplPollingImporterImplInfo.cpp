

#include "ComDayCqPollingImporterImplPollingImporterImplInfo.h"

using namespace Tiny;

ComDayCqPollingImporterImplPollingImporterImplInfo::ComDayCqPollingImporterImplPollingImporterImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqPollingImporterImplPollingImporterImplProperties();
}

ComDayCqPollingImporterImplPollingImporterImplInfo::ComDayCqPollingImporterImplPollingImporterImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPollingImporterImplPollingImporterImplInfo::~ComDayCqPollingImporterImplPollingImporterImplInfo()
{

}

void
ComDayCqPollingImporterImplPollingImporterImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqPollingImporterImplPollingImporterImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPollingImporterImplPollingImporterImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqPollingImporterImplPollingImporterImplInfo::getPid()
{
	return pid;
}

void
ComDayCqPollingImporterImplPollingImporterImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqPollingImporterImplPollingImporterImplInfo::getTitle()
{
	return title;
}

void
ComDayCqPollingImporterImplPollingImporterImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqPollingImporterImplPollingImporterImplInfo::getDescription()
{
	return description;
}

void
ComDayCqPollingImporterImplPollingImporterImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqPollingImporterImplPollingImporterImplProperties
ComDayCqPollingImporterImplPollingImporterImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqPollingImporterImplPollingImporterImplInfo::setProperties(ComDayCqPollingImporterImplPollingImporterImplProperties properties)
{
	this->properties = properties;
}



