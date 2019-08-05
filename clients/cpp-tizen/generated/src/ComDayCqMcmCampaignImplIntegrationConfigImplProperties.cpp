#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMcmCampaignImplIntegrationConfigImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMcmCampaignImplIntegrationConfigImplProperties::ComDayCqMcmCampaignImplIntegrationConfigImplProperties()
{
	//__init();
}

ComDayCqMcmCampaignImplIntegrationConfigImplProperties::~ComDayCqMcmCampaignImplIntegrationConfigImplProperties()
{
	//__cleanup();
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::__init()
{
	//aemmcmcampaignformConstraints = new ConfigNodePropertyArray();
	//aemmcmcampaignpublicUrl = new ConfigNodePropertyString();
	//aemmcmcampaignrelaxedSSL = new ConfigNodePropertyBoolean();
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::__cleanup()
{
	//if(aemmcmcampaignformConstraints != NULL) {
	//
	//delete aemmcmcampaignformConstraints;
	//aemmcmcampaignformConstraints = NULL;
	//}
	//if(aemmcmcampaignpublicUrl != NULL) {
	//
	//delete aemmcmcampaignpublicUrl;
	//aemmcmcampaignpublicUrl = NULL;
	//}
	//if(aemmcmcampaignrelaxedSSL != NULL) {
	//
	//delete aemmcmcampaignrelaxedSSL;
	//aemmcmcampaignrelaxedSSL = NULL;
	//}
	//
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aemmcmcampaignformConstraintsKey = "aem.mcm.campaign.formConstraints";
	node = json_object_get_member(pJsonObject, aemmcmcampaignformConstraintsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&aemmcmcampaignformConstraints, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&aemmcmcampaignformConstraints);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aemmcmcampaignpublicUrlKey = "aem.mcm.campaign.publicUrl";
	node = json_object_get_member(pJsonObject, aemmcmcampaignpublicUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&aemmcmcampaignpublicUrl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&aemmcmcampaignpublicUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aemmcmcampaignrelaxedSSLKey = "aem.mcm.campaign.relaxedSSL";
	node = json_object_get_member(pJsonObject, aemmcmcampaignrelaxedSSLKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&aemmcmcampaignrelaxedSSL, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&aemmcmcampaignrelaxedSSL);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMcmCampaignImplIntegrationConfigImplProperties::ComDayCqMcmCampaignImplIntegrationConfigImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAemmcmcampaignformConstraints();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAemmcmcampaignformConstraints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aemmcmcampaignformConstraintsKey = "aem.mcm.campaign.formConstraints";
	json_object_set_member(pJsonObject, aemmcmcampaignformConstraintsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAemmcmcampaignpublicUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAemmcmcampaignpublicUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aemmcmcampaignpublicUrlKey = "aem.mcm.campaign.publicUrl";
	json_object_set_member(pJsonObject, aemmcmcampaignpublicUrlKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAemmcmcampaignrelaxedSSL();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAemmcmcampaignrelaxedSSL());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aemmcmcampaignrelaxedSSLKey = "aem.mcm.campaign.relaxedSSL";
	json_object_set_member(pJsonObject, aemmcmcampaignrelaxedSSLKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::getAemmcmcampaignformConstraints()
{
	return aemmcmcampaignformConstraints;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::setAemmcmcampaignformConstraints(ConfigNodePropertyArray  aemmcmcampaignformConstraints)
{
	this->aemmcmcampaignformConstraints = aemmcmcampaignformConstraints;
}

ConfigNodePropertyString
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::getAemmcmcampaignpublicUrl()
{
	return aemmcmcampaignpublicUrl;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::setAemmcmcampaignpublicUrl(ConfigNodePropertyString  aemmcmcampaignpublicUrl)
{
	this->aemmcmcampaignpublicUrl = aemmcmcampaignpublicUrl;
}

ConfigNodePropertyBoolean
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::getAemmcmcampaignrelaxedSSL()
{
	return aemmcmcampaignrelaxedSSL;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::setAemmcmcampaignrelaxedSSL(ConfigNodePropertyBoolean  aemmcmcampaignrelaxedSSL)
{
	this->aemmcmcampaignrelaxedSSL = aemmcmcampaignrelaxedSSL;
}


