#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties()
{
	//__init();
}

OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::~OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties()
{
	//__cleanup();
}

void
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::__init()
{
	//orgapacheslingscriptingsightlyjsbindings = new ConfigNodePropertyArray();
}

void
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::__cleanup()
{
	//if(orgapacheslingscriptingsightlyjsbindings != NULL) {
	//
	//delete orgapacheslingscriptingsightlyjsbindings;
	//orgapacheslingscriptingsightlyjsbindings = NULL;
	//}
	//
}

void
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslingscriptingsightlyjsbindingsKey = "org.apache.sling.scripting.sightly.js.bindings";
	node = json_object_get_member(pJsonObject, orgapacheslingscriptingsightlyjsbindingsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&orgapacheslingscriptingsightlyjsbindings, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&orgapacheslingscriptingsightlyjsbindings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOrgapacheslingscriptingsightlyjsbindings();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOrgapacheslingscriptingsightlyjsbindings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingscriptingsightlyjsbindingsKey = "org.apache.sling.scripting.sightly.js.bindings";
	json_object_set_member(pJsonObject, orgapacheslingscriptingsightlyjsbindingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::getOrgapacheslingscriptingsightlyjsbindings()
{
	return orgapacheslingscriptingsightlyjsbindings;
}

void
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::setOrgapacheslingscriptingsightlyjsbindings(ConfigNodePropertyArray  orgapacheslingscriptingsightlyjsbindings)
{
	this->orgapacheslingscriptingsightlyjsbindings = orgapacheslingscriptingsightlyjsbindings;
}


