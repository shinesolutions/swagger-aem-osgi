#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthImsImplIMSProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthImsImplIMSProviderImplProperties::ComAdobeGraniteAuthImsImplIMSProviderImplProperties()
{
	//__init();
}

ComAdobeGraniteAuthImsImplIMSProviderImplProperties::~ComAdobeGraniteAuthImsImplIMSProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::__init()
{
	//oauthproviderid = new ConfigNodePropertyString();
	//oauthproviderimsauthorizationurl = new ConfigNodePropertyString();
	//oauthproviderimstokenurl = new ConfigNodePropertyString();
	//oauthproviderimsprofileurl = new ConfigNodePropertyString();
	//oauthproviderimsextendeddetailsurls = new ConfigNodePropertyArray();
	//oauthproviderimsvalidatetokenurl = new ConfigNodePropertyString();
	//oauthproviderimssessionproperty = new ConfigNodePropertyString();
	//oauthproviderimsservicetokenclientid = new ConfigNodePropertyString();
	//oauthproviderimsservicetokenclientsecret = new ConfigNodePropertyString();
	//oauthproviderimsservicetoken = new ConfigNodePropertyString();
	//imsorgref = new ConfigNodePropertyString();
	//imsgroupmapping = new ConfigNodePropertyArray();
	//oauthproviderimsonlylicensegroup = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::__cleanup()
{
	//if(oauthproviderid != NULL) {
	//
	//delete oauthproviderid;
	//oauthproviderid = NULL;
	//}
	//if(oauthproviderimsauthorizationurl != NULL) {
	//
	//delete oauthproviderimsauthorizationurl;
	//oauthproviderimsauthorizationurl = NULL;
	//}
	//if(oauthproviderimstokenurl != NULL) {
	//
	//delete oauthproviderimstokenurl;
	//oauthproviderimstokenurl = NULL;
	//}
	//if(oauthproviderimsprofileurl != NULL) {
	//
	//delete oauthproviderimsprofileurl;
	//oauthproviderimsprofileurl = NULL;
	//}
	//if(oauthproviderimsextendeddetailsurls != NULL) {
	//
	//delete oauthproviderimsextendeddetailsurls;
	//oauthproviderimsextendeddetailsurls = NULL;
	//}
	//if(oauthproviderimsvalidatetokenurl != NULL) {
	//
	//delete oauthproviderimsvalidatetokenurl;
	//oauthproviderimsvalidatetokenurl = NULL;
	//}
	//if(oauthproviderimssessionproperty != NULL) {
	//
	//delete oauthproviderimssessionproperty;
	//oauthproviderimssessionproperty = NULL;
	//}
	//if(oauthproviderimsservicetokenclientid != NULL) {
	//
	//delete oauthproviderimsservicetokenclientid;
	//oauthproviderimsservicetokenclientid = NULL;
	//}
	//if(oauthproviderimsservicetokenclientsecret != NULL) {
	//
	//delete oauthproviderimsservicetokenclientsecret;
	//oauthproviderimsservicetokenclientsecret = NULL;
	//}
	//if(oauthproviderimsservicetoken != NULL) {
	//
	//delete oauthproviderimsservicetoken;
	//oauthproviderimsservicetoken = NULL;
	//}
	//if(imsorgref != NULL) {
	//
	//delete imsorgref;
	//imsorgref = NULL;
	//}
	//if(imsgroupmapping != NULL) {
	//
	//delete imsgroupmapping;
	//imsgroupmapping = NULL;
	//}
	//if(oauthproviderimsonlylicensegroup != NULL) {
	//
	//delete oauthproviderimsonlylicensegroup;
	//oauthproviderimsonlylicensegroup = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::fromJson(char* jsonStr)
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
	const gchar *oauthproviderimsauthorizationurlKey = "oauth.provider.ims.authorization.url";
	node = json_object_get_member(pJsonObject, oauthproviderimsauthorizationurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimsauthorizationurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimsauthorizationurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimstokenurlKey = "oauth.provider.ims.token.url";
	node = json_object_get_member(pJsonObject, oauthproviderimstokenurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimstokenurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimstokenurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsprofileurlKey = "oauth.provider.ims.profile.url";
	node = json_object_get_member(pJsonObject, oauthproviderimsprofileurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimsprofileurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimsprofileurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsextendeddetailsurlsKey = "oauth.provider.ims.extended.details.urls";
	node = json_object_get_member(pJsonObject, oauthproviderimsextendeddetailsurlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&oauthproviderimsextendeddetailsurls, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&oauthproviderimsextendeddetailsurls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsvalidatetokenurlKey = "oauth.provider.ims.validate.token.url";
	node = json_object_get_member(pJsonObject, oauthproviderimsvalidatetokenurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimsvalidatetokenurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimsvalidatetokenurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimssessionpropertyKey = "oauth.provider.ims.session.property";
	node = json_object_get_member(pJsonObject, oauthproviderimssessionpropertyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimssessionproperty, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimssessionproperty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsservicetokenclientidKey = "oauth.provider.ims.service.token.client.id";
	node = json_object_get_member(pJsonObject, oauthproviderimsservicetokenclientidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimsservicetokenclientid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimsservicetokenclientid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsservicetokenclientsecretKey = "oauth.provider.ims.service.token.client.secret";
	node = json_object_get_member(pJsonObject, oauthproviderimsservicetokenclientsecretKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimsservicetokenclientsecret, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimsservicetokenclientsecret);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsservicetokenKey = "oauth.provider.ims.service.token";
	node = json_object_get_member(pJsonObject, oauthproviderimsservicetokenKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderimsservicetoken, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderimsservicetoken);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *imsorgrefKey = "ims.org.ref";
	node = json_object_get_member(pJsonObject, imsorgrefKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&imsorgref, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&imsorgref);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *imsgroupmappingKey = "ims.group.mapping";
	node = json_object_get_member(pJsonObject, imsgroupmappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&imsgroupmapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&imsgroupmapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthproviderimsonlylicensegroupKey = "oauth.provider.ims.only.license.group";
	node = json_object_get_member(pJsonObject, oauthproviderimsonlylicensegroupKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthproviderimsonlylicensegroup, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthproviderimsonlylicensegroup);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthImsImplIMSProviderImplProperties::ComAdobeGraniteAuthImsImplIMSProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::toJson()
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
		ConfigNodePropertyString obj = getOauthproviderimsauthorizationurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimsauthorizationurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsauthorizationurlKey = "oauth.provider.ims.authorization.url";
	json_object_set_member(pJsonObject, oauthproviderimsauthorizationurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimstokenurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimstokenurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimstokenurlKey = "oauth.provider.ims.token.url";
	json_object_set_member(pJsonObject, oauthproviderimstokenurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimsprofileurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimsprofileurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsprofileurlKey = "oauth.provider.ims.profile.url";
	json_object_set_member(pJsonObject, oauthproviderimsprofileurlKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOauthproviderimsextendeddetailsurls();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOauthproviderimsextendeddetailsurls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsextendeddetailsurlsKey = "oauth.provider.ims.extended.details.urls";
	json_object_set_member(pJsonObject, oauthproviderimsextendeddetailsurlsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimsvalidatetokenurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimsvalidatetokenurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsvalidatetokenurlKey = "oauth.provider.ims.validate.token.url";
	json_object_set_member(pJsonObject, oauthproviderimsvalidatetokenurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimssessionproperty();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimssessionproperty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimssessionpropertyKey = "oauth.provider.ims.session.property";
	json_object_set_member(pJsonObject, oauthproviderimssessionpropertyKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimsservicetokenclientid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimsservicetokenclientid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsservicetokenclientidKey = "oauth.provider.ims.service.token.client.id";
	json_object_set_member(pJsonObject, oauthproviderimsservicetokenclientidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimsservicetokenclientsecret();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimsservicetokenclientsecret());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsservicetokenclientsecretKey = "oauth.provider.ims.service.token.client.secret";
	json_object_set_member(pJsonObject, oauthproviderimsservicetokenclientsecretKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderimsservicetoken();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderimsservicetoken());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsservicetokenKey = "oauth.provider.ims.service.token";
	json_object_set_member(pJsonObject, oauthproviderimsservicetokenKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImsorgref();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImsorgref());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imsorgrefKey = "ims.org.ref";
	json_object_set_member(pJsonObject, imsorgrefKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getImsgroupmapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getImsgroupmapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imsgroupmappingKey = "ims.group.mapping";
	json_object_set_member(pJsonObject, imsgroupmappingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthproviderimsonlylicensegroup();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthproviderimsonlylicensegroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthproviderimsonlylicensegroupKey = "oauth.provider.ims.only.license.group";
	json_object_set_member(pJsonObject, oauthproviderimsonlylicensegroupKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderid(ConfigNodePropertyString  oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsauthorizationurl()
{
	return oauthproviderimsauthorizationurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsauthorizationurl(ConfigNodePropertyString  oauthproviderimsauthorizationurl)
{
	this->oauthproviderimsauthorizationurl = oauthproviderimsauthorizationurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimstokenurl()
{
	return oauthproviderimstokenurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimstokenurl(ConfigNodePropertyString  oauthproviderimstokenurl)
{
	this->oauthproviderimstokenurl = oauthproviderimstokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsprofileurl()
{
	return oauthproviderimsprofileurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsprofileurl(ConfigNodePropertyString  oauthproviderimsprofileurl)
{
	this->oauthproviderimsprofileurl = oauthproviderimsprofileurl;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsextendeddetailsurls()
{
	return oauthproviderimsextendeddetailsurls;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsextendeddetailsurls(ConfigNodePropertyArray  oauthproviderimsextendeddetailsurls)
{
	this->oauthproviderimsextendeddetailsurls = oauthproviderimsextendeddetailsurls;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsvalidatetokenurl()
{
	return oauthproviderimsvalidatetokenurl;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsvalidatetokenurl(ConfigNodePropertyString  oauthproviderimsvalidatetokenurl)
{
	this->oauthproviderimsvalidatetokenurl = oauthproviderimsvalidatetokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimssessionproperty()
{
	return oauthproviderimssessionproperty;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimssessionproperty(ConfigNodePropertyString  oauthproviderimssessionproperty)
{
	this->oauthproviderimssessionproperty = oauthproviderimssessionproperty;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsservicetokenclientid()
{
	return oauthproviderimsservicetokenclientid;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsservicetokenclientid(ConfigNodePropertyString  oauthproviderimsservicetokenclientid)
{
	this->oauthproviderimsservicetokenclientid = oauthproviderimsservicetokenclientid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsservicetokenclientsecret()
{
	return oauthproviderimsservicetokenclientsecret;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsservicetokenclientsecret(ConfigNodePropertyString  oauthproviderimsservicetokenclientsecret)
{
	this->oauthproviderimsservicetokenclientsecret = oauthproviderimsservicetokenclientsecret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsservicetoken()
{
	return oauthproviderimsservicetoken;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsservicetoken(ConfigNodePropertyString  oauthproviderimsservicetoken)
{
	this->oauthproviderimsservicetoken = oauthproviderimsservicetoken;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getImsorgref()
{
	return imsorgref;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setImsorgref(ConfigNodePropertyString  imsorgref)
{
	this->imsorgref = imsorgref;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getImsgroupmapping()
{
	return imsgroupmapping;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setImsgroupmapping(ConfigNodePropertyArray  imsgroupmapping)
{
	this->imsgroupmapping = imsgroupmapping;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::getOauthproviderimsonlylicensegroup()
{
	return oauthproviderimsonlylicensegroup;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplProperties::setOauthproviderimsonlylicensegroup(ConfigNodePropertyBoolean  oauthproviderimsonlylicensegroup)
{
	this->oauthproviderimsonlylicensegroup = oauthproviderimsonlylicensegroup;
}


