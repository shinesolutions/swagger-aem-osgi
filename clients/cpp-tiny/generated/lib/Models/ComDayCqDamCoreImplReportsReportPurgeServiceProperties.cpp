

#include "ComDayCqDamCoreImplReportsReportPurgeServiceProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplReportsReportPurgeServiceProperties::ComDayCqDamCoreImplReportsReportPurgeServiceProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	maxSavedReports = ConfigNodePropertyInteger();
	timeDuration = ConfigNodePropertyInteger();
	enableReportPurge = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplReportsReportPurgeServiceProperties::ComDayCqDamCoreImplReportsReportPurgeServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplReportsReportPurgeServiceProperties::~ComDayCqDamCoreImplReportsReportPurgeServiceProperties()
{

}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *maxSavedReportsKey = "maxSavedReports";

    if(object.has_key(maxSavedReportsKey))
    {
        bourne::json value = object[maxSavedReportsKey];




        ConfigNodePropertyInteger* obj = &maxSavedReports;
		obj->fromJson(value.dump());

    }

    const char *timeDurationKey = "timeDuration";

    if(object.has_key(timeDurationKey))
    {
        bourne::json value = object[timeDurationKey];




        ConfigNodePropertyInteger* obj = &timeDuration;
		obj->fromJson(value.dump());

    }

    const char *enableReportPurgeKey = "enableReportPurge";

    if(object.has_key(enableReportPurgeKey))
    {
        bourne::json value = object[enableReportPurgeKey];




        ConfigNodePropertyBoolean* obj = &enableReportPurge;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["maxSavedReports"] = getMaxSavedReports().toJson();






	object["timeDuration"] = getTimeDuration().toJson();






	object["enableReportPurge"] = getEnableReportPurge().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getMaxSavedReports()
{
	return maxSavedReports;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setMaxSavedReports(ConfigNodePropertyInteger maxSavedReports)
{
	this->maxSavedReports = maxSavedReports;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getTimeDuration()
{
	return timeDuration;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setTimeDuration(ConfigNodePropertyInteger timeDuration)
{
	this->timeDuration = timeDuration;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getEnableReportPurge()
{
	return enableReportPurge;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setEnableReportPurge(ConfigNodePropertyBoolean enableReportPurge)
{
	this->enableReportPurge = enableReportPurge;
}



