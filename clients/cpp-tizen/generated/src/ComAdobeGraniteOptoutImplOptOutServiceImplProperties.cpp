#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOptoutImplOptOutServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOptoutImplOptOutServiceImplProperties::ComAdobeGraniteOptoutImplOptOutServiceImplProperties()
{
	//__init();
}

ComAdobeGraniteOptoutImplOptOutServiceImplProperties::~ComAdobeGraniteOptoutImplOptOutServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::__init()
{
	//optoutcookies = new ConfigNodePropertyArray();
	//optoutheaders = new ConfigNodePropertyArray();
	//optoutwhitelistcookies = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::__cleanup()
{
	//if(optoutcookies != NULL) {
	//
	//delete optoutcookies;
	//optoutcookies = NULL;
	//}
	//if(optoutheaders != NULL) {
	//
	//delete optoutheaders;
	//optoutheaders = NULL;
	//}
	//if(optoutwhitelistcookies != NULL) {
	//
	//delete optoutwhitelistcookies;
	//optoutwhitelistcookies = NULL;
	//}
	//
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *optoutcookiesKey = "optout.cookies";
	node = json_object_get_member(pJsonObject, optoutcookiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&optoutcookies, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&optoutcookies);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *optoutheadersKey = "optout.headers";
	node = json_object_get_member(pJsonObject, optoutheadersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&optoutheaders, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&optoutheaders);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *optoutwhitelistcookiesKey = "optout.whitelist.cookies";
	node = json_object_get_member(pJsonObject, optoutwhitelistcookiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&optoutwhitelistcookies, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&optoutwhitelistcookies);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOptoutImplOptOutServiceImplProperties::ComAdobeGraniteOptoutImplOptOutServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOptoutcookies();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOptoutcookies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optoutcookiesKey = "optout.cookies";
	json_object_set_member(pJsonObject, optoutcookiesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOptoutheaders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOptoutheaders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optoutheadersKey = "optout.headers";
	json_object_set_member(pJsonObject, optoutheadersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOptoutwhitelistcookies();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOptoutwhitelistcookies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optoutwhitelistcookiesKey = "optout.whitelist.cookies";
	json_object_set_member(pJsonObject, optoutwhitelistcookiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::getOptoutcookies()
{
	return optoutcookies;
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::setOptoutcookies(ConfigNodePropertyArray  optoutcookies)
{
	this->optoutcookies = optoutcookies;
}

ConfigNodePropertyArray
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::getOptoutheaders()
{
	return optoutheaders;
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::setOptoutheaders(ConfigNodePropertyArray  optoutheaders)
{
	this->optoutheaders = optoutheaders;
}

ConfigNodePropertyArray
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::getOptoutwhitelistcookies()
{
	return optoutwhitelistcookies;
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::setOptoutwhitelistcookies(ConfigNodePropertyArray  optoutwhitelistcookies)
{
	this->optoutwhitelistcookies = optoutwhitelistcookies;
}


