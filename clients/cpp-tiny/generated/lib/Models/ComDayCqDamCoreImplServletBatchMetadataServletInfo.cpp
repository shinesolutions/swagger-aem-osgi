

#include "ComDayCqDamCoreImplServletBatchMetadataServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletBatchMetadataServletInfo::ComDayCqDamCoreImplServletBatchMetadataServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletBatchMetadataServletProperties();
}

ComDayCqDamCoreImplServletBatchMetadataServletInfo::ComDayCqDamCoreImplServletBatchMetadataServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletBatchMetadataServletInfo::~ComDayCqDamCoreImplServletBatchMetadataServletInfo()
{

}

void
ComDayCqDamCoreImplServletBatchMetadataServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletBatchMetadataServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletBatchMetadataServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletBatchMetadataServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletBatchMetadataServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletBatchMetadataServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletBatchMetadataServletProperties
ComDayCqDamCoreImplServletBatchMetadataServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletInfo::setProperties(ComDayCqDamCoreImplServletBatchMetadataServletProperties properties)
{
	this->properties = properties;
}



