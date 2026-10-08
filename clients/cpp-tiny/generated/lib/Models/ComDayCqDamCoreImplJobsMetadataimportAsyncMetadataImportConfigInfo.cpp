

#include "ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo()
{

}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo::setProperties(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties properties)
{
	this->properties = properties;
}



