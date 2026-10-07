#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::~OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::__init()
{
	//requiredServicePids = new ConfigNodePropertyArray();
	//authorizationCompositionType = new ConfigNodePropertyDropDown();
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::__cleanup()
{
	//if(requiredServicePids != NULL) {
	//
	//delete requiredServicePids;
	//requiredServicePids = NULL;
	//}
	//if(authorizationCompositionType != NULL) {
	//
	//delete authorizationCompositionType;
	//authorizationCompositionType = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *requiredServicePidsKey = "requiredServicePids";
	node = json_object_get_member(pJsonObject, requiredServicePidsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&requiredServicePids, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&requiredServicePids);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authorizationCompositionTypeKey = "authorizationCompositionType";
	node = json_object_get_member(pJsonObject, authorizationCompositionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&authorizationCompositionType, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&authorizationCompositionType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getRequiredServicePids();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getRequiredServicePids());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requiredServicePidsKey = "requiredServicePids";
	json_object_set_member(pJsonObject, requiredServicePidsKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getAuthorizationCompositionType();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getAuthorizationCompositionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authorizationCompositionTypeKey = "authorizationCompositionType";
	json_object_set_member(pJsonObject, authorizationCompositionTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::getRequiredServicePids()
{
	return requiredServicePids;
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::setRequiredServicePids(ConfigNodePropertyArray  requiredServicePids)
{
	this->requiredServicePids = requiredServicePids;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::getAuthorizationCompositionType()
{
	return authorizationCompositionType;
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::setAuthorizationCompositionType(ConfigNodePropertyDropDown  authorizationCompositionType)
{
	this->authorizationCompositionType = authorizationCompositionType;
}


