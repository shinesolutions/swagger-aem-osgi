

#include "OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.h"

using namespace Tiny;

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties()
{
	extensions = ConfigNodePropertyArray();
	minDurationMs = ConfigNodePropertyInteger();
	maxDurationMs = ConfigNodePropertyInteger();
	compactLogFormat = ConfigNodePropertyBoolean();
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::~OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties()
{

}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *extensionsKey = "extensions";

    if(object.has_key(extensionsKey))
    {
        bourne::json value = object[extensionsKey];




        ConfigNodePropertyArray* obj = &extensions;
		obj->fromJson(value.dump());

    }

    const char *minDurationMsKey = "minDurationMs";

    if(object.has_key(minDurationMsKey))
    {
        bourne::json value = object[minDurationMsKey];




        ConfigNodePropertyInteger* obj = &minDurationMs;
		obj->fromJson(value.dump());

    }

    const char *maxDurationMsKey = "maxDurationMs";

    if(object.has_key(maxDurationMsKey))
    {
        bourne::json value = object[maxDurationMsKey];




        ConfigNodePropertyInteger* obj = &maxDurationMs;
		obj->fromJson(value.dump());

    }

    const char *compactLogFormatKey = "compactLogFormat";

    if(object.has_key(compactLogFormatKey))
    {
        bourne::json value = object[compactLogFormatKey];




        ConfigNodePropertyBoolean* obj = &compactLogFormat;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["extensions"] = getExtensions().toJson();






	object["minDurationMs"] = getMinDurationMs().toJson();






	object["maxDurationMs"] = getMaxDurationMs().toJson();






	object["compactLogFormat"] = getCompactLogFormat().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getExtensions()
{
	return extensions;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setExtensions(ConfigNodePropertyArray extensions)
{
	this->extensions = extensions;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getMinDurationMs()
{
	return minDurationMs;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setMinDurationMs(ConfigNodePropertyInteger minDurationMs)
{
	this->minDurationMs = minDurationMs;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getMaxDurationMs()
{
	return maxDurationMs;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs)
{
	this->maxDurationMs = maxDurationMs;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getCompactLogFormat()
{
	return compactLogFormat;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setCompactLogFormat(ConfigNodePropertyBoolean compactLogFormat)
{
	this->compactLogFormat = compactLogFormat;
}



