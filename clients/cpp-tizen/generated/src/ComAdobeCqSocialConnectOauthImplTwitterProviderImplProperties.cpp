#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties()
{
	//__init();
}

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::~ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::__init()
{
	//oauthproviderid = new ConfigNodePropertyString();
	//oauthcloudconfigroot = new ConfigNodePropertyString();
	//providerconfigroot = new ConfigNodePropertyString();
	//providerconfiguserfolder = new ConfigNodePropertyDropDown();
	//providerconfigtwitterenableparams = new ConfigNodePropertyBoolean();
	//providerconfigtwitterparams = new ConfigNodePropertyArray();
	//providerconfigrefreshuserdataenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::__cleanup()
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
	//if(providerconfiguserfolder != NULL) {
	//
	//delete providerconfiguserfolder;
	//providerconfiguserfolder = NULL;
	//}
	//if(providerconfigtwitterenableparams != NULL) {
	//
	//delete providerconfigtwitterenableparams;
	//providerconfigtwitterenableparams = NULL;
	//}
	//if(providerconfigtwitterparams != NULL) {
	//
	//delete providerconfigtwitterparams;
	//providerconfigtwitterparams = NULL;
	//}
	//if(providerconfigrefreshuserdataenabled != NULL) {
	//
	//delete providerconfigrefreshuserdataenabled;
	//providerconfigrefreshuserdataenabled = NULL;
	//}
	//
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::fromJson(char* jsonStr)
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
	const gchar *providerconfigtwitterenableparamsKey = "provider.config.twitter.enable.params";
	node = json_object_get_member(pJsonObject, providerconfigtwitterenableparamsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&providerconfigtwitterenableparams, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&providerconfigtwitterenableparams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfigtwitterparamsKey = "provider.config.twitter.params";
	node = json_object_get_member(pJsonObject, providerconfigtwitterparamsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&providerconfigtwitterparams, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&providerconfigtwitterparams);
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

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::toJson()
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
		ConfigNodePropertyBoolean obj = getProviderconfigtwitterenableparams();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getProviderconfigtwitterenableparams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigtwitterenableparamsKey = "provider.config.twitter.enable.params";
	json_object_set_member(pJsonObject, providerconfigtwitterenableparamsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getProviderconfigtwitterparams();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getProviderconfigtwitterparams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfigtwitterparamsKey = "provider.config.twitter.params";
	json_object_set_member(pJsonObject, providerconfigtwitterparamsKey, node);
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
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setOauthproviderid(ConfigNodePropertyString  oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getOauthcloudconfigroot()
{
	return oauthcloudconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setOauthcloudconfigroot(ConfigNodePropertyString  oauthcloudconfigroot)
{
	this->oauthcloudconfigroot = oauthcloudconfigroot;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigroot()
{
	return providerconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigroot(ConfigNodePropertyString  providerconfigroot)
{
	this->providerconfigroot = providerconfigroot;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfiguserfolder()
{
	return providerconfiguserfolder;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfiguserfolder(ConfigNodePropertyDropDown  providerconfiguserfolder)
{
	this->providerconfiguserfolder = providerconfiguserfolder;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigtwitterenableparams()
{
	return providerconfigtwitterenableparams;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigtwitterenableparams(ConfigNodePropertyBoolean  providerconfigtwitterenableparams)
{
	this->providerconfigtwitterenableparams = providerconfigtwitterenableparams;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigtwitterparams()
{
	return providerconfigtwitterparams;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigtwitterparams(ConfigNodePropertyArray  providerconfigtwitterparams)
{
	this->providerconfigtwitterparams = providerconfigtwitterparams;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigrefreshuserdataenabled()
{
	return providerconfigrefreshuserdataenabled;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigrefreshuserdataenabled(ConfigNodePropertyBoolean  providerconfigrefreshuserdataenabled)
{
	this->providerconfigrefreshuserdataenabled = providerconfigrefreshuserdataenabled;
}


