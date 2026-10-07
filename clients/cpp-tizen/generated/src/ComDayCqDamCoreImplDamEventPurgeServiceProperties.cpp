#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplDamEventPurgeServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplDamEventPurgeServiceProperties::ComDayCqDamCoreImplDamEventPurgeServiceProperties()
{
	//__init();
}

ComDayCqDamCoreImplDamEventPurgeServiceProperties::~ComDayCqDamCoreImplDamEventPurgeServiceProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
	//maxSavedActivities = new ConfigNodePropertyInteger();
	//saveInterval = new ConfigNodePropertyInteger();
	//enableActivityPurge = new ConfigNodePropertyBoolean();
	//eventTypes = new ConfigNodePropertyDropDown();
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(maxSavedActivities != NULL) {
	//
	//delete maxSavedActivities;
	//maxSavedActivities = NULL;
	//}
	//if(saveInterval != NULL) {
	//
	//delete saveInterval;
	//saveInterval = NULL;
	//}
	//if(enableActivityPurge != NULL) {
	//
	//delete enableActivityPurge;
	//enableActivityPurge = NULL;
	//}
	//if(eventTypes != NULL) {
	//
	//delete eventTypes;
	//eventTypes = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxSavedActivitiesKey = "maxSavedActivities";
	node = json_object_get_member(pJsonObject, maxSavedActivitiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxSavedActivities, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxSavedActivities);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *saveIntervalKey = "saveInterval";
	node = json_object_get_member(pJsonObject, saveIntervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&saveInterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&saveInterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableActivityPurgeKey = "enableActivityPurge";
	node = json_object_get_member(pJsonObject, enableActivityPurgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableActivityPurge, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableActivityPurge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eventTypesKey = "eventTypes";
	node = json_object_get_member(pJsonObject, eventTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&eventTypes, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&eventTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplDamEventPurgeServiceProperties::ComDayCqDamCoreImplDamEventPurgeServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplDamEventPurgeServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxSavedActivities();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxSavedActivities());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxSavedActivitiesKey = "maxSavedActivities";
	json_object_set_member(pJsonObject, maxSavedActivitiesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSaveInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSaveInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *saveIntervalKey = "saveInterval";
	json_object_set_member(pJsonObject, saveIntervalKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableActivityPurge();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableActivityPurge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableActivityPurgeKey = "enableActivityPurge";
	json_object_set_member(pJsonObject, enableActivityPurgeKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getEventTypes();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getEventTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventTypesKey = "eventTypes";
	json_object_set_member(pJsonObject, eventTypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getMaxSavedActivities()
{
	return maxSavedActivities;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setMaxSavedActivities(ConfigNodePropertyInteger  maxSavedActivities)
{
	this->maxSavedActivities = maxSavedActivities;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getSaveInterval()
{
	return saveInterval;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setSaveInterval(ConfigNodePropertyInteger  saveInterval)
{
	this->saveInterval = saveInterval;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getEnableActivityPurge()
{
	return enableActivityPurge;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setEnableActivityPurge(ConfigNodePropertyBoolean  enableActivityPurge)
{
	this->enableActivityPurge = enableActivityPurge;
}

ConfigNodePropertyDropDown
ComDayCqDamCoreImplDamEventPurgeServiceProperties::getEventTypes()
{
	return eventTypes;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceProperties::setEventTypes(ConfigNodePropertyDropDown  eventTypes)
{
	this->eventTypes = eventTypes;
}


