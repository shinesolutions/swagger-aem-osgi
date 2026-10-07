

#include "ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties();
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::~ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo()
{

}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo::setProperties(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties properties)
{
	this->properties = properties;
}



