#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties()
{
	//__init();
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::~ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::__init()
{
	//comadobecqscreensanalyticsimplurl = new ConfigNodePropertyString();
	//comadobecqscreensanalyticsimplapikey = new ConfigNodePropertyString();
	//comadobecqscreensanalyticsimplproject = new ConfigNodePropertyString();
	//comadobecqscreensanalyticsimplenvironment = new ConfigNodePropertyDropDown();
	//comadobecqscreensanalyticsimplsendFrequency = new ConfigNodePropertyInteger();
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::__cleanup()
{
	//if(comadobecqscreensanalyticsimplurl != NULL) {
	//
	//delete comadobecqscreensanalyticsimplurl;
	//comadobecqscreensanalyticsimplurl = NULL;
	//}
	//if(comadobecqscreensanalyticsimplapikey != NULL) {
	//
	//delete comadobecqscreensanalyticsimplapikey;
	//comadobecqscreensanalyticsimplapikey = NULL;
	//}
	//if(comadobecqscreensanalyticsimplproject != NULL) {
	//
	//delete comadobecqscreensanalyticsimplproject;
	//comadobecqscreensanalyticsimplproject = NULL;
	//}
	//if(comadobecqscreensanalyticsimplenvironment != NULL) {
	//
	//delete comadobecqscreensanalyticsimplenvironment;
	//comadobecqscreensanalyticsimplenvironment = NULL;
	//}
	//if(comadobecqscreensanalyticsimplsendFrequency != NULL) {
	//
	//delete comadobecqscreensanalyticsimplsendFrequency;
	//comadobecqscreensanalyticsimplsendFrequency = NULL;
	//}
	//
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobecqscreensanalyticsimplurlKey = "com.adobe.cq.screens.analytics.impl.url";
	node = json_object_get_member(pJsonObject, comadobecqscreensanalyticsimplurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensanalyticsimplurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensanalyticsimplurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensanalyticsimplapikeyKey = "com.adobe.cq.screens.analytics.impl.apikey";
	node = json_object_get_member(pJsonObject, comadobecqscreensanalyticsimplapikeyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensanalyticsimplapikey, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensanalyticsimplapikey);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensanalyticsimplprojectKey = "com.adobe.cq.screens.analytics.impl.project";
	node = json_object_get_member(pJsonObject, comadobecqscreensanalyticsimplprojectKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensanalyticsimplproject, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensanalyticsimplproject);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensanalyticsimplenvironmentKey = "com.adobe.cq.screens.analytics.impl.environment";
	node = json_object_get_member(pJsonObject, comadobecqscreensanalyticsimplenvironmentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&comadobecqscreensanalyticsimplenvironment, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&comadobecqscreensanalyticsimplenvironment);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensanalyticsimplsendFrequencyKey = "com.adobe.cq.screens.analytics.impl.sendFrequency";
	node = json_object_get_member(pJsonObject, comadobecqscreensanalyticsimplsendFrequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobecqscreensanalyticsimplsendFrequency, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobecqscreensanalyticsimplsendFrequency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensanalyticsimplurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensanalyticsimplurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensanalyticsimplurlKey = "com.adobe.cq.screens.analytics.impl.url";
	json_object_set_member(pJsonObject, comadobecqscreensanalyticsimplurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensanalyticsimplapikey();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensanalyticsimplapikey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensanalyticsimplapikeyKey = "com.adobe.cq.screens.analytics.impl.apikey";
	json_object_set_member(pJsonObject, comadobecqscreensanalyticsimplapikeyKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensanalyticsimplproject();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensanalyticsimplproject());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensanalyticsimplprojectKey = "com.adobe.cq.screens.analytics.impl.project";
	json_object_set_member(pJsonObject, comadobecqscreensanalyticsimplprojectKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getComadobecqscreensanalyticsimplenvironment();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getComadobecqscreensanalyticsimplenvironment());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensanalyticsimplenvironmentKey = "com.adobe.cq.screens.analytics.impl.environment";
	json_object_set_member(pJsonObject, comadobecqscreensanalyticsimplenvironmentKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobecqscreensanalyticsimplsendFrequency();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobecqscreensanalyticsimplsendFrequency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensanalyticsimplsendFrequencyKey = "com.adobe.cq.screens.analytics.impl.sendFrequency";
	json_object_set_member(pJsonObject, comadobecqscreensanalyticsimplsendFrequencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplurl()
{
	return comadobecqscreensanalyticsimplurl;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplurl(ConfigNodePropertyString  comadobecqscreensanalyticsimplurl)
{
	this->comadobecqscreensanalyticsimplurl = comadobecqscreensanalyticsimplurl;
}

ConfigNodePropertyString
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplapikey()
{
	return comadobecqscreensanalyticsimplapikey;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplapikey(ConfigNodePropertyString  comadobecqscreensanalyticsimplapikey)
{
	this->comadobecqscreensanalyticsimplapikey = comadobecqscreensanalyticsimplapikey;
}

ConfigNodePropertyString
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplproject()
{
	return comadobecqscreensanalyticsimplproject;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplproject(ConfigNodePropertyString  comadobecqscreensanalyticsimplproject)
{
	this->comadobecqscreensanalyticsimplproject = comadobecqscreensanalyticsimplproject;
}

ConfigNodePropertyDropDown
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplenvironment()
{
	return comadobecqscreensanalyticsimplenvironment;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplenvironment(ConfigNodePropertyDropDown  comadobecqscreensanalyticsimplenvironment)
{
	this->comadobecqscreensanalyticsimplenvironment = comadobecqscreensanalyticsimplenvironment;
}

ConfigNodePropertyInteger
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::getComadobecqscreensanalyticsimplsendFrequency()
{
	return comadobecqscreensanalyticsimplsendFrequency;
}

void
ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties::setComadobecqscreensanalyticsimplsendFrequency(ConfigNodePropertyInteger  comadobecqscreensanalyticsimplsendFrequency)
{
	this->comadobecqscreensanalyticsimplsendFrequency = comadobecqscreensanalyticsimplsendFrequency;
}


