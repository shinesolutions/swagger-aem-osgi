#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowPurgeSchedulerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowPurgeSchedulerProperties::ComAdobeGraniteWorkflowPurgeSchedulerProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowPurgeSchedulerProperties::~ComAdobeGraniteWorkflowPurgeSchedulerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::__init()
{
	//scheduledpurgename = new ConfigNodePropertyString();
	//scheduledpurgeworkflowStatus = new ConfigNodePropertyDropDown();
	//scheduledpurgemodelIds = new ConfigNodePropertyArray();
	//scheduledpurgedaysold = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::__cleanup()
{
	//if(scheduledpurgename != NULL) {
	//
	//delete scheduledpurgename;
	//scheduledpurgename = NULL;
	//}
	//if(scheduledpurgeworkflowStatus != NULL) {
	//
	//delete scheduledpurgeworkflowStatus;
	//scheduledpurgeworkflowStatus = NULL;
	//}
	//if(scheduledpurgemodelIds != NULL) {
	//
	//delete scheduledpurgemodelIds;
	//scheduledpurgemodelIds = NULL;
	//}
	//if(scheduledpurgedaysold != NULL) {
	//
	//delete scheduledpurgedaysold;
	//scheduledpurgedaysold = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::fromJson(char* jsonStr)
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
	const gchar *scheduledpurgeworkflowStatusKey = "scheduledpurge.workflowStatus";
	node = json_object_get_member(pJsonObject, scheduledpurgeworkflowStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&scheduledpurgeworkflowStatus, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&scheduledpurgeworkflowStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduledpurgemodelIdsKey = "scheduledpurge.modelIds";
	node = json_object_get_member(pJsonObject, scheduledpurgemodelIdsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&scheduledpurgemodelIds, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&scheduledpurgemodelIds);
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
}

ComAdobeGraniteWorkflowPurgeSchedulerProperties::ComAdobeGraniteWorkflowPurgeSchedulerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowPurgeSchedulerProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getScheduledpurgeworkflowStatus();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getScheduledpurgeworkflowStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgeworkflowStatusKey = "scheduledpurge.workflowStatus";
	json_object_set_member(pJsonObject, scheduledpurgeworkflowStatusKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getScheduledpurgemodelIds();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getScheduledpurgemodelIds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduledpurgemodelIdsKey = "scheduledpurge.modelIds";
	json_object_set_member(pJsonObject, scheduledpurgemodelIdsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgename()
{
	return scheduledpurgename;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgename(ConfigNodePropertyString  scheduledpurgename)
{
	this->scheduledpurgename = scheduledpurgename;
}

ConfigNodePropertyDropDown
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgeworkflowStatus()
{
	return scheduledpurgeworkflowStatus;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgeworkflowStatus(ConfigNodePropertyDropDown  scheduledpurgeworkflowStatus)
{
	this->scheduledpurgeworkflowStatus = scheduledpurgeworkflowStatus;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgemodelIds()
{
	return scheduledpurgemodelIds;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgemodelIds(ConfigNodePropertyArray  scheduledpurgemodelIds)
{
	this->scheduledpurgemodelIds = scheduledpurgemodelIds;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowPurgeSchedulerProperties::getScheduledpurgedaysold()
{
	return scheduledpurgedaysold;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerProperties::setScheduledpurgedaysold(ConfigNodePropertyInteger  scheduledpurgedaysold)
{
	this->scheduledpurgedaysold = scheduledpurgedaysold;
}


