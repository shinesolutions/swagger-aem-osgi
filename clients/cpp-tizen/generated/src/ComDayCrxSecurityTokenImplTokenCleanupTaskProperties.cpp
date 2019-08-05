#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties()
{
	//__init();
}

ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::~ComDayCrxSecurityTokenImplTokenCleanupTaskProperties()
{
	//__cleanup();
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::__init()
{
	//enabletokencleanuptask = new ConfigNodePropertyBoolean();
	//schedulerexpression = new ConfigNodePropertyString();
	//batchsize = new ConfigNodePropertyInteger();
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::__cleanup()
{
	//if(enabletokencleanuptask != NULL) {
	//
	//delete enabletokencleanuptask;
	//enabletokencleanuptask = NULL;
	//}
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(batchsize != NULL) {
	//
	//delete batchsize;
	//batchsize = NULL;
	//}
	//
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabletokencleanuptaskKey = "enable.token.cleanup.task";
	node = json_object_get_member(pJsonObject, enabletokencleanuptaskKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabletokencleanuptask, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabletokencleanuptask);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	const gchar *batchsizeKey = "batch.size";
	node = json_object_get_member(pJsonObject, batchsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&batchsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&batchsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabletokencleanuptask();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabletokencleanuptask());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabletokencleanuptaskKey = "enable.token.cleanup.task";
	json_object_set_member(pJsonObject, enabletokencleanuptaskKey, node);
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
		ConfigNodePropertyInteger obj = getBatchsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBatchsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *batchsizeKey = "batch.size";
	json_object_set_member(pJsonObject, batchsizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::getEnabletokencleanuptask()
{
	return enabletokencleanuptask;
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::setEnabletokencleanuptask(ConfigNodePropertyBoolean  enabletokencleanuptask)
{
	this->enabletokencleanuptask = enabletokencleanuptask;
}

ConfigNodePropertyString
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::getBatchsize()
{
	return batchsize;
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::setBatchsize(ConfigNodePropertyInteger  batchsize)
{
	this->batchsize = batchsize;
}


