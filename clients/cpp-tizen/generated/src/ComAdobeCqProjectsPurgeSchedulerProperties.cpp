#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqProjectsPurgeSchedulerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqProjectsPurgeSchedulerProperties::ComAdobeCqProjectsPurgeSchedulerProperties()
{
	//__init();
}

ComAdobeCqProjectsPurgeSchedulerProperties::~ComAdobeCqProjectsPurgeSchedulerProperties()
{
	//__cleanup();
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::__init()
{
	//scheduledpurgename = new ConfigNodePropertyString();
	//scheduledpurgepurgeActive = new ConfigNodePropertyBoolean();
	//scheduledpurgetemplates = new ConfigNodePropertyArray();
	//scheduledpurgepurgeGroups = new ConfigNodePropertyBoolean();
	//scheduledpurgepurgeAssets = new ConfigNodePropertyBoolean();
	//scheduledpurgeterminateRunningWorkflows = new ConfigNodePropertyBoolean();
	//scheduledpurgedaysold = new ConfigNodePropertyInteger();
	//scheduledpurgesaveThreshold = new ConfigNodePropertyInteger();
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::__cleanup()
{
	//if(scheduledpurgename != NULL) {
	//
	//delete scheduledpurgename;
	//scheduledpurgename = NULL;
	//}
	//if(scheduledpurgepurgeActive != NULL) {
	//
	//delete scheduledpurgepurgeActive;
	//scheduledpurgepurgeActive = NULL;
	//}
	//if(scheduledpurgetemplates != NULL) {
	//
	//delete scheduledpurgetemplates;
	//scheduledpurgetemplates = NULL;
	//}
	//if(scheduledpurgepurgeGroups != NULL) {
	//
	//delete scheduledpurgepurgeGroups;
	//scheduledpurgepurgeGroups = NULL;
	//}
	//if(scheduledpurgepurgeAssets != NULL) {
	//
	//delete scheduledpurgepurgeAssets;
	//scheduledpurgepurgeAssets = NULL;
	//}
	//if(scheduledpurgeterminateRunningWorkflows != NULL) {
	//
	//delete scheduledpurgeterminateRunningWorkflows;
	//scheduledpurgeterminateRunningWorkflows = NULL;
	//}
	//if(scheduledpurgedaysold != NULL) {
	//
	//delete scheduledpurgedaysold;
	//scheduledpurgedaysold = NULL;
	//}
	//if(scheduledpurgesaveThreshold != NULL) {
	//
	//delete scheduledpurgesaveThreshold;
	//scheduledpurgesaveThreshold = NULL;
	//}
	//
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scheduledpurgenameKey = "scheduledpurge.name";
	node = json_object_get_member(pJsonObject, scheduledpurgenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scheduledpurgename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scheduledpurgename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgepurgeActiveKey = "scheduledpurge.purgeActive";
	node = json_object_get_member(pJsonObject, scheduledpurgepurgeActiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&scheduledpurgepurgeActive, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&scheduledpurgepurgeActive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgetemplatesKey = "scheduledpurge.templates";
	node = json_object_get_member(pJsonObject, scheduledpurgetemplatesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&scheduledpurgetemplates, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&scheduledpurgetemplates);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgepurgeGroupsKey = "scheduledpurge.purgeGroups";
	node = json_object_get_member(pJsonObject, scheduledpurgepurgeGroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&scheduledpurgepurgeGroups, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&scheduledpurgepurgeGroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgepurgeAssetsKey = "scheduledpurge.purgeAssets";
	node = json_object_get_member(pJsonObject, scheduledpurgepurgeAssetsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&scheduledpurgepurgeAssets, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&scheduledpurgepurgeAssets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgeterminateRunningWorkflowsKey = "scheduledpurge.terminateRunningWorkflows";
	node = json_object_get_member(pJsonObject, scheduledpurgeterminateRunningWorkflowsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&scheduledpurgeterminateRunningWorkflows, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&scheduledpurgeterminateRunningWorkflows);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgedaysoldKey = "scheduledpurge.daysold";
	node = json_object_get_member(pJsonObject, scheduledpurgedaysoldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&scheduledpurgedaysold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&scheduledpurgedaysold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgesaveThresholdKey = "scheduledpurge.saveThreshold";
	node = json_object_get_member(pJsonObject, scheduledpurgesaveThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&scheduledpurgesaveThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&scheduledpurgesaveThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqProjectsPurgeSchedulerProperties::ComAdobeCqProjectsPurgeSchedulerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqProjectsPurgeSchedulerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScheduledpurgename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScheduledpurgename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgenameKey = "scheduledpurge.name";
	json_object_set_member(pJsonObject, scheduledpurgenameKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getScheduledpurgepurgeActive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getScheduledpurgepurgeActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgepurgeActiveKey = "scheduledpurge.purgeActive";
	json_object_set_member(pJsonObject, scheduledpurgepurgeActiveKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getScheduledpurgetemplates();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getScheduledpurgetemplates());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgetemplatesKey = "scheduledpurge.templates";
	json_object_set_member(pJsonObject, scheduledpurgetemplatesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getScheduledpurgepurgeGroups();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getScheduledpurgepurgeGroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgepurgeGroupsKey = "scheduledpurge.purgeGroups";
	json_object_set_member(pJsonObject, scheduledpurgepurgeGroupsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getScheduledpurgepurgeAssets();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getScheduledpurgepurgeAssets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgepurgeAssetsKey = "scheduledpurge.purgeAssets";
	json_object_set_member(pJsonObject, scheduledpurgepurgeAssetsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getScheduledpurgeterminateRunningWorkflows();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getScheduledpurgeterminateRunningWorkflows());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgeterminateRunningWorkflowsKey = "scheduledpurge.terminateRunningWorkflows";
	json_object_set_member(pJsonObject, scheduledpurgeterminateRunningWorkflowsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getScheduledpurgedaysold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getScheduledpurgedaysold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgedaysoldKey = "scheduledpurge.daysold";
	json_object_set_member(pJsonObject, scheduledpurgedaysoldKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getScheduledpurgesaveThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getScheduledpurgesaveThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgesaveThresholdKey = "scheduledpurge.saveThreshold";
	json_object_set_member(pJsonObject, scheduledpurgesaveThresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgename()
{
	return scheduledpurgename;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgename(ConfigNodePropertyString  scheduledpurgename)
{
	this->scheduledpurgename = scheduledpurgename;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgepurgeActive()
{
	return scheduledpurgepurgeActive;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgepurgeActive(ConfigNodePropertyBoolean  scheduledpurgepurgeActive)
{
	this->scheduledpurgepurgeActive = scheduledpurgepurgeActive;
}

ConfigNodePropertyArray
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgetemplates()
{
	return scheduledpurgetemplates;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgetemplates(ConfigNodePropertyArray  scheduledpurgetemplates)
{
	this->scheduledpurgetemplates = scheduledpurgetemplates;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgepurgeGroups()
{
	return scheduledpurgepurgeGroups;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgepurgeGroups(ConfigNodePropertyBoolean  scheduledpurgepurgeGroups)
{
	this->scheduledpurgepurgeGroups = scheduledpurgepurgeGroups;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgepurgeAssets()
{
	return scheduledpurgepurgeAssets;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgepurgeAssets(ConfigNodePropertyBoolean  scheduledpurgepurgeAssets)
{
	this->scheduledpurgepurgeAssets = scheduledpurgepurgeAssets;
}

ConfigNodePropertyBoolean
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgeterminateRunningWorkflows()
{
	return scheduledpurgeterminateRunningWorkflows;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgeterminateRunningWorkflows(ConfigNodePropertyBoolean  scheduledpurgeterminateRunningWorkflows)
{
	this->scheduledpurgeterminateRunningWorkflows = scheduledpurgeterminateRunningWorkflows;
}

ConfigNodePropertyInteger
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgedaysold()
{
	return scheduledpurgedaysold;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgedaysold(ConfigNodePropertyInteger  scheduledpurgedaysold)
{
	this->scheduledpurgedaysold = scheduledpurgedaysold;
}

ConfigNodePropertyInteger
ComAdobeCqProjectsPurgeSchedulerProperties::getScheduledpurgesaveThreshold()
{
	return scheduledpurgesaveThreshold;
}

void
ComAdobeCqProjectsPurgeSchedulerProperties::setScheduledpurgesaveThreshold(ConfigNodePropertyInteger  scheduledpurgesaveThreshold)
{
	this->scheduledpurgesaveThreshold = scheduledpurgesaveThreshold;
}


