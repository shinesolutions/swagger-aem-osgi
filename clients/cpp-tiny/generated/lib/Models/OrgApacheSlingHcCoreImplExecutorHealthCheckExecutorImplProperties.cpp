

#include "OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties()
{
	timeoutInMs = ConfigNodePropertyInteger();
	longRunningFutureThresholdForCriticalMs = ConfigNodePropertyInteger();
	resultCacheTtlInMs = ConfigNodePropertyInteger();
}

OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::~OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties()
{

}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *timeoutInMsKey = "timeoutInMs";

    if(object.has_key(timeoutInMsKey))
    {
        bourne::json value = object[timeoutInMsKey];




        ConfigNodePropertyInteger* obj = &timeoutInMs;
		obj->fromJson(value.dump());

    }

    const char *longRunningFutureThresholdForCriticalMsKey = "longRunningFutureThresholdForCriticalMs";

    if(object.has_key(longRunningFutureThresholdForCriticalMsKey))
    {
        bourne::json value = object[longRunningFutureThresholdForCriticalMsKey];




        ConfigNodePropertyInteger* obj = &longRunningFutureThresholdForCriticalMs;
		obj->fromJson(value.dump());

    }

    const char *resultCacheTtlInMsKey = "resultCacheTtlInMs";

    if(object.has_key(resultCacheTtlInMsKey))
    {
        bourne::json value = object[resultCacheTtlInMsKey];




        ConfigNodePropertyInteger* obj = &resultCacheTtlInMs;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["timeoutInMs"] = getTimeoutInMs().toJson();






	object["longRunningFutureThresholdForCriticalMs"] = getLongRunningFutureThresholdForCriticalMs().toJson();






	object["resultCacheTtlInMs"] = getResultCacheTtlInMs().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::getTimeoutInMs()
{
	return timeoutInMs;
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs)
{
	this->timeoutInMs = timeoutInMs;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::getLongRunningFutureThresholdForCriticalMs()
{
	return longRunningFutureThresholdForCriticalMs;
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs)
{
	this->longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::getResultCacheTtlInMs()
{
	return resultCacheTtlInMs;
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::setResultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs)
{
	this->resultCacheTtlInMs = resultCacheTtlInMs;
}



