#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::__init()
{
	//cugSupportedPaths = new ConfigNodePropertyArray();
	//cugEnabled = new ConfigNodePropertyBoolean();
	//configurationRanking = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::__cleanup()
{
	//if(cugSupportedPaths != NULL) {
	//
	//delete cugSupportedPaths;
	//cugSupportedPaths = NULL;
	//}
	//if(cugEnabled != NULL) {
	//
	//delete cugEnabled;
	//cugEnabled = NULL;
	//}
	//if(configurationRanking != NULL) {
	//
	//delete configurationRanking;
	//configurationRanking = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cugSupportedPathsKey = "cugSupportedPaths";
	node = json_object_get_member(pJsonObject, cugSupportedPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cugSupportedPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cugSupportedPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cugEnabledKey = "cugEnabled";
	node = json_object_get_member(pJsonObject, cugEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cugEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cugEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *configurationRankingKey = "configurationRanking";
	node = json_object_get_member(pJsonObject, configurationRankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&configurationRanking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&configurationRanking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCugSupportedPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCugSupportedPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cugSupportedPathsKey = "cugSupportedPaths";
	json_object_set_member(pJsonObject, cugSupportedPathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCugEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCugEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cugEnabledKey = "cugEnabled";
	json_object_set_member(pJsonObject, cugEnabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConfigurationRanking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConfigurationRanking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configurationRankingKey = "configurationRanking";
	json_object_set_member(pJsonObject, configurationRankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::getCugSupportedPaths()
{
	return cugSupportedPaths;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::setCugSupportedPaths(ConfigNodePropertyArray  cugSupportedPaths)
{
	this->cugSupportedPaths = cugSupportedPaths;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::getCugEnabled()
{
	return cugEnabled;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::setCugEnabled(ConfigNodePropertyBoolean  cugEnabled)
{
	this->cugEnabled = cugEnabled;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::getConfigurationRanking()
{
	return configurationRanking;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::setConfigurationRanking(ConfigNodePropertyInteger  configurationRanking)
{
	this->configurationRanking = configurationRanking;
}


