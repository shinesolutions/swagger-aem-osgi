#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties()
{
	//__init();
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::~ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::__init()
{
	//slingservletpaths = new ConfigNodePropertyString();
	//slingservletmethods = new ConfigNodePropertyString();
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::__cleanup()
{
	//if(slingservletpaths != NULL) {
	//
	//delete slingservletpaths;
	//slingservletpaths = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletpathsKey = "sling.servlet.paths";
	node = json_object_get_member(pJsonObject, slingservletpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletpaths, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	node = json_object_get_member(pJsonObject, slingservletmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletmethods, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletmethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletpaths();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletpathsKey = "sling.servlet.paths";
	json_object_set_member(pJsonObject, slingservletpathsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletmethods();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	json_object_set_member(pJsonObject, slingservletmethodsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::setSlingservletpaths(ConfigNodePropertyString  slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::setSlingservletmethods(ConfigNodePropertyString  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}


