#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties()
{
	//__init();
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::~ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties()
{
	//__cleanup();
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::__init()
{
	//notifyonupdate = new ConfigNodePropertyBoolean();
	//notifyoncomplete = new ConfigNodePropertyBoolean();
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::__cleanup()
{
	//if(notifyonupdate != NULL) {
	//
	//delete notifyonupdate;
	//notifyonupdate = NULL;
	//}
	//if(notifyoncomplete != NULL) {
	//
	//delete notifyoncomplete;
	//notifyoncomplete = NULL;
	//}
	//
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *notifyonupdateKey = "notify.onupdate";
	node = json_object_get_member(pJsonObject, notifyonupdateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyonupdate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyonupdate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyoncompleteKey = "notify.oncomplete";
	node = json_object_get_member(pJsonObject, notifyoncompleteKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyoncomplete, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyoncomplete);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyonupdate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyonupdate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyonupdateKey = "notify.onupdate";
	json_object_set_member(pJsonObject, notifyonupdateKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyoncomplete();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyoncomplete());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyoncompleteKey = "notify.oncomplete";
	json_object_set_member(pJsonObject, notifyoncompleteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::getNotifyonupdate()
{
	return notifyonupdate;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::setNotifyonupdate(ConfigNodePropertyBoolean  notifyonupdate)
{
	this->notifyonupdate = notifyonupdate;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::getNotifyoncomplete()
{
	return notifyoncomplete;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::setNotifyoncomplete(ConfigNodePropertyBoolean  notifyoncomplete)
{
	this->notifyoncomplete = notifyoncomplete;
}


