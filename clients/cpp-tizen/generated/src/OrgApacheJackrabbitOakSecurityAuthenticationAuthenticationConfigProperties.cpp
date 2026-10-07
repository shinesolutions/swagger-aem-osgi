#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::~OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::__init()
{
	//orgapachejackrabbitoakauthenticationappName = new ConfigNodePropertyString();
	//orgapachejackrabbitoakauthenticationconfigSpiName = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::__cleanup()
{
	//if(orgapachejackrabbitoakauthenticationappName != NULL) {
	//
	//delete orgapachejackrabbitoakauthenticationappName;
	//orgapachejackrabbitoakauthenticationappName = NULL;
	//}
	//if(orgapachejackrabbitoakauthenticationconfigSpiName != NULL) {
	//
	//delete orgapachejackrabbitoakauthenticationconfigSpiName;
	//orgapachejackrabbitoakauthenticationconfigSpiName = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapachejackrabbitoakauthenticationappNameKey = "org.apache.jackrabbit.oak.authentication.appName";
	node = json_object_get_member(pJsonObject, orgapachejackrabbitoakauthenticationappNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapachejackrabbitoakauthenticationappName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapachejackrabbitoakauthenticationappName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapachejackrabbitoakauthenticationconfigSpiNameKey = "org.apache.jackrabbit.oak.authentication.configSpiName";
	node = json_object_get_member(pJsonObject, orgapachejackrabbitoakauthenticationconfigSpiNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapachejackrabbitoakauthenticationconfigSpiName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapachejackrabbitoakauthenticationconfigSpiName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapachejackrabbitoakauthenticationappName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapachejackrabbitoakauthenticationappName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachejackrabbitoakauthenticationappNameKey = "org.apache.jackrabbit.oak.authentication.appName";
	json_object_set_member(pJsonObject, orgapachejackrabbitoakauthenticationappNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapachejackrabbitoakauthenticationconfigSpiName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapachejackrabbitoakauthenticationconfigSpiName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachejackrabbitoakauthenticationconfigSpiNameKey = "org.apache.jackrabbit.oak.authentication.configSpiName";
	json_object_set_member(pJsonObject, orgapachejackrabbitoakauthenticationconfigSpiNameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::getOrgapachejackrabbitoakauthenticationappName()
{
	return orgapachejackrabbitoakauthenticationappName;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::setOrgapachejackrabbitoakauthenticationappName(ConfigNodePropertyString  orgapachejackrabbitoakauthenticationappName)
{
	this->orgapachejackrabbitoakauthenticationappName = orgapachejackrabbitoakauthenticationappName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::getOrgapachejackrabbitoakauthenticationconfigSpiName()
{
	return orgapachejackrabbitoakauthenticationconfigSpiName;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::setOrgapachejackrabbitoakauthenticationconfigSpiName(ConfigNodePropertyString  orgapachejackrabbitoakauthenticationconfigSpiName)
{
	this->orgapachejackrabbitoakauthenticationconfigSpiName = orgapachejackrabbitoakauthenticationconfigSpiName;
}


