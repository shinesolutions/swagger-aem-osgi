#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthProviderProperties::ComAdobeGraniteAuthOauthProviderProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthProviderProperties::~ComAdobeGraniteAuthOauthProviderProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthProviderProperties::__init()
{
	//oauthconfigid = new ConfigNodePropertyString();
	//oauthclientid = new ConfigNodePropertyString();
	//oauthclientsecret = new ConfigNodePropertyString();
	//oauthscope = new ConfigNodePropertyArray();
	//oauthconfigproviderid = new ConfigNodePropertyString();
	//oauthcreateusers = new ConfigNodePropertyBoolean();
	//oauthuseridproperty = new ConfigNodePropertyString();
	//forcestrictusernamematching = new ConfigNodePropertyBoolean();
	//oauthencodeuserids = new ConfigNodePropertyBoolean();
	//oauthhashuserids = new ConfigNodePropertyBoolean();
	//oauthcallBackUrl = new ConfigNodePropertyString();
	//oauthaccesstokenpersist = new ConfigNodePropertyBoolean();
	//oauthaccesstokenpersistcookie = new ConfigNodePropertyBoolean();
	//oauthcsrfstateprotection = new ConfigNodePropertyBoolean();
	//oauthredirectrequestparams = new ConfigNodePropertyBoolean();
	//oauthconfigsiblingsallow = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteAuthOauthProviderProperties::__cleanup()
{
	//if(oauthconfigid != NULL) {
	//
	//delete oauthconfigid;
	//oauthconfigid = NULL;
	//}
	//if(oauthclientid != NULL) {
	//
	//delete oauthclientid;
	//oauthclientid = NULL;
	//}
	//if(oauthclientsecret != NULL) {
	//
	//delete oauthclientsecret;
	//oauthclientsecret = NULL;
	//}
	//if(oauthscope != NULL) {
	//
	//delete oauthscope;
	//oauthscope = NULL;
	//}
	//if(oauthconfigproviderid != NULL) {
	//
	//delete oauthconfigproviderid;
	//oauthconfigproviderid = NULL;
	//}
	//if(oauthcreateusers != NULL) {
	//
	//delete oauthcreateusers;
	//oauthcreateusers = NULL;
	//}
	//if(oauthuseridproperty != NULL) {
	//
	//delete oauthuseridproperty;
	//oauthuseridproperty = NULL;
	//}
	//if(forcestrictusernamematching != NULL) {
	//
	//delete forcestrictusernamematching;
	//forcestrictusernamematching = NULL;
	//}
	//if(oauthencodeuserids != NULL) {
	//
	//delete oauthencodeuserids;
	//oauthencodeuserids = NULL;
	//}
	//if(oauthhashuserids != NULL) {
	//
	//delete oauthhashuserids;
	//oauthhashuserids = NULL;
	//}
	//if(oauthcallBackUrl != NULL) {
	//
	//delete oauthcallBackUrl;
	//oauthcallBackUrl = NULL;
	//}
	//if(oauthaccesstokenpersist != NULL) {
	//
	//delete oauthaccesstokenpersist;
	//oauthaccesstokenpersist = NULL;
	//}
	//if(oauthaccesstokenpersistcookie != NULL) {
	//
	//delete oauthaccesstokenpersistcookie;
	//oauthaccesstokenpersistcookie = NULL;
	//}
	//if(oauthcsrfstateprotection != NULL) {
	//
	//delete oauthcsrfstateprotection;
	//oauthcsrfstateprotection = NULL;
	//}
	//if(oauthredirectrequestparams != NULL) {
	//
	//delete oauthredirectrequestparams;
	//oauthredirectrequestparams = NULL;
	//}
	//if(oauthconfigsiblingsallow != NULL) {
	//
	//delete oauthconfigsiblingsallow;
	//oauthconfigsiblingsallow = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthconfigidKey = "oauth.config.id";
	node = json_object_get_member(pJsonObject, oauthconfigidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthconfigid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthconfigid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthclientidKey = "oauth.client.id";
	node = json_object_get_member(pJsonObject, oauthclientidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthclientid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthclientid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthclientsecretKey = "oauth.client.secret";
	node = json_object_get_member(pJsonObject, oauthclientsecretKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthclientsecret, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthclientsecret);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthscopeKey = "oauth.scope";
	node = json_object_get_member(pJsonObject, oauthscopeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&oauthscope, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&oauthscope);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthconfigprovideridKey = "oauth.config.provider.id";
	node = json_object_get_member(pJsonObject, oauthconfigprovideridKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthconfigproviderid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthconfigproviderid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthcreateusersKey = "oauth.create.users";
	node = json_object_get_member(pJsonObject, oauthcreateusersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthcreateusers, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthcreateusers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthuseridpropertyKey = "oauth.userid.property";
	node = json_object_get_member(pJsonObject, oauthuseridpropertyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthuseridproperty, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthuseridproperty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *forcestrictusernamematchingKey = "force.strict.username.matching";
	node = json_object_get_member(pJsonObject, forcestrictusernamematchingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&forcestrictusernamematching, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&forcestrictusernamematching);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthencodeuseridsKey = "oauth.encode.userids";
	node = json_object_get_member(pJsonObject, oauthencodeuseridsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthencodeuserids, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthencodeuserids);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthhashuseridsKey = "oauth.hash.userids";
	node = json_object_get_member(pJsonObject, oauthhashuseridsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthhashuserids, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthhashuserids);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthcallBackUrlKey = "oauth.callBackUrl";
	node = json_object_get_member(pJsonObject, oauthcallBackUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthcallBackUrl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthcallBackUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthaccesstokenpersistKey = "oauth.access.token.persist";
	node = json_object_get_member(pJsonObject, oauthaccesstokenpersistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthaccesstokenpersist, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthaccesstokenpersist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthaccesstokenpersistcookieKey = "oauth.access.token.persist.cookie";
	node = json_object_get_member(pJsonObject, oauthaccesstokenpersistcookieKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthaccesstokenpersistcookie, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthaccesstokenpersistcookie);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthcsrfstateprotectionKey = "oauth.csrf.state.protection";
	node = json_object_get_member(pJsonObject, oauthcsrfstateprotectionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthcsrfstateprotection, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthcsrfstateprotection);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthredirectrequestparamsKey = "oauth.redirect.request.params";
	node = json_object_get_member(pJsonObject, oauthredirectrequestparamsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthredirectrequestparams, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthredirectrequestparams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthconfigsiblingsallowKey = "oauth.config.siblings.allow";
	node = json_object_get_member(pJsonObject, oauthconfigsiblingsallowKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthconfigsiblingsallow, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthconfigsiblingsallow);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthProviderProperties::ComAdobeGraniteAuthOauthProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthconfigid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthconfigid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthconfigidKey = "oauth.config.id";
	json_object_set_member(pJsonObject, oauthconfigidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthclientid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthclientid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthclientidKey = "oauth.client.id";
	json_object_set_member(pJsonObject, oauthclientidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthclientsecret();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthclientsecret());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthclientsecretKey = "oauth.client.secret";
	json_object_set_member(pJsonObject, oauthclientsecretKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOauthscope();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOauthscope());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthscopeKey = "oauth.scope";
	json_object_set_member(pJsonObject, oauthscopeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthconfigproviderid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthconfigproviderid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthconfigprovideridKey = "oauth.config.provider.id";
	json_object_set_member(pJsonObject, oauthconfigprovideridKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthcreateusers();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthcreateusers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthcreateusersKey = "oauth.create.users";
	json_object_set_member(pJsonObject, oauthcreateusersKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthuseridproperty();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthuseridproperty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthuseridpropertyKey = "oauth.userid.property";
	json_object_set_member(pJsonObject, oauthuseridpropertyKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getForcestrictusernamematching();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getForcestrictusernamematching());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *forcestrictusernamematchingKey = "force.strict.username.matching";
	json_object_set_member(pJsonObject, forcestrictusernamematchingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthencodeuserids();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthencodeuserids());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthencodeuseridsKey = "oauth.encode.userids";
	json_object_set_member(pJsonObject, oauthencodeuseridsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthhashuserids();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthhashuserids());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthhashuseridsKey = "oauth.hash.userids";
	json_object_set_member(pJsonObject, oauthhashuseridsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthcallBackUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthcallBackUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthcallBackUrlKey = "oauth.callBackUrl";
	json_object_set_member(pJsonObject, oauthcallBackUrlKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthaccesstokenpersist();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthaccesstokenpersist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthaccesstokenpersistKey = "oauth.access.token.persist";
	json_object_set_member(pJsonObject, oauthaccesstokenpersistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthaccesstokenpersistcookie();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthaccesstokenpersistcookie());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthaccesstokenpersistcookieKey = "oauth.access.token.persist.cookie";
	json_object_set_member(pJsonObject, oauthaccesstokenpersistcookieKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthcsrfstateprotection();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthcsrfstateprotection());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthcsrfstateprotectionKey = "oauth.csrf.state.protection";
	json_object_set_member(pJsonObject, oauthcsrfstateprotectionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthredirectrequestparams();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthredirectrequestparams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthredirectrequestparamsKey = "oauth.redirect.request.params";
	json_object_set_member(pJsonObject, oauthredirectrequestparamsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthconfigsiblingsallow();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthconfigsiblingsallow());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthconfigsiblingsallowKey = "oauth.config.siblings.allow";
	json_object_set_member(pJsonObject, oauthconfigsiblingsallowKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthconfigid()
{
	return oauthconfigid;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthconfigid(ConfigNodePropertyString  oauthconfigid)
{
	this->oauthconfigid = oauthconfigid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthclientid()
{
	return oauthclientid;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthclientid(ConfigNodePropertyString  oauthclientid)
{
	this->oauthclientid = oauthclientid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthclientsecret()
{
	return oauthclientsecret;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthclientsecret(ConfigNodePropertyString  oauthclientsecret)
{
	this->oauthclientsecret = oauthclientsecret;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthOauthProviderProperties::getOauthscope()
{
	return oauthscope;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthscope(ConfigNodePropertyArray  oauthscope)
{
	this->oauthscope = oauthscope;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthconfigproviderid()
{
	return oauthconfigproviderid;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthconfigproviderid(ConfigNodePropertyString  oauthconfigproviderid)
{
	this->oauthconfigproviderid = oauthconfigproviderid;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthcreateusers()
{
	return oauthcreateusers;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthcreateusers(ConfigNodePropertyBoolean  oauthcreateusers)
{
	this->oauthcreateusers = oauthcreateusers;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthuseridproperty()
{
	return oauthuseridproperty;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthuseridproperty(ConfigNodePropertyString  oauthuseridproperty)
{
	this->oauthuseridproperty = oauthuseridproperty;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getForcestrictusernamematching()
{
	return forcestrictusernamematching;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setForcestrictusernamematching(ConfigNodePropertyBoolean  forcestrictusernamematching)
{
	this->forcestrictusernamematching = forcestrictusernamematching;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthencodeuserids()
{
	return oauthencodeuserids;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthencodeuserids(ConfigNodePropertyBoolean  oauthencodeuserids)
{
	this->oauthencodeuserids = oauthencodeuserids;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthhashuserids()
{
	return oauthhashuserids;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthhashuserids(ConfigNodePropertyBoolean  oauthhashuserids)
{
	this->oauthhashuserids = oauthhashuserids;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthcallBackUrl()
{
	return oauthcallBackUrl;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthcallBackUrl(ConfigNodePropertyString  oauthcallBackUrl)
{
	this->oauthcallBackUrl = oauthcallBackUrl;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthaccesstokenpersist()
{
	return oauthaccesstokenpersist;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthaccesstokenpersist(ConfigNodePropertyBoolean  oauthaccesstokenpersist)
{
	this->oauthaccesstokenpersist = oauthaccesstokenpersist;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthaccesstokenpersistcookie()
{
	return oauthaccesstokenpersistcookie;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthaccesstokenpersistcookie(ConfigNodePropertyBoolean  oauthaccesstokenpersistcookie)
{
	this->oauthaccesstokenpersistcookie = oauthaccesstokenpersistcookie;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthcsrfstateprotection()
{
	return oauthcsrfstateprotection;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthcsrfstateprotection(ConfigNodePropertyBoolean  oauthcsrfstateprotection)
{
	this->oauthcsrfstateprotection = oauthcsrfstateprotection;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthredirectrequestparams()
{
	return oauthredirectrequestparams;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthredirectrequestparams(ConfigNodePropertyBoolean  oauthredirectrequestparams)
{
	this->oauthredirectrequestparams = oauthredirectrequestparams;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthconfigsiblingsallow()
{
	return oauthconfigsiblingsallow;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthconfigsiblingsallow(ConfigNodePropertyBoolean  oauthconfigsiblingsallow)
{
	this->oauthconfigsiblingsallow = oauthconfigsiblingsallow;
}


