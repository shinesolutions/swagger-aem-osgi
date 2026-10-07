

#include "ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties();
}

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::~ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo()
{

}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo::setProperties(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties properties)
{
	this->properties = properties;
}



