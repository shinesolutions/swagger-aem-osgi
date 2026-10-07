

#include "ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.h"

using namespace Tiny;

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties()
{
	schedulerexpression = ConfigNodePropertyString();
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::~ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties()
{

}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}



