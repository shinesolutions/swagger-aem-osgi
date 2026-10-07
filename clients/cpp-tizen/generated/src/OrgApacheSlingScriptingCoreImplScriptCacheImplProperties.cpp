#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::OrgApacheSlingScriptingCoreImplScriptCacheImplProperties()
{
	//__init();
}

OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::~OrgApacheSlingScriptingCoreImplScriptCacheImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::__init()
{
	//orgapacheslingscriptingcachesize = new ConfigNodePropertyInteger();
	//orgapacheslingscriptingcacheadditional_extensions = new ConfigNodePropertyArray();
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::__cleanup()
{
	//if(orgapacheslingscriptingcachesize != NULL) {
	//
	//delete orgapacheslingscriptingcachesize;
	//orgapacheslingscriptingcachesize = NULL;
	//}
	//if(orgapacheslingscriptingcacheadditional_extensions != NULL) {
	//
	//delete orgapacheslingscriptingcacheadditional_extensions;
	//orgapacheslingscriptingcacheadditional_extensions = NULL;
	//}
	//
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslingscriptingcachesizeKey = "org.apache.sling.scripting.cache.size";
	node = json_object_get_member(pJsonObject, orgapacheslingscriptingcachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingscriptingcachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingscriptingcachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingscriptingcacheadditional_extensionsKey = "org.apache.sling.scripting.cache.additional_extensions";
	node = json_object_get_member(pJsonObject, orgapacheslingscriptingcacheadditional_extensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&orgapacheslingscriptingcacheadditional_extensions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&orgapacheslingscriptingcacheadditional_extensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingscriptingcachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingscriptingcachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingscriptingcachesizeKey = "org.apache.sling.scripting.cache.size";
	json_object_set_member(pJsonObject, orgapacheslingscriptingcachesizeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOrgapacheslingscriptingcacheadditionalExtensions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOrgapacheslingscriptingcacheadditionalExtensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingscriptingcacheadditional_extensionsKey = "org.apache.sling.scripting.cache.additional_extensions";
	json_object_set_member(pJsonObject, orgapacheslingscriptingcacheadditional_extensionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::getOrgapacheslingscriptingcachesize()
{
	return orgapacheslingscriptingcachesize;
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::setOrgapacheslingscriptingcachesize(ConfigNodePropertyInteger  orgapacheslingscriptingcachesize)
{
	this->orgapacheslingscriptingcachesize = orgapacheslingscriptingcachesize;
}

ConfigNodePropertyArray
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::getOrgapacheslingscriptingcacheadditionalExtensions()
{
	return orgapacheslingscriptingcacheadditional_extensions;
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::setOrgapacheslingscriptingcacheadditionalExtensions(ConfigNodePropertyArray  orgapacheslingscriptingcacheadditional_extensions)
{
	this->orgapacheslingscriptingcacheadditional_extensions = orgapacheslingscriptingcacheadditional_extensions;
}


