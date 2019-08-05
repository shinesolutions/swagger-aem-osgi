#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplWCMDebugFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplWCMDebugFilterProperties::ComDayCqWcmCoreImplWCMDebugFilterProperties()
{
	//__init();
}

ComDayCqWcmCoreImplWCMDebugFilterProperties::~ComDayCqWcmCoreImplWCMDebugFilterProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::__init()
{
	//wcmdbgfilterenabled = new ConfigNodePropertyBoolean();
	//wcmdbgfilterjspDebug = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::__cleanup()
{
	//if(wcmdbgfilterenabled != NULL) {
	//
	//delete wcmdbgfilterenabled;
	//wcmdbgfilterenabled = NULL;
	//}
	//if(wcmdbgfilterjspDebug != NULL) {
	//
	//delete wcmdbgfilterjspDebug;
	//wcmdbgfilterjspDebug = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *wcmdbgfilterenabledKey = "wcmdbgfilter.enabled";
	node = json_object_get_member(pJsonObject, wcmdbgfilterenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&wcmdbgfilterenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&wcmdbgfilterenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *wcmdbgfilterjspDebugKey = "wcmdbgfilter.jspDebug";
	node = json_object_get_member(pJsonObject, wcmdbgfilterjspDebugKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&wcmdbgfilterjspDebug, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&wcmdbgfilterjspDebug);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplWCMDebugFilterProperties::ComDayCqWcmCoreImplWCMDebugFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplWCMDebugFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getWcmdbgfilterenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getWcmdbgfilterenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *wcmdbgfilterenabledKey = "wcmdbgfilter.enabled";
	json_object_set_member(pJsonObject, wcmdbgfilterenabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getWcmdbgfilterjspDebug();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getWcmdbgfilterjspDebug());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *wcmdbgfilterjspDebugKey = "wcmdbgfilter.jspDebug";
	json_object_set_member(pJsonObject, wcmdbgfilterjspDebugKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplWCMDebugFilterProperties::getWcmdbgfilterenabled()
{
	return wcmdbgfilterenabled;
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::setWcmdbgfilterenabled(ConfigNodePropertyBoolean  wcmdbgfilterenabled)
{
	this->wcmdbgfilterenabled = wcmdbgfilterenabled;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplWCMDebugFilterProperties::getWcmdbgfilterjspDebug()
{
	return wcmdbgfilterjspDebug;
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::setWcmdbgfilterjspDebug(ConfigNodePropertyBoolean  wcmdbgfilterjspDebug)
{
	this->wcmdbgfilterjspDebug = wcmdbgfilterjspDebug;
}


