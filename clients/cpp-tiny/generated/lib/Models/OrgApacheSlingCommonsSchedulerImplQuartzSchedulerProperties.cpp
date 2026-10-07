

#include "OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties()
{
	poolName = ConfigNodePropertyString();
	allowedPoolNames = ConfigNodePropertyArray();
	scheduleruseleaderforsingle = ConfigNodePropertyBoolean();
	metricsfilters = ConfigNodePropertyArray();
	slowThresholdMillis = ConfigNodePropertyInteger();
}

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::~OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties()
{

}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *poolNameKey = "poolName";

    if(object.has_key(poolNameKey))
    {
        bourne::json value = object[poolNameKey];




        ConfigNodePropertyString* obj = &poolName;
		obj->fromJson(value.dump());

    }

    const char *allowedPoolNamesKey = "allowedPoolNames";

    if(object.has_key(allowedPoolNamesKey))
    {
        bourne::json value = object[allowedPoolNamesKey];




        ConfigNodePropertyArray* obj = &allowedPoolNames;
		obj->fromJson(value.dump());

    }

    const char *scheduleruseleaderforsingleKey = "scheduler.useleaderforsingle";

    if(object.has_key(scheduleruseleaderforsingleKey))
    {
        bourne::json value = object[scheduleruseleaderforsingleKey];




        ConfigNodePropertyBoolean* obj = &scheduleruseleaderforsingle;
		obj->fromJson(value.dump());

    }

    const char *metricsfiltersKey = "metrics.filters";

    if(object.has_key(metricsfiltersKey))
    {
        bourne::json value = object[metricsfiltersKey];




        ConfigNodePropertyArray* obj = &metricsfilters;
		obj->fromJson(value.dump());

    }

    const char *slowThresholdMillisKey = "slowThresholdMillis";

    if(object.has_key(slowThresholdMillisKey))
    {
        bourne::json value = object[slowThresholdMillisKey];




        ConfigNodePropertyInteger* obj = &slowThresholdMillis;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["poolName"] = getPoolName().toJson();






	object["allowedPoolNames"] = getAllowedPoolNames().toJson();






	object["scheduleruseleaderforsingle"] = getScheduleruseleaderforsingle().toJson();






	object["metricsfilters"] = getMetricsfilters().toJson();






	object["slowThresholdMillis"] = getSlowThresholdMillis().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getPoolName()
{
	return poolName;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setPoolName(ConfigNodePropertyString poolName)
{
	this->poolName = poolName;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getAllowedPoolNames()
{
	return allowedPoolNames;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames)
{
	this->allowedPoolNames = allowedPoolNames;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getScheduleruseleaderforsingle()
{
	return scheduleruseleaderforsingle;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setScheduleruseleaderforsingle(ConfigNodePropertyBoolean scheduleruseleaderforsingle)
{
	this->scheduleruseleaderforsingle = scheduleruseleaderforsingle;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getMetricsfilters()
{
	return metricsfilters;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setMetricsfilters(ConfigNodePropertyArray metricsfilters)
{
	this->metricsfilters = metricsfilters;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getSlowThresholdMillis()
{
	return slowThresholdMillis;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis)
{
	this->slowThresholdMillis = slowThresholdMillis;
}



