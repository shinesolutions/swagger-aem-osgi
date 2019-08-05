#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties()
{
	//__init();
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::~OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::__init()
{
	//extensions = new ConfigNodePropertyArray();
	//minDurationMs = new ConfigNodePropertyInteger();
	//maxDurationMs = new ConfigNodePropertyInteger();
	//compactLogFormat = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::__cleanup()
{
	//if(extensions != NULL) {
	//
	//delete extensions;
	//extensions = NULL;
	//}
	//if(minDurationMs != NULL) {
	//
	//delete minDurationMs;
	//minDurationMs = NULL;
	//}
	//if(maxDurationMs != NULL) {
	//
	//delete maxDurationMs;
	//maxDurationMs = NULL;
	//}
	//if(compactLogFormat != NULL) {
	//
	//delete compactLogFormat;
	//compactLogFormat = NULL;
	//}
	//
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *extensionsKey = "extensions";
	node = json_object_get_member(pJsonObject, extensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&extensions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&extensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minDurationMsKey = "minDurationMs";
	node = json_object_get_member(pJsonObject, minDurationMsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minDurationMs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minDurationMs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxDurationMsKey = "maxDurationMs";
	node = json_object_get_member(pJsonObject, maxDurationMsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxDurationMs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxDurationMs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactLogFormatKey = "compactLogFormat";
	node = json_object_get_member(pJsonObject, compactLogFormatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&compactLogFormat, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&compactLogFormat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExtensions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExtensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extensionsKey = "extensions";
	json_object_set_member(pJsonObject, extensionsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinDurationMs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinDurationMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minDurationMsKey = "minDurationMs";
	json_object_set_member(pJsonObject, minDurationMsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxDurationMs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxDurationMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxDurationMsKey = "maxDurationMs";
	json_object_set_member(pJsonObject, maxDurationMsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCompactLogFormat();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCompactLogFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactLogFormatKey = "compactLogFormat";
	json_object_set_member(pJsonObject, compactLogFormatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getExtensions()
{
	return extensions;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setExtensions(ConfigNodePropertyArray  extensions)
{
	this->extensions = extensions;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getMinDurationMs()
{
	return minDurationMs;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setMinDurationMs(ConfigNodePropertyInteger  minDurationMs)
{
	this->minDurationMs = minDurationMs;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getMaxDurationMs()
{
	return maxDurationMs;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setMaxDurationMs(ConfigNodePropertyInteger  maxDurationMs)
{
	this->maxDurationMs = maxDurationMs;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::getCompactLogFormat()
{
	return compactLogFormat;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties::setCompactLogFormat(ConfigNodePropertyBoolean  compactLogFormat)
{
	this->compactLogFormat = compactLogFormat;
}


