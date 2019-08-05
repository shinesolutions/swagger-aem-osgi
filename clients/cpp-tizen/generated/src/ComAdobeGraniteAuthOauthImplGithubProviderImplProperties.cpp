#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::ComAdobeGraniteAuthOauthImplGithubProviderImplProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::~ComAdobeGraniteAuthOauthImplGithubProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::__init()
{
	//oauthproviderid = new ConfigNodePropertyString();
	//oauthprovidergithubauthorizationurl = new ConfigNodePropertyString();
	//oauthprovidergithubtokenurl = new ConfigNodePropertyString();
	//oauthprovidergithubprofileurl = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::__cleanup()
{
	//if(oauthproviderid != NULL) {
	//
	//delete oauthproviderid;
	//oauthproviderid = NULL;
	//}
	//if(oauthprovidergithubauthorizationurl != NULL) {
	//
	//delete oauthprovidergithubauthorizationurl;
	//oauthprovidergithubauthorizationurl = NULL;
	//}
	//if(oauthprovidergithubtokenurl != NULL) {
	//
	//delete oauthprovidergithubtokenurl;
	//oauthprovidergithubtokenurl = NULL;
	//}
	//if(oauthprovidergithubprofileurl != NULL) {
	//
	//delete oauthprovidergithubprofileurl;
	//oauthprovidergithubprofileurl = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::fromJson(char* jsonStr)
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
	const gchar *oauthprovidergithubauthorizationurlKey = "oauth.provider.github.authorization.url";
	node = json_object_get_member(pJsonObject, oauthprovidergithubauthorizationurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergithubauthorizationurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergithubauthorizationurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthprovidergithubtokenurlKey = "oauth.provider.github.token.url";
	node = json_object_get_member(pJsonObject, oauthprovidergithubtokenurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergithubtokenurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergithubtokenurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthprovidergithubprofileurlKey = "oauth.provider.github.profile.url";
	node = json_object_get_member(pJsonObject, oauthprovidergithubprofileurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergithubprofileurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergithubprofileurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::toJson()
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
		ConfigNodePropertyString obj = getOauthprovidergithubauthorizationurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergithubauthorizationurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergithubauthorizationurlKey = "oauth.provider.github.authorization.url";
	json_object_set_member(pJsonObject, oauthprovidergithubauthorizationurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthprovidergithubtokenurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergithubtokenurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergithubtokenurlKey = "oauth.provider.github.token.url";
	json_object_set_member(pJsonObject, oauthprovidergithubtokenurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthprovidergithubprofileurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergithubprofileurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergithubprofileurlKey = "oauth.provider.github.profile.url";
	json_object_set_member(pJsonObject, oauthprovidergithubprofileurlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthproviderid(ConfigNodePropertyString  oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthprovidergithubauthorizationurl()
{
	return oauthprovidergithubauthorizationurl;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthprovidergithubauthorizationurl(ConfigNodePropertyString  oauthprovidergithubauthorizationurl)
{
	this->oauthprovidergithubauthorizationurl = oauthprovidergithubauthorizationurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthprovidergithubtokenurl()
{
	return oauthprovidergithubtokenurl;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthprovidergithubtokenurl(ConfigNodePropertyString  oauthprovidergithubtokenurl)
{
	this->oauthprovidergithubtokenurl = oauthprovidergithubtokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthprovidergithubprofileurl()
{
	return oauthprovidergithubprofileurl;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthprovidergithubprofileurl(ConfigNodePropertyString  oauthprovidergithubprofileurl)
{
	this->oauthprovidergithubprofileurl = oauthprovidergithubprofileurl;
}


