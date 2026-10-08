

#include "OrgApacheSlingCommonsMetricsInternalLogReporterProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsMetricsInternalLogReporterProperties::OrgApacheSlingCommonsMetricsInternalLogReporterProperties()
{
	period = ConfigNodePropertyInteger();
	timeUnit = ConfigNodePropertyDropDown();
	level = ConfigNodePropertyDropDown();
	loggerName = ConfigNodePropertyString();
	prefix = ConfigNodePropertyString();
	pattern = ConfigNodePropertyString();
	registryName = ConfigNodePropertyString();
}

OrgApacheSlingCommonsMetricsInternalLogReporterProperties::OrgApacheSlingCommonsMetricsInternalLogReporterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsMetricsInternalLogReporterProperties::~OrgApacheSlingCommonsMetricsInternalLogReporterProperties()
{

}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *periodKey = "period";

    if(object.has_key(periodKey))
    {
        bourne::json value = object[periodKey];




        ConfigNodePropertyInteger* obj = &period;
		obj->fromJson(value.dump());

    }

    const char *timeUnitKey = "timeUnit";

    if(object.has_key(timeUnitKey))
    {
        bourne::json value = object[timeUnitKey];




        ConfigNodePropertyDropDown* obj = &timeUnit;
		obj->fromJson(value.dump());

    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];




        ConfigNodePropertyDropDown* obj = &level;
		obj->fromJson(value.dump());

    }

    const char *loggerNameKey = "loggerName";

    if(object.has_key(loggerNameKey))
    {
        bourne::json value = object[loggerNameKey];




        ConfigNodePropertyString* obj = &loggerName;
		obj->fromJson(value.dump());

    }

    const char *prefixKey = "prefix";

    if(object.has_key(prefixKey))
    {
        bourne::json value = object[prefixKey];




        ConfigNodePropertyString* obj = &prefix;
		obj->fromJson(value.dump());

    }

    const char *patternKey = "pattern";

    if(object.has_key(patternKey))
    {
        bourne::json value = object[patternKey];




        ConfigNodePropertyString* obj = &pattern;
		obj->fromJson(value.dump());

    }

    const char *registryNameKey = "registryName";

    if(object.has_key(registryNameKey))
    {
        bourne::json value = object[registryNameKey];




        ConfigNodePropertyString* obj = &registryName;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["period"] = getPeriod().toJson();






	object["timeUnit"] = getTimeUnit().toJson();






	object["level"] = getLevel().toJson();






	object["loggerName"] = getLoggerName().toJson();






	object["prefix"] = getPrefix().toJson();






	object["pattern"] = getPattern().toJson();






	object["registryName"] = getRegistryName().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getPeriod()
{
	return period;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setPeriod(ConfigNodePropertyInteger period)
{
	this->period = period;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getTimeUnit()
{
	return timeUnit;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setTimeUnit(ConfigNodePropertyDropDown timeUnit)
{
	this->timeUnit = timeUnit;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getLevel()
{
	return level;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setLevel(ConfigNodePropertyDropDown level)
{
	this->level = level;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getLoggerName()
{
	return loggerName;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setLoggerName(ConfigNodePropertyString loggerName)
{
	this->loggerName = loggerName;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getPrefix()
{
	return prefix;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setPrefix(ConfigNodePropertyString prefix)
{
	this->prefix = prefix;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getPattern()
{
	return pattern;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setPattern(ConfigNodePropertyString pattern)
{
	this->pattern = pattern;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getRegistryName()
{
	return registryName;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setRegistryName(ConfigNodePropertyString registryName)
{
	this->registryName = registryName;
}



