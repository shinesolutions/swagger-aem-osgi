#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties()
{
	//__init();
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::~ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties()
{
	//__cleanup();
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::__init()
{
	//cqdamscene7damchangeeventlistenerenabled = new ConfigNodePropertyBoolean();
	//cqdamscene7damchangeeventlistenerobservedpaths = new ConfigNodePropertyArray();
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::__cleanup()
{
	//if(cqdamscene7damchangeeventlistenerenabled != NULL) {
	//
	//delete cqdamscene7damchangeeventlistenerenabled;
	//cqdamscene7damchangeeventlistenerenabled = NULL;
	//}
	//if(cqdamscene7damchangeeventlistenerobservedpaths != NULL) {
	//
	//delete cqdamscene7damchangeeventlistenerobservedpaths;
	//cqdamscene7damchangeeventlistenerobservedpaths = NULL;
	//}
	//
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamscene7damchangeeventlistenerenabledKey = "cq.dam.scene7.damchangeeventlistener.enabled";
	node = json_object_get_member(pJsonObject, cqdamscene7damchangeeventlistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamscene7damchangeeventlistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamscene7damchangeeventlistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamscene7damchangeeventlistenerobservedpathsKey = "cq.dam.scene7.damchangeeventlistener.observed.paths";
	node = json_object_get_member(pJsonObject, cqdamscene7damchangeeventlistenerobservedpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdamscene7damchangeeventlistenerobservedpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdamscene7damchangeeventlistenerobservedpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamscene7damchangeeventlistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamscene7damchangeeventlistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7damchangeeventlistenerenabledKey = "cq.dam.scene7.damchangeeventlistener.enabled";
	json_object_set_member(pJsonObject, cqdamscene7damchangeeventlistenerenabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdamscene7damchangeeventlistenerobservedpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdamscene7damchangeeventlistenerobservedpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7damchangeeventlistenerobservedpathsKey = "cq.dam.scene7.damchangeeventlistener.observed.paths";
	json_object_set_member(pJsonObject, cqdamscene7damchangeeventlistenerobservedpathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::getCqdamscene7damchangeeventlistenerenabled()
{
	return cqdamscene7damchangeeventlistenerenabled;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::setCqdamscene7damchangeeventlistenerenabled(ConfigNodePropertyBoolean  cqdamscene7damchangeeventlistenerenabled)
{
	this->cqdamscene7damchangeeventlistenerenabled = cqdamscene7damchangeeventlistenerenabled;
}

ConfigNodePropertyArray
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::getCqdamscene7damchangeeventlistenerobservedpaths()
{
	return cqdamscene7damchangeeventlistenerobservedpaths;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::setCqdamscene7damchangeeventlistenerobservedpaths(ConfigNodePropertyArray  cqdamscene7damchangeeventlistenerobservedpaths)
{
	this->cqdamscene7damchangeeventlistenerobservedpaths = cqdamscene7damchangeeventlistenerobservedpaths;
}


