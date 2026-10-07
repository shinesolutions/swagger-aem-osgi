#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationImplPageRedirectServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationImplPageRedirectServletProperties::ComDayCqWcmFoundationImplPageRedirectServletProperties()
{
	//__init();
}

ComDayCqWcmFoundationImplPageRedirectServletProperties::~ComDayCqWcmFoundationImplPageRedirectServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationImplPageRedirectServletProperties::__init()
{
	//excludedresourcetypes = new ConfigNodePropertyArray();
}

void
ComDayCqWcmFoundationImplPageRedirectServletProperties::__cleanup()
{
	//if(excludedresourcetypes != NULL) {
	//
	//delete excludedresourcetypes;
	//excludedresourcetypes = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationImplPageRedirectServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *excludedresourcetypesKey = "excluded.resource.types";
	node = json_object_get_member(pJsonObject, excludedresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excludedresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excludedresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationImplPageRedirectServletProperties::ComDayCqWcmFoundationImplPageRedirectServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationImplPageRedirectServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcludedresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcludedresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excludedresourcetypesKey = "excluded.resource.types";
	json_object_set_member(pJsonObject, excludedresourcetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplPageRedirectServletProperties::getExcludedresourcetypes()
{
	return excludedresourcetypes;
}

void
ComDayCqWcmFoundationImplPageRedirectServletProperties::setExcludedresourcetypes(ConfigNodePropertyArray  excludedresourcetypes)
{
	this->excludedresourcetypes = excludedresourcetypes;
}


