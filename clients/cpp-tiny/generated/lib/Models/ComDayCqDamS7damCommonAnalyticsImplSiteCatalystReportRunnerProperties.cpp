

#include "ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	schedulerconcurrent = ConfigNodePropertyBoolean();
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::~ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties()
{

}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *schedulerconcurrentKey = "scheduler.concurrent";

    if(object.has_key(schedulerconcurrentKey))
    {
        bourne::json value = object[schedulerconcurrentKey];




        ConfigNodePropertyBoolean* obj = &schedulerconcurrent;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["schedulerconcurrent"] = getSchedulerconcurrent().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyBoolean
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}



