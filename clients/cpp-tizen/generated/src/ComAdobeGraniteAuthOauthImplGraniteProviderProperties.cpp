#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplGraniteProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplGraniteProviderProperties::ComAdobeGraniteAuthOauthImplGraniteProviderProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplGraniteProviderProperties::~ComAdobeGraniteAuthOauthImplGraniteProviderProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::__init()
{
	//oauthproviderid = new ConfigNodePropertyString();
	//oauthprovidergraniteauthorizationurl = new ConfigNodePropertyString();
	//oauthprovidergranitetokenurl = new ConfigNodePropertyString();
	//oauthprovidergraniteprofileurl = new ConfigNodePropertyString();
	//oauthprovidergraniteextendeddetailsurls = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::__cleanup()
{
	//if(oauthproviderid != NULL) {
	//
	//delete oauthproviderid;
	//oauthproviderid = NULL;
	//}
	//if(oauthprovidergraniteauthorizationurl != NULL) {
	//
	//delete oauthprovidergraniteauthorizationurl;
	//oauthprovidergraniteauthorizationurl = NULL;
	//}
	//if(oauthprovidergranitetokenurl != NULL) {
	//
	//delete oauthprovidergranitetokenurl;
	//oauthprovidergranitetokenurl = NULL;
	//}
	//if(oauthprovidergraniteprofileurl != NULL) {
	//
	//delete oauthprovidergraniteprofileurl;
	//oauthprovidergraniteprofileurl = NULL;
	//}
	//if(oauthprovidergraniteextendeddetailsurls != NULL) {
	//
	//delete oauthprovidergraniteextendeddetailsurls;
	//oauthprovidergraniteextendeddetailsurls = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::fromJson(char* jsonStr)
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
	const gchar *oauthprovidergraniteauthorizationurlKey = "oauth.provider.granite.authorization.url";
	node = json_object_get_member(pJsonObject, oauthprovidergraniteauthorizationurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergraniteauthorizationurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergraniteauthorizationurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthprovidergranitetokenurlKey = "oauth.provider.granite.token.url";
	node = json_object_get_member(pJsonObject, oauthprovidergranitetokenurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergranitetokenurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergranitetokenurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthprovidergraniteprofileurlKey = "oauth.provider.granite.profile.url";
	node = json_object_get_member(pJsonObject, oauthprovidergraniteprofileurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergraniteprofileurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergraniteprofileurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthprovidergraniteextendeddetailsurlsKey = "oauth.provider.granite.extended.details.urls";
	node = json_object_get_member(pJsonObject, oauthprovidergraniteextendeddetailsurlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthprovidergraniteextendeddetailsurls, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthprovidergraniteextendeddetailsurls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthImplGraniteProviderProperties::ComAdobeGraniteAuthOauthImplGraniteProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::toJson()
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
		ConfigNodePropertyString obj = getOauthprovidergraniteauthorizationurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergraniteauthorizationurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergraniteauthorizationurlKey = "oauth.provider.granite.authorization.url";
	json_object_set_member(pJsonObject, oauthprovidergraniteauthorizationurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthprovidergranitetokenurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergranitetokenurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergranitetokenurlKey = "oauth.provider.granite.token.url";
	json_object_set_member(pJsonObject, oauthprovidergranitetokenurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthprovidergraniteprofileurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergraniteprofileurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergraniteprofileurlKey = "oauth.provider.granite.profile.url";
	json_object_set_member(pJsonObject, oauthprovidergraniteprofileurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthprovidergraniteextendeddetailsurls();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthprovidergraniteextendeddetailsurls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovidergraniteextendeddetailsurlsKey = "oauth.provider.granite.extended.details.urls";
	json_object_set_member(pJsonObject, oauthprovidergraniteextendeddetailsurlsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthproviderid(ConfigNodePropertyString  oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergraniteauthorizationurl()
{
	return oauthprovidergraniteauthorizationurl;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergraniteauthorizationurl(ConfigNodePropertyString  oauthprovidergraniteauthorizationurl)
{
	this->oauthprovidergraniteauthorizationurl = oauthprovidergraniteauthorizationurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergranitetokenurl()
{
	return oauthprovidergranitetokenurl;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergranitetokenurl(ConfigNodePropertyString  oauthprovidergranitetokenurl)
{
	this->oauthprovidergranitetokenurl = oauthprovidergranitetokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergraniteprofileurl()
{
	return oauthprovidergraniteprofileurl;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergraniteprofileurl(ConfigNodePropertyString  oauthprovidergraniteprofileurl)
{
	this->oauthprovidergraniteprofileurl = oauthprovidergraniteprofileurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::getOauthprovidergraniteextendeddetailsurls()
{
	return oauthprovidergraniteextendeddetailsurls;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderProperties::setOauthprovidergraniteextendeddetailsurls(ConfigNodePropertyString  oauthprovidergraniteextendeddetailsurls)
{
	this->oauthprovidergraniteextendeddetailsurls = oauthprovidergraniteextendeddetailsurls;
}


