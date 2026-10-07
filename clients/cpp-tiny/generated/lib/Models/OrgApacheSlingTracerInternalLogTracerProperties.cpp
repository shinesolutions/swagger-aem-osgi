

#include "OrgApacheSlingTracerInternalLogTracerProperties.h"

using namespace Tiny;

OrgApacheSlingTracerInternalLogTracerProperties::OrgApacheSlingTracerInternalLogTracerProperties()
{
	tracerSets = ConfigNodePropertyArray();
	enabled = ConfigNodePropertyBoolean();
	servletEnabled = ConfigNodePropertyBoolean();
	recordingCacheSizeInMB = ConfigNodePropertyInteger();
	recordingCacheDurationInSecs = ConfigNodePropertyInteger();
	recordingCompressionEnabled = ConfigNodePropertyBoolean();
	gzipResponse = ConfigNodePropertyBoolean();
}

OrgApacheSlingTracerInternalLogTracerProperties::OrgApacheSlingTracerInternalLogTracerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingTracerInternalLogTracerProperties::~OrgApacheSlingTracerInternalLogTracerProperties()
{

}

void
OrgApacheSlingTracerInternalLogTracerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tracerSetsKey = "tracerSets";

    if(object.has_key(tracerSetsKey))
    {
        bourne::json value = object[tracerSetsKey];




        ConfigNodePropertyArray* obj = &tracerSets;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *servletEnabledKey = "servletEnabled";

    if(object.has_key(servletEnabledKey))
    {
        bourne::json value = object[servletEnabledKey];




        ConfigNodePropertyBoolean* obj = &servletEnabled;
		obj->fromJson(value.dump());

    }

    const char *recordingCacheSizeInMBKey = "recordingCacheSizeInMB";

    if(object.has_key(recordingCacheSizeInMBKey))
    {
        bourne::json value = object[recordingCacheSizeInMBKey];




        ConfigNodePropertyInteger* obj = &recordingCacheSizeInMB;
		obj->fromJson(value.dump());

    }

    const char *recordingCacheDurationInSecsKey = "recordingCacheDurationInSecs";

    if(object.has_key(recordingCacheDurationInSecsKey))
    {
        bourne::json value = object[recordingCacheDurationInSecsKey];




        ConfigNodePropertyInteger* obj = &recordingCacheDurationInSecs;
		obj->fromJson(value.dump());

    }

    const char *recordingCompressionEnabledKey = "recordingCompressionEnabled";

    if(object.has_key(recordingCompressionEnabledKey))
    {
        bourne::json value = object[recordingCompressionEnabledKey];




        ConfigNodePropertyBoolean* obj = &recordingCompressionEnabled;
		obj->fromJson(value.dump());

    }

    const char *gzipResponseKey = "gzipResponse";

    if(object.has_key(gzipResponseKey))
    {
        bourne::json value = object[gzipResponseKey];




        ConfigNodePropertyBoolean* obj = &gzipResponse;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingTracerInternalLogTracerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["tracerSets"] = getTracerSets().toJson();






	object["enabled"] = getEnabled().toJson();






	object["servletEnabled"] = getServletEnabled().toJson();






	object["recordingCacheSizeInMB"] = getRecordingCacheSizeInMB().toJson();






	object["recordingCacheDurationInSecs"] = getRecordingCacheDurationInSecs().toJson();






	object["recordingCompressionEnabled"] = getRecordingCompressionEnabled().toJson();






	object["gzipResponse"] = getGzipResponse().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingTracerInternalLogTracerProperties::getTracerSets()
{
	return tracerSets;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setTracerSets(ConfigNodePropertyArray tracerSets)
{
	this->tracerSets = tracerSets;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getServletEnabled()
{
	return servletEnabled;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setServletEnabled(ConfigNodePropertyBoolean servletEnabled)
{
	this->servletEnabled = servletEnabled;
}

ConfigNodePropertyInteger
OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCacheSizeInMB()
{
	return recordingCacheSizeInMB;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB)
{
	this->recordingCacheSizeInMB = recordingCacheSizeInMB;
}

ConfigNodePropertyInteger
OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCacheDurationInSecs()
{
	return recordingCacheDurationInSecs;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs)
{
	this->recordingCacheDurationInSecs = recordingCacheDurationInSecs;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCompressionEnabled()
{
	return recordingCompressionEnabled;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled)
{
	this->recordingCompressionEnabled = recordingCompressionEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getGzipResponse()
{
	return gzipResponse;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setGzipResponse(ConfigNodePropertyBoolean gzipResponse)
{
	this->gzipResponse = gzipResponse;
}



