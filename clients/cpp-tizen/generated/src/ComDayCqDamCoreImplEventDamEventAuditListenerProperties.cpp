#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplEventDamEventAuditListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
{
	//__init();
}

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::~ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventfilterKey = "event.filter";
	node = json_object_get_member(pJsonObject, eventfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventfilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventfilter);
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
}

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::ComDayCqDamCoreImplEventDamEventAuditListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventfilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventfilterKey = "event.filter";
	json_object_set_member(pJsonObject, eventfilterKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}


