#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingTracerInternalLogTracerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingTracerInternalLogTracerProperties::OrgApacheSlingTracerInternalLogTracerProperties()
{
	//__init();
}

OrgApacheSlingTracerInternalLogTracerProperties::~OrgApacheSlingTracerInternalLogTracerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingTracerInternalLogTracerProperties::__init()
{
	//tracerSets = new ConfigNodePropertyArray();
	//enabled = new ConfigNodePropertyBoolean();
	//servletEnabled = new ConfigNodePropertyBoolean();
	//recordingCacheSizeInMB = new ConfigNodePropertyInteger();
	//recordingCacheDurationInSecs = new ConfigNodePropertyInteger();
	//recordingCompressionEnabled = new ConfigNodePropertyBoolean();
	//gzipResponse = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingTracerInternalLogTracerProperties::__cleanup()
{
	//if(tracerSets != NULL) {
	//
	//delete tracerSets;
	//tracerSets = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(servletEnabled != NULL) {
	//
	//delete servletEnabled;
	//servletEnabled = NULL;
	//}
	//if(recordingCacheSizeInMB != NULL) {
	//
	//delete recordingCacheSizeInMB;
	//recordingCacheSizeInMB = NULL;
	//}
	//if(recordingCacheDurationInSecs != NULL) {
	//
	//delete recordingCacheDurationInSecs;
	//recordingCacheDurationInSecs = NULL;
	//}
	//if(recordingCompressionEnabled != NULL) {
	//
	//delete recordingCompressionEnabled;
	//recordingCompressionEnabled = NULL;
	//}
	//if(gzipResponse != NULL) {
	//
	//delete gzipResponse;
	//gzipResponse = NULL;
	//}
	//
}

void
OrgApacheSlingTracerInternalLogTracerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tracerSetsKey = "tracerSets";
	node = json_object_get_member(pJsonObject, tracerSetsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&tracerSets, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&tracerSets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletEnabledKey = "servletEnabled";
	node = json_object_get_member(pJsonObject, servletEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&servletEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&servletEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recordingCacheSizeInMBKey = "recordingCacheSizeInMB";
	node = json_object_get_member(pJsonObject, recordingCacheSizeInMBKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&recordingCacheSizeInMB, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&recordingCacheSizeInMB);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recordingCacheDurationInSecsKey = "recordingCacheDurationInSecs";
	node = json_object_get_member(pJsonObject, recordingCacheDurationInSecsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&recordingCacheDurationInSecs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&recordingCacheDurationInSecs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recordingCompressionEnabledKey = "recordingCompressionEnabled";
	node = json_object_get_member(pJsonObject, recordingCompressionEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&recordingCompressionEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&recordingCompressionEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gzipResponseKey = "gzipResponse";
	node = json_object_get_member(pJsonObject, gzipResponseKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&gzipResponse, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&gzipResponse);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingTracerInternalLogTracerProperties::OrgApacheSlingTracerInternalLogTracerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingTracerInternalLogTracerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTracerSets();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTracerSets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tracerSetsKey = "tracerSets";
	json_object_set_member(pJsonObject, tracerSetsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServletEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServletEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletEnabledKey = "servletEnabled";
	json_object_set_member(pJsonObject, servletEnabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRecordingCacheSizeInMB();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRecordingCacheSizeInMB());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recordingCacheSizeInMBKey = "recordingCacheSizeInMB";
	json_object_set_member(pJsonObject, recordingCacheSizeInMBKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRecordingCacheDurationInSecs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRecordingCacheDurationInSecs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recordingCacheDurationInSecsKey = "recordingCacheDurationInSecs";
	json_object_set_member(pJsonObject, recordingCacheDurationInSecsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRecordingCompressionEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRecordingCompressionEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recordingCompressionEnabledKey = "recordingCompressionEnabled";
	json_object_set_member(pJsonObject, recordingCompressionEnabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGzipResponse();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGzipResponse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gzipResponseKey = "gzipResponse";
	json_object_set_member(pJsonObject, gzipResponseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingTracerInternalLogTracerProperties::getTracerSets()
{
	return tracerSets;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setTracerSets(ConfigNodePropertyArray  tracerSets)
{
	this->tracerSets = tracerSets;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getServletEnabled()
{
	return servletEnabled;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setServletEnabled(ConfigNodePropertyBoolean  servletEnabled)
{
	this->servletEnabled = servletEnabled;
}

ConfigNodePropertyInteger
OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCacheSizeInMB()
{
	return recordingCacheSizeInMB;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCacheSizeInMB(ConfigNodePropertyInteger  recordingCacheSizeInMB)
{
	this->recordingCacheSizeInMB = recordingCacheSizeInMB;
}

ConfigNodePropertyInteger
OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCacheDurationInSecs()
{
	return recordingCacheDurationInSecs;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCacheDurationInSecs(ConfigNodePropertyInteger  recordingCacheDurationInSecs)
{
	this->recordingCacheDurationInSecs = recordingCacheDurationInSecs;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCompressionEnabled()
{
	return recordingCompressionEnabled;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCompressionEnabled(ConfigNodePropertyBoolean  recordingCompressionEnabled)
{
	this->recordingCompressionEnabled = recordingCompressionEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingTracerInternalLogTracerProperties::getGzipResponse()
{
	return gzipResponse;
}

void
OrgApacheSlingTracerInternalLogTracerProperties::setGzipResponse(ConfigNodePropertyBoolean  gzipResponse)
{
	this->gzipResponse = gzipResponse;
}


