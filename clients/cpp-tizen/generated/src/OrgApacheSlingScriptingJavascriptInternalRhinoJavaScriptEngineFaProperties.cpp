#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties()
{
	//__init();
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::~OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties()
{
	//__cleanup();
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::__init()
{
	//orgapacheslingscriptingjavascriptrhinooptLevel = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::__cleanup()
{
	//if(orgapacheslingscriptingjavascriptrhinooptLevel != NULL) {
	//
	//delete orgapacheslingscriptingjavascriptrhinooptLevel;
	//orgapacheslingscriptingjavascriptrhinooptLevel = NULL;
	//}
	//
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslingscriptingjavascriptrhinooptLevelKey = "org.apache.sling.scripting.javascript.rhino.optLevel";
	node = json_object_get_member(pJsonObject, orgapacheslingscriptingjavascriptrhinooptLevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingscriptingjavascriptrhinooptLevel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingscriptingjavascriptrhinooptLevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingscriptingjavascriptrhinooptLevel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingscriptingjavascriptrhinooptLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingscriptingjavascriptrhinooptLevelKey = "org.apache.sling.scripting.javascript.rhino.optLevel";
	json_object_set_member(pJsonObject, orgapacheslingscriptingjavascriptrhinooptLevelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::getOrgapacheslingscriptingjavascriptrhinooptLevel()
{
	return orgapacheslingscriptingjavascriptrhinooptLevel;
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::setOrgapacheslingscriptingjavascriptrhinooptLevel(ConfigNodePropertyInteger  orgapacheslingscriptingjavascriptrhinooptLevel)
{
	this->orgapacheslingscriptingjavascriptrhinooptLevel = orgapacheslingscriptingjavascriptrhinooptLevel;
}


