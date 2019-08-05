#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::__init()
{
	//protectExternalId = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::__cleanup()
{
	//if(protectExternalId != NULL) {
	//
	//delete protectExternalId;
	//protectExternalId = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *protectExternalIdKey = "protectExternalId";
	node = json_object_get_member(pJsonObject, protectExternalIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&protectExternalId, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&protectExternalId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getProtectExternalId();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getProtectExternalId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *protectExternalIdKey = "protectExternalId";
	json_object_set_member(pJsonObject, protectExternalIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::getProtectExternalId()
{
	return protectExternalId;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::setProtectExternalId(ConfigNodePropertyBoolean  protectExternalId)
{
	this->protectExternalId = protectExternalId;
}


