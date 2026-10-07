#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingTenantInternalTenantProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingTenantInternalTenantProviderImplProperties::OrgApacheSlingTenantInternalTenantProviderImplProperties()
{
	//__init();
}

OrgApacheSlingTenantInternalTenantProviderImplProperties::~OrgApacheSlingTenantInternalTenantProviderImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::__init()
{
	//tenantroot = new ConfigNodePropertyString();
	//tenantpathmatcher = new ConfigNodePropertyArray();
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::__cleanup()
{
	//if(tenantroot != NULL) {
	//
	//delete tenantroot;
	//tenantroot = NULL;
	//}
	//if(tenantpathmatcher != NULL) {
	//
	//delete tenantpathmatcher;
	//tenantpathmatcher = NULL;
	//}
	//
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tenantrootKey = "tenant.root";
	node = json_object_get_member(pJsonObject, tenantrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tenantroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tenantroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tenantpathmatcherKey = "tenant.path.matcher";
	node = json_object_get_member(pJsonObject, tenantpathmatcherKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&tenantpathmatcher, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&tenantpathmatcher);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingTenantInternalTenantProviderImplProperties::OrgApacheSlingTenantInternalTenantProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingTenantInternalTenantProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTenantroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTenantroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tenantrootKey = "tenant.root";
	json_object_set_member(pJsonObject, tenantrootKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTenantpathmatcher();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTenantpathmatcher());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tenantpathmatcherKey = "tenant.path.matcher";
	json_object_set_member(pJsonObject, tenantpathmatcherKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingTenantInternalTenantProviderImplProperties::getTenantroot()
{
	return tenantroot;
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::setTenantroot(ConfigNodePropertyString  tenantroot)
{
	this->tenantroot = tenantroot;
}

ConfigNodePropertyArray
OrgApacheSlingTenantInternalTenantProviderImplProperties::getTenantpathmatcher()
{
	return tenantpathmatcher;
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::setTenantpathmatcher(ConfigNodePropertyArray  tenantpathmatcher)
{
	this->tenantpathmatcher = tenantpathmatcher;
}


