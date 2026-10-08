

#include "ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties();
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::~ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo()
{

}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo::setProperties(ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties properties)
{
	this->properties = properties;
}



