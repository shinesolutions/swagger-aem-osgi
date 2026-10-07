#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmScriptingImplBVPManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmScriptingImplBVPManagerProperties::ComDayCqWcmScriptingImplBVPManagerProperties()
{
	//__init();
}

ComDayCqWcmScriptingImplBVPManagerProperties::~ComDayCqWcmScriptingImplBVPManagerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmScriptingImplBVPManagerProperties::__init()
{
	//comdaycqwcmscriptingbvpscriptengines = new ConfigNodePropertyArray();
}

void
ComDayCqWcmScriptingImplBVPManagerProperties::__cleanup()
{
	//if(comdaycqwcmscriptingbvpscriptengines != NULL) {
	//
	//delete comdaycqwcmscriptingbvpscriptengines;
	//comdaycqwcmscriptingbvpscriptengines = NULL;
	//}
	//
}

void
ComDayCqWcmScriptingImplBVPManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comdaycqwcmscriptingbvpscriptenginesKey = "com.day.cq.wcm.scripting.bvp.script.engines";
	node = json_object_get_member(pJsonObject, comdaycqwcmscriptingbvpscriptenginesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comdaycqwcmscriptingbvpscriptengines, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comdaycqwcmscriptingbvpscriptengines);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmScriptingImplBVPManagerProperties::ComDayCqWcmScriptingImplBVPManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmScriptingImplBVPManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComdaycqwcmscriptingbvpscriptengines();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComdaycqwcmscriptingbvpscriptengines());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comdaycqwcmscriptingbvpscriptenginesKey = "com.day.cq.wcm.scripting.bvp.script.engines";
	json_object_set_member(pJsonObject, comdaycqwcmscriptingbvpscriptenginesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmScriptingImplBVPManagerProperties::getComdaycqwcmscriptingbvpscriptengines()
{
	return comdaycqwcmscriptingbvpscriptengines;
}

void
ComDayCqWcmScriptingImplBVPManagerProperties::setComdaycqwcmscriptingbvpscriptengines(ConfigNodePropertyArray  comdaycqwcmscriptingbvpscriptengines)
{
	this->comdaycqwcmscriptingbvpscriptengines = comdaycqwcmscriptingbvpscriptengines;
}


