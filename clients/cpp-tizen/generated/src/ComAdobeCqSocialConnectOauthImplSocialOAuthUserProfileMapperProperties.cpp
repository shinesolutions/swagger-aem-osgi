#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties()
{
	//__init();
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::~ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::__init()
{
	//facebook = new ConfigNodePropertyArray();
	//twitter = new ConfigNodePropertyArray();
	//providerconfiguserfolder = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::__cleanup()
{
	//if(facebook != NULL) {
	//
	//delete facebook;
	//facebook = NULL;
	//}
	//if(twitter != NULL) {
	//
	//delete twitter;
	//twitter = NULL;
	//}
	//if(providerconfiguserfolder != NULL) {
	//
	//delete providerconfiguserfolder;
	//providerconfiguserfolder = NULL;
	//}
	//
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *facebookKey = "facebook";
	node = json_object_get_member(pJsonObject, facebookKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&facebook, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&facebook);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *twitterKey = "twitter";
	node = json_object_get_member(pJsonObject, twitterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&twitter, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&twitter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *providerconfiguserfolderKey = "provider.config.user.folder";
	node = json_object_get_member(pJsonObject, providerconfiguserfolderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providerconfiguserfolder, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providerconfiguserfolder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFacebook();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFacebook());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *facebookKey = "facebook";
	json_object_set_member(pJsonObject, facebookKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTwitter();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTwitter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *twitterKey = "twitter";
	json_object_set_member(pJsonObject, twitterKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProviderconfiguserfolder();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProviderconfiguserfolder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerconfiguserfolderKey = "provider.config.user.folder";
	json_object_set_member(pJsonObject, providerconfiguserfolderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::getFacebook()
{
	return facebook;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::setFacebook(ConfigNodePropertyArray  facebook)
{
	this->facebook = facebook;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::getTwitter()
{
	return twitter;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::setTwitter(ConfigNodePropertyArray  twitter)
{
	this->twitter = twitter;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::getProviderconfiguserfolder()
{
	return providerconfiguserfolder;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::setProviderconfiguserfolder(ConfigNodePropertyString  providerconfiguserfolder)
{
	this->providerconfiguserfolder = providerconfiguserfolder;
}


