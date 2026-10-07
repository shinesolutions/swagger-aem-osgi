

#include "ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo.h"

using namespace Tiny;

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties();
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::~ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo()
{

}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::fromJson(std::string jsonObj)
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




        ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo::setProperties(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties properties)
{
	this->properties = properties;
}



