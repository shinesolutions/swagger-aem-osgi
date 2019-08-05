#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties()
{
	//__init();
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::~ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::__init()
{
	//cqdams7damdamchangeeventlistenerenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::__cleanup()
{
	//if(cqdams7damdamchangeeventlistenerenabled != NULL) {
	//
	//delete cqdams7damdamchangeeventlistenerenabled;
	//cqdams7damdamchangeeventlistenerenabled = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdams7damdamchangeeventlistenerenabledKey = "cq.dam.s7dam.damchangeeventlistener.enabled";
	node = json_object_get_member(pJsonObject, cqdams7damdamchangeeventlistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdams7damdamchangeeventlistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdams7damdamchangeeventlistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdams7damdamchangeeventlistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdams7damdamchangeeventlistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damdamchangeeventlistenerenabledKey = "cq.dam.s7dam.damchangeeventlistener.enabled";
	json_object_set_member(pJsonObject, cqdams7damdamchangeeventlistenerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::getCqdams7damdamchangeeventlistenerenabled()
{
	return cqdams7damdamchangeeventlistenerenabled;
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::setCqdams7damdamchangeeventlistenerenabled(ConfigNodePropertyBoolean  cqdams7damdamchangeeventlistenerenabled)
{
	this->cqdams7damdamchangeeventlistenerenabled = cqdams7damdamchangeeventlistenerenabled;
}


