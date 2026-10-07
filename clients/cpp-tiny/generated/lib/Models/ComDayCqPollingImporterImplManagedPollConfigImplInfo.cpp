

#include "ComDayCqPollingImporterImplManagedPollConfigImplInfo.h"

using namespace Tiny;

ComDayCqPollingImporterImplManagedPollConfigImplInfo::ComDayCqPollingImporterImplManagedPollConfigImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqPollingImporterImplManagedPollConfigImplProperties();
}

ComDayCqPollingImporterImplManagedPollConfigImplInfo::ComDayCqPollingImporterImplManagedPollConfigImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPollingImporterImplManagedPollConfigImplInfo::~ComDayCqPollingImporterImplManagedPollConfigImplInfo()
{

}

void
ComDayCqPollingImporterImplManagedPollConfigImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqPollingImporterImplManagedPollConfigImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPollingImporterImplManagedPollConfigImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqPollingImporterImplManagedPollConfigImplInfo::getPid()
{
	return pid;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqPollingImporterImplManagedPollConfigImplInfo::getTitle()
{
	return title;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqPollingImporterImplManagedPollConfigImplInfo::getDescription()
{
	return description;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqPollingImporterImplManagedPollConfigImplProperties
ComDayCqPollingImporterImplManagedPollConfigImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplInfo::setProperties(ComDayCqPollingImporterImplManagedPollConfigImplProperties properties)
{
	this->properties = properties;
}



