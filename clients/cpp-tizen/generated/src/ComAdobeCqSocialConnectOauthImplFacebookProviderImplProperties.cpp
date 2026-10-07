#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
{
	//__init();
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::~ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::__init()
{
	//oauthproviderid = new ConfigNodePropertyString();
	//oauthcloudconfigroot = new ConfigNodePropertyString();
	//providerconfigroot = new ConfigNodePropertyString();
	//providerconfigcreatetagsenabled = new ConfigNodePropertyBoolean();
	//providerconfiguserfolder = new ConfigNodePropertyDropDown();
	//providerconfigfacebookfetchfields = new ConfigNodePropertyBoolean();
	//providerconfigfacebookfields = new ConfigNodePropertyArray();
	//providerconfigrefreshuserdataenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::__cleanup()
{
	//if(oauthproviderid != NULL) {
	//
	//delete oauthproviderid;
	//oauthproviderid = NULL;
	//}
	//if(oauthcloudconfigroot != NULL) {
	//
	//delete oauthcloudconfigroot;
	//oauthcloudconfigroot = NULL;
	//}
	//if(providerconfigroot != NULL) {
	//
	//delete providerconfigroot;
	//providerconfigroot = NULL;
	//}
	//if(providerconfigcreatetagsenabled != NULL) {
	//
	//delete providerconfigcreatetagsenabled;
	//providerconfigcreatetagsenabled = NULL;
	//}
	//if(providerconfiguserfolder != NULL) {
	//
	//delete providerconfiguserfolder;
	//providerconfiguserfolder = NULL;
	//}
	//if(providerconfigfacebookfetchfields != NULL) {
	//
	//delete providerconfigfacebookfetchfields;
	//providerconfigfacebookfetchfields = NULL;
	//}
	//if(providerconfigfacebookfields != NULL) {
	//
	//delete providerconfigfacebookfields;
	//providerconfigfacebookfields = NULL;
	//}
	//if(providerconfigrefreshuserdataenabled != NULL) {
	//
	//delete providerconfigrefreshuserdataenabled;
	//providerconfigrefreshuserdataenabled = NULL;
	//}
	//
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthprovideridKey = "oauth.provider.id";
	node = json_object_get_member(pJsonObject, oauthprovideridKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthcloudconfigrootKey = "oauth.cloud.config.root";
	node = json_object_get_member(pJsonObject, oauthcloudconfigrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthcloudconfigroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthcloudconfigroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfigrootKey = "provider.config.root";
	node = json_object_get_member(pJsonObject, providerconfigrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providerconfigroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providerconfigroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfigcreatetagsenabledKey = "provider.config.create.tags.enabled";
	node = json_object_get_member(pJsonObject, providerconfigcreatetagsenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&providerconfigcreatetagsenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&providerconfigcreatetagsenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfiguserfolderKey = "provider.config.user.folder";
	node = json_object_get_member(pJsonObject, providerconfiguserfolderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&providerconfiguserfolder, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&providerconfiguserfolder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfigfacebookfetchfieldsKey = "provider.config.facebook.fetch.fields";
	node = json_object_get_member(pJsonObject, providerconfigfacebookfetchfieldsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&providerconfigfacebookfetchfields, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&providerconfigfacebookfetchfields);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfigfacebookfieldsKey = "provider.config.facebook.fields";
	node = json_object_get_member(pJsonObject, providerconfigfacebookfieldsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&providerconfigfacebookfields, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&providerconfigfacebookfields);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfigrefreshuserdataenabledKey = "provider.config.refresh.userdata.enabled";
	node = json_object_get_member(pJsonObject, providerconfigrefreshuserdataenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&providerconfigrefreshuserdataenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&providerconfigrefreshuserdataenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovideridKey = "oauth.provider.id";
	json_object_set_member(pJsonObject, oauthprovideridKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthcloudconfigroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthcloudconfigroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthcloudconfigrootKey = "oauth.cloud.config.root";
	json_object_set_member(pJsonObject, oauthcloudconfigrootKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProviderconfigroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProviderconfigroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigrootKey = "provider.config.root";
	json_object_set_member(pJsonObject, providerconfigrootKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getProviderconfigcreatetagsenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getProviderconfigcreatetagsenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigcreatetagsenabledKey = "provider.config.create.tags.enabled";
	json_object_set_member(pJsonObject, providerconfigcreatetagsenabledKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getProviderconfiguserfolder();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getProviderconfiguserfolder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfiguserfolderKey = "provider.config.user.folder";
	json_object_set_member(pJsonObject, providerconfiguserfolderKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getProviderconfigfacebookfetchfields();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getProviderconfigfacebookfetchfields());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigfacebookfetchfieldsKey = "provider.config.facebook.fetch.fields";
	json_object_set_member(pJsonObject, providerconfigfacebookfetchfieldsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getProviderconfigfacebookfields();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getProviderconfigfacebookfields());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigfacebookfieldsKey = "provider.config.facebook.fields";
	json_object_set_member(pJsonObject, providerconfigfacebookfieldsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getProviderconfigrefreshuserdataenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getProviderconfigrefreshuserdataenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigrefreshuserdataenabledKey = "provider.config.refresh.userdata.enabled";
	json_object_set_member(pJsonObject, providerconfigrefreshuserdataenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setOauthproviderid(ConfigNodePropertyString  oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getOauthcloudconfigroot()
{
	return oauthcloudconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setOauthcloudconfigroot(ConfigNodePropertyString  oauthcloudconfigroot)
{
	this->oauthcloudconfigroot = oauthcloudconfigroot;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigroot()
{
	return providerconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigroot(ConfigNodePropertyString  providerconfigroot)
{
	this->providerconfigroot = providerconfigroot;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigcreatetagsenabled()
{
	return providerconfigcreatetagsenabled;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigcreatetagsenabled(ConfigNodePropertyBoolean  providerconfigcreatetagsenabled)
{
	this->providerconfigcreatetagsenabled = providerconfigcreatetagsenabled;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfiguserfolder()
{
	return providerconfiguserfolder;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfiguserfolder(ConfigNodePropertyDropDown  providerconfiguserfolder)
{
	this->providerconfiguserfolder = providerconfiguserfolder;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigfacebookfetchfields()
{
	return providerconfigfacebookfetchfields;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigfacebookfetchfields(ConfigNodePropertyBoolean  providerconfigfacebookfetchfields)
{
	this->providerconfigfacebookfetchfields = providerconfigfacebookfetchfields;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigfacebookfields()
{
	return providerconfigfacebookfields;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigfacebookfields(ConfigNodePropertyArray  providerconfigfacebookfields)
{
	this->providerconfigfacebookfields = providerconfigfacebookfields;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigrefreshuserdataenabled()
{
	return providerconfigrefreshuserdataenabled;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigrefreshuserdataenabled(ConfigNodePropertyBoolean  providerconfigrefreshuserdataenabled)
{
	this->providerconfigrefreshuserdataenabled = providerconfigrefreshuserdataenabled;
}


