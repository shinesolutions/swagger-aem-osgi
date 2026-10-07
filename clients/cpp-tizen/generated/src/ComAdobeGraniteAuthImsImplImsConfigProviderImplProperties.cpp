#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties()
{
	//__init();
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::~ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::__init()
{
	//oauthconfigmanagerimsconfigid = new ConfigNodePropertyString();
	//imsowningEntity = new ConfigNodePropertyString();
	//aeminstanceId = new ConfigNodePropertyString();
	//imsserviceCode = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::__cleanup()
{
	//if(oauthconfigmanagerimsconfigid != NULL) {
	//
	//delete oauthconfigmanagerimsconfigid;
	//oauthconfigmanagerimsconfigid = NULL;
	//}
	//if(imsowningEntity != NULL) {
	//
	//delete imsowningEntity;
	//imsowningEntity = NULL;
	//}
	//if(aeminstanceId != NULL) {
	//
	//delete aeminstanceId;
	//aeminstanceId = NULL;
	//}
	//if(imsserviceCode != NULL) {
	//
	//delete imsserviceCode;
	//imsserviceCode = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthconfigmanagerimsconfigidKey = "oauth.configmanager.ims.configid";
	node = json_object_get_member(pJsonObject, oauthconfigmanagerimsconfigidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthconfigmanagerimsconfigid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthconfigmanagerimsconfigid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *imsowningEntityKey = "ims.owningEntity";
	node = json_object_get_member(pJsonObject, imsowningEntityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&imsowningEntity, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&imsowningEntity);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aeminstanceIdKey = "aem.instanceId";
	node = json_object_get_member(pJsonObject, aeminstanceIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&aeminstanceId, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&aeminstanceId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *imsserviceCodeKey = "ims.serviceCode";
	node = json_object_get_member(pJsonObject, imsserviceCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&imsserviceCode, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&imsserviceCode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthconfigmanagerimsconfigid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthconfigmanagerimsconfigid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthconfigmanagerimsconfigidKey = "oauth.configmanager.ims.configid";
	json_object_set_member(pJsonObject, oauthconfigmanagerimsconfigidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImsowningEntity();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImsowningEntity());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imsowningEntityKey = "ims.owningEntity";
	json_object_set_member(pJsonObject, imsowningEntityKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAeminstanceId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAeminstanceId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aeminstanceIdKey = "aem.instanceId";
	json_object_set_member(pJsonObject, aeminstanceIdKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImsserviceCode();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImsserviceCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imsserviceCodeKey = "ims.serviceCode";
	json_object_set_member(pJsonObject, imsserviceCodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getOauthconfigmanagerimsconfigid()
{
	return oauthconfigmanagerimsconfigid;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setOauthconfigmanagerimsconfigid(ConfigNodePropertyString  oauthconfigmanagerimsconfigid)
{
	this->oauthconfigmanagerimsconfigid = oauthconfigmanagerimsconfigid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getImsowningEntity()
{
	return imsowningEntity;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setImsowningEntity(ConfigNodePropertyString  imsowningEntity)
{
	this->imsowningEntity = imsowningEntity;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getAeminstanceId()
{
	return aeminstanceId;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setAeminstanceId(ConfigNodePropertyString  aeminstanceId)
{
	this->aeminstanceId = aeminstanceId;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getImsserviceCode()
{
	return imsserviceCode;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setImsserviceCode(ConfigNodePropertyString  imsserviceCode)
{
	this->imsserviceCode = imsserviceCode;
}


