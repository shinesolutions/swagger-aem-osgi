

#include "ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties();
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::~ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo()
{

}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo::setProperties(ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties properties)
{
	this->properties = properties;
}



