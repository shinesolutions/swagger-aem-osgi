#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplDamChangeEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplDamChangeEventListenerProperties::ComDayCqDamCoreImplDamChangeEventListenerProperties()
{
	//__init();
}

ComDayCqDamCoreImplDamChangeEventListenerProperties::~ComDayCqDamCoreImplDamChangeEventListenerProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplDamChangeEventListenerProperties::__init()
{
	//changeeventlistenerobservedpaths = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplDamChangeEventListenerProperties::__cleanup()
{
	//if(changeeventlistenerobservedpaths != NULL) {
	//
	//delete changeeventlistenerobservedpaths;
	//changeeventlistenerobservedpaths = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplDamChangeEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changeeventlistenerobservedpathsKey = "changeeventlistener.observed.paths";
	node = json_object_get_member(pJsonObject, changeeventlistenerobservedpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&changeeventlistenerobservedpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&changeeventlistenerobservedpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplDamChangeEventListenerProperties::ComDayCqDamCoreImplDamChangeEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplDamChangeEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getChangeeventlistenerobservedpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getChangeeventlistenerobservedpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *changeeventlistenerobservedpathsKey = "changeeventlistener.observed.paths";
	json_object_set_member(pJsonObject, changeeventlistenerobservedpathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplDamChangeEventListenerProperties::getChangeeventlistenerobservedpaths()
{
	return changeeventlistenerobservedpaths;
}

void
ComDayCqDamCoreImplDamChangeEventListenerProperties::setChangeeventlistenerobservedpaths(ConfigNodePropertyArray  changeeventlistenerobservedpaths)
{
	this->changeeventlistenerobservedpaths = changeeventlistenerobservedpaths;
}


