#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsFindReplaceServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsFindReplaceServletProperties::ComDayCqWcmCoreImplServletsFindReplaceServletProperties()
{
	//__init();
}

ComDayCqWcmCoreImplServletsFindReplaceServletProperties::~ComDayCqWcmCoreImplServletsFindReplaceServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::__init()
{
	//scope = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::__cleanup()
{
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&scope, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&scope);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplServletsFindReplaceServletProperties::ComDayCqWcmCoreImplServletsFindReplaceServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getScope();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getScope());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::getScope()
{
	return scope;
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletProperties::setScope(ConfigNodePropertyArray  scope)
{
	this->scope = scope;
}


