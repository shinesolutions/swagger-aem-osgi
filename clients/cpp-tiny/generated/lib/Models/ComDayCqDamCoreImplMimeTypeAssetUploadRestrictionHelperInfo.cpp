

#include "ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties();
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::~ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo()
{

}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo::setProperties(ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties properties)
{
	this->properties = properties;
}



