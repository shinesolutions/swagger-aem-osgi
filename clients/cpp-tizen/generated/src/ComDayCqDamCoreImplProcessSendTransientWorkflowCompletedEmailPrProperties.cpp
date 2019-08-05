#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties()
{
	//__init();
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::~ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::__init()
{
	//processlabel = new ConfigNodePropertyString();
	//notifyonComplete = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::__cleanup()
{
	//if(processlabel != NULL) {
	//
	//delete processlabel;
	//processlabel = NULL;
	//}
	//if(notifyonComplete != NULL) {
	//
	//delete notifyonComplete;
	//notifyonComplete = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *processlabelKey = "process.label";
	node = json_object_get_member(pJsonObject, processlabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&processlabel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&processlabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyonCompleteKey = "Notify on Complete";
	node = json_object_get_member(pJsonObject, notifyonCompleteKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyonComplete, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyonComplete);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProcesslabel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProcesslabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *processlabelKey = "process.label";
	json_object_set_member(pJsonObject, processlabelKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyonComplete();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyonComplete());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyonCompleteKey = "Notify on Complete";
	json_object_set_member(pJsonObject, notifyonCompleteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::getNotifyonComplete()
{
	return notifyonComplete;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::setNotifyonComplete(ConfigNodePropertyBoolean  notifyonComplete)
{
	this->notifyonComplete = notifyonComplete;
}


