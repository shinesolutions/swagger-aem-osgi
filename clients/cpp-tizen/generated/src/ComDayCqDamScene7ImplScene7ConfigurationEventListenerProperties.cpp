#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties()
{
	//__init();
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::~ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties()
{
	//__cleanup();
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::__init()
{
	//cqdamscene7configurationeventlistenerenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::__cleanup()
{
	//if(cqdamscene7configurationeventlistenerenabled != NULL) {
	//
	//delete cqdamscene7configurationeventlistenerenabled;
	//cqdamscene7configurationeventlistenerenabled = NULL;
	//}
	//
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamscene7configurationeventlistenerenabledKey = "cq.dam.scene7.configurationeventlistener.enabled";
	node = json_object_get_member(pJsonObject, cqdamscene7configurationeventlistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamscene7configurationeventlistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamscene7configurationeventlistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamscene7configurationeventlistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamscene7configurationeventlistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7configurationeventlistenerenabledKey = "cq.dam.scene7.configurationeventlistener.enabled";
	json_object_set_member(pJsonObject, cqdamscene7configurationeventlistenerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::getCqdamscene7configurationeventlistenerenabled()
{
	return cqdamscene7configurationeventlistenerenabled;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::setCqdamscene7configurationeventlistenerenabled(ConfigNodePropertyBoolean  cqdamscene7configurationeventlistenerenabled)
{
	this->cqdamscene7configurationeventlistenerenabled = cqdamscene7configurationeventlistenerenabled;
}


