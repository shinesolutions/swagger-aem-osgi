

#include "ComDayCqPollingImporterImplManagedPollingImporterImplInfo.h"

using namespace Tiny;

ComDayCqPollingImporterImplManagedPollingImporterImplInfo::ComDayCqPollingImporterImplManagedPollingImporterImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqPollingImporterImplManagedPollingImporterImplProperties();
}

ComDayCqPollingImporterImplManagedPollingImporterImplInfo::ComDayCqPollingImporterImplManagedPollingImporterImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPollingImporterImplManagedPollingImporterImplInfo::~ComDayCqPollingImporterImplManagedPollingImporterImplInfo()
{

}

void
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqPollingImporterImplManagedPollingImporterImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::getPid()
{
	return pid;
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::getTitle()
{
	return title;
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::getDescription()
{
	return description;
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqPollingImporterImplManagedPollingImporterImplProperties
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplInfo::setProperties(ComDayCqPollingImporterImplManagedPollingImporterImplProperties properties)
{
	this->properties = properties;
}



