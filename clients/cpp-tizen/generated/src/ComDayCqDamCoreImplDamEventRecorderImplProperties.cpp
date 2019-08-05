#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplDamEventRecorderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplDamEventRecorderImplProperties::ComDayCqDamCoreImplDamEventRecorderImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplDamEventRecorderImplProperties::~ComDayCqDamCoreImplDamEventRecorderImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
	//eventqueuelength = new ConfigNodePropertyInteger();
	//eventrecorderenabled = new ConfigNodePropertyBoolean();
	//eventrecorderblacklist = new ConfigNodePropertyArray();
	//eventrecordereventtypes = new ConfigNodePropertyDropDown();
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//if(eventqueuelength != NULL) {
	//
	//delete eventqueuelength;
	//eventqueuelength = NULL;
	//}
	//if(eventrecorderenabled != NULL) {
	//
	//delete eventrecorderenabled;
	//eventrecorderenabled = NULL;
	//}
	//if(eventrecorderblacklist != NULL) {
	//
	//delete eventrecorderblacklist;
	//eventrecorderblacklist = NULL;
	//}
	//if(eventrecordereventtypes != NULL) {
	//
	//delete eventrecordereventtypes;
	//eventrecordereventtypes = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::fromJson(char* jsonStr)
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
	const gchar *eventqueuelengthKey = "event.queue.length";
	node = json_object_get_member(pJsonObject, eventqueuelengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&eventqueuelength, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&eventqueuelength);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eventrecorderenabledKey = "eventrecorder.enabled";
	node = json_object_get_member(pJsonObject, eventrecorderenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&eventrecorderenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&eventrecorderenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eventrecorderblacklistKey = "eventrecorder.blacklist";
	node = json_object_get_member(pJsonObject, eventrecorderblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&eventrecorderblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&eventrecorderblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eventrecordereventtypesKey = "eventrecorder.eventtypes";
	node = json_object_get_member(pJsonObject, eventrecordereventtypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&eventrecordereventtypes, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&eventrecordereventtypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplDamEventRecorderImplProperties::ComDayCqDamCoreImplDamEventRecorderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplDamEventRecorderImplProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getEventqueuelength();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getEventqueuelength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventqueuelengthKey = "event.queue.length";
	json_object_set_member(pJsonObject, eventqueuelengthKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEventrecorderenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEventrecorderenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventrecorderenabledKey = "eventrecorder.enabled";
	json_object_set_member(pJsonObject, eventrecorderenabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getEventrecorderblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getEventrecorderblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventrecorderblacklistKey = "eventrecorder.blacklist";
	json_object_set_member(pJsonObject, eventrecorderblacklistKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getEventrecordereventtypes();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getEventrecordereventtypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventrecordereventtypesKey = "eventrecorder.eventtypes";
	json_object_set_member(pJsonObject, eventrecordereventtypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventqueuelength()
{
	return eventqueuelength;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventqueuelength(ConfigNodePropertyInteger  eventqueuelength)
{
	this->eventqueuelength = eventqueuelength;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventrecorderenabled()
{
	return eventrecorderenabled;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventrecorderenabled(ConfigNodePropertyBoolean  eventrecorderenabled)
{
	this->eventrecorderenabled = eventrecorderenabled;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventrecorderblacklist()
{
	return eventrecorderblacklist;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventrecorderblacklist(ConfigNodePropertyArray  eventrecorderblacklist)
{
	this->eventrecorderblacklist = eventrecorderblacklist;
}

ConfigNodePropertyDropDown
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventrecordereventtypes()
{
	return eventrecordereventtypes;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventrecordereventtypes(ConfigNodePropertyDropDown  eventrecordereventtypes)
{
	this->eventrecordereventtypes = eventrecordereventtypes;
}


