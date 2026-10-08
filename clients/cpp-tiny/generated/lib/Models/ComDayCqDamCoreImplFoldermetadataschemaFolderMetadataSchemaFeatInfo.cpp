

#include "ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties();
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::~ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo()
{

}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo::setProperties(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties properties)
{
	this->properties = properties;
}



