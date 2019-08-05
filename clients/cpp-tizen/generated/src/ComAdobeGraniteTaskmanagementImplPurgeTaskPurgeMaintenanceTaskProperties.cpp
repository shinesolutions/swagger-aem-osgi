#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties()
{
	//__init();
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::~ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::__init()
{
	//purgeCompleted = new ConfigNodePropertyBoolean();
	//completedAge = new ConfigNodePropertyInteger();
	//purgeActive = new ConfigNodePropertyBoolean();
	//activeAge = new ConfigNodePropertyInteger();
	//saveThreshold = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::__cleanup()
{
	//if(purgeCompleted != NULL) {
	//
	//delete purgeCompleted;
	//purgeCompleted = NULL;
	//}
	//if(completedAge != NULL) {
	//
	//delete completedAge;
	//completedAge = NULL;
	//}
	//if(purgeActive != NULL) {
	//
	//delete purgeActive;
	//purgeActive = NULL;
	//}
	//if(activeAge != NULL) {
	//
	//delete activeAge;
	//activeAge = NULL;
	//}
	//if(saveThreshold != NULL) {
	//
	//delete saveThreshold;
	//saveThreshold = NULL;
	//}
	//
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *purgeCompletedKey = "purgeCompleted";
	node = json_object_get_member(pJsonObject, purgeCompletedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&purgeCompleted, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&purgeCompleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *completedAgeKey = "completedAge";
	node = json_object_get_member(pJsonObject, completedAgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&completedAge, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&completedAge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *purgeActiveKey = "purgeActive";
	node = json_object_get_member(pJsonObject, purgeActiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&purgeActive, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&purgeActive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *activeAgeKey = "activeAge";
	node = json_object_get_member(pJsonObject, activeAgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&activeAge, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&activeAge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *saveThresholdKey = "saveThreshold";
	node = json_object_get_member(pJsonObject, saveThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&saveThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&saveThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPurgeCompleted();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPurgeCompleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *purgeCompletedKey = "purgeCompleted";
	json_object_set_member(pJsonObject, purgeCompletedKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompletedAge();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompletedAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *completedAgeKey = "completedAge";
	json_object_set_member(pJsonObject, completedAgeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPurgeActive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPurgeActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *purgeActiveKey = "purgeActive";
	json_object_set_member(pJsonObject, purgeActiveKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getActiveAge();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getActiveAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *activeAgeKey = "activeAge";
	json_object_set_member(pJsonObject, activeAgeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSaveThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSaveThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *saveThresholdKey = "saveThreshold";
	json_object_set_member(pJsonObject, saveThresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getPurgeCompleted()
{
	return purgeCompleted;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setPurgeCompleted(ConfigNodePropertyBoolean  purgeCompleted)
{
	this->purgeCompleted = purgeCompleted;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getCompletedAge()
{
	return completedAge;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setCompletedAge(ConfigNodePropertyInteger  completedAge)
{
	this->completedAge = completedAge;
}

ConfigNodePropertyBoolean
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getPurgeActive()
{
	return purgeActive;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setPurgeActive(ConfigNodePropertyBoolean  purgeActive)
{
	this->purgeActive = purgeActive;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getActiveAge()
{
	return activeAge;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setActiveAge(ConfigNodePropertyInteger  activeAge)
{
	this->activeAge = activeAge;
}

ConfigNodePropertyInteger
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::getSaveThreshold()
{
	return saveThreshold;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties::setSaveThreshold(ConfigNodePropertyInteger  saveThreshold)
{
	this->saveThreshold = saveThreshold;
}


