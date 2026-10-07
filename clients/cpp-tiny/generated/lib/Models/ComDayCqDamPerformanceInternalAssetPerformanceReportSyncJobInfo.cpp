

#include "ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.h"

using namespace Tiny;

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties();
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::~ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo()
{

}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::getPid()
{
	return pid;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::getTitle()
{
	return title;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::getDescription()
{
	return description;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo::setProperties(ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties properties)
{
	this->properties = properties;
}



