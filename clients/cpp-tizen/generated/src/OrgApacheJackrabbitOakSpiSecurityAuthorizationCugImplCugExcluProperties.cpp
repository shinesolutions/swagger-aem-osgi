#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::__init()
{
	//principalNames = new ConfigNodePropertyArray();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::__cleanup()
{
	//if(principalNames != NULL) {
	//
	//delete principalNames;
	//principalNames = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *principalNamesKey = "principalNames";
	node = json_object_get_member(pJsonObject, principalNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&principalNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&principalNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPrincipalNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPrincipalNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *principalNamesKey = "principalNames";
	json_object_set_member(pJsonObject, principalNamesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::getPrincipalNames()
{
	return principalNames;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::setPrincipalNames(ConfigNodePropertyArray  principalNames)
{
	this->principalNames = principalNames;
}


