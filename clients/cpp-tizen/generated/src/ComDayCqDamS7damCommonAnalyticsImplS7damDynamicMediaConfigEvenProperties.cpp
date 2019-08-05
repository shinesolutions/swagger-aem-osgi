#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties()
{
	//__init();
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::~ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::__init()
{
	//cqdams7damdynamicmediaconfigeventlistenerenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::__cleanup()
{
	//if(cqdams7damdynamicmediaconfigeventlistenerenabled != NULL) {
	//
	//delete cqdams7damdynamicmediaconfigeventlistenerenabled;
	//cqdams7damdynamicmediaconfigeventlistenerenabled = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdams7damdynamicmediaconfigeventlistenerenabledKey = "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled";
	node = json_object_get_member(pJsonObject, cqdams7damdynamicmediaconfigeventlistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdams7damdynamicmediaconfigeventlistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdams7damdynamicmediaconfigeventlistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdams7damdynamicmediaconfigeventlistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdams7damdynamicmediaconfigeventlistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damdynamicmediaconfigeventlistenerenabledKey = "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled";
	json_object_set_member(pJsonObject, cqdams7damdynamicmediaconfigeventlistenerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::getCqdams7damdynamicmediaconfigeventlistenerenabled()
{
	return cqdams7damdynamicmediaconfigeventlistenerenabled;
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties::setCqdams7damdynamicmediaconfigeventlistenerenabled(ConfigNodePropertyBoolean  cqdams7damdynamicmediaconfigeventlistenerenabled)
{
	this->cqdams7damdynamicmediaconfigeventlistenerenabled = cqdams7damdynamicmediaconfigeventlistenerenabled;
}


