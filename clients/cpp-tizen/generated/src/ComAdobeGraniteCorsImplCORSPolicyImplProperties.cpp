#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCorsImplCORSPolicyImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCorsImplCORSPolicyImplProperties::ComAdobeGraniteCorsImplCORSPolicyImplProperties()
{
	//__init();
}

ComAdobeGraniteCorsImplCORSPolicyImplProperties::~ComAdobeGraniteCorsImplCORSPolicyImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::__init()
{
	//alloworigin = new ConfigNodePropertyArray();
	//alloworiginregexp = new ConfigNodePropertyArray();
	//allowedpaths = new ConfigNodePropertyArray();
	//exposedheaders = new ConfigNodePropertyArray();
	//maxage = new ConfigNodePropertyInteger();
	//supportedheaders = new ConfigNodePropertyArray();
	//supportedmethods = new ConfigNodePropertyArray();
	//supportscredentials = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::__cleanup()
{
	//if(alloworigin != NULL) {
	//
	//delete alloworigin;
	//alloworigin = NULL;
	//}
	//if(alloworiginregexp != NULL) {
	//
	//delete alloworiginregexp;
	//alloworiginregexp = NULL;
	//}
	//if(allowedpaths != NULL) {
	//
	//delete allowedpaths;
	//allowedpaths = NULL;
	//}
	//if(exposedheaders != NULL) {
	//
	//delete exposedheaders;
	//exposedheaders = NULL;
	//}
	//if(maxage != NULL) {
	//
	//delete maxage;
	//maxage = NULL;
	//}
	//if(supportedheaders != NULL) {
	//
	//delete supportedheaders;
	//supportedheaders = NULL;
	//}
	//if(supportedmethods != NULL) {
	//
	//delete supportedmethods;
	//supportedmethods = NULL;
	//}
	//if(supportscredentials != NULL) {
	//
	//delete supportscredentials;
	//supportscredentials = NULL;
	//}
	//
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *alloworiginKey = "alloworigin";
	node = json_object_get_member(pJsonObject, alloworiginKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&alloworigin, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&alloworigin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *alloworiginregexpKey = "alloworiginregexp";
	node = json_object_get_member(pJsonObject, alloworiginregexpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&alloworiginregexp, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&alloworiginregexp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowedpathsKey = "allowedpaths";
	node = json_object_get_member(pJsonObject, allowedpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowedpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowedpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exposedheadersKey = "exposedheaders";
	node = json_object_get_member(pJsonObject, exposedheadersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&exposedheaders, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&exposedheaders);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxageKey = "maxage";
	node = json_object_get_member(pJsonObject, maxageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportedheadersKey = "supportedheaders";
	node = json_object_get_member(pJsonObject, supportedheadersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&supportedheaders, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&supportedheaders);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportedmethodsKey = "supportedmethods";
	node = json_object_get_member(pJsonObject, supportedmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&supportedmethods, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&supportedmethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportscredentialsKey = "supportscredentials";
	node = json_object_get_member(pJsonObject, supportscredentialsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&supportscredentials, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&supportscredentials);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCorsImplCORSPolicyImplProperties::ComAdobeGraniteCorsImplCORSPolicyImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCorsImplCORSPolicyImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAlloworigin();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAlloworigin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *alloworiginKey = "alloworigin";
	json_object_set_member(pJsonObject, alloworiginKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAlloworiginregexp();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAlloworiginregexp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *alloworiginregexpKey = "alloworiginregexp";
	json_object_set_member(pJsonObject, alloworiginregexpKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowedpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowedpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowedpathsKey = "allowedpaths";
	json_object_set_member(pJsonObject, allowedpathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExposedheaders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExposedheaders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exposedheadersKey = "exposedheaders";
	json_object_set_member(pJsonObject, exposedheadersKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxageKey = "maxage";
	json_object_set_member(pJsonObject, maxageKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSupportedheaders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSupportedheaders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportedheadersKey = "supportedheaders";
	json_object_set_member(pJsonObject, supportedheadersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSupportedmethods();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSupportedmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportedmethodsKey = "supportedmethods";
	json_object_set_member(pJsonObject, supportedmethodsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSupportscredentials();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSupportscredentials());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportscredentialsKey = "supportscredentials";
	json_object_set_member(pJsonObject, supportscredentialsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getAlloworigin()
{
	return alloworigin;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setAlloworigin(ConfigNodePropertyArray  alloworigin)
{
	this->alloworigin = alloworigin;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getAlloworiginregexp()
{
	return alloworiginregexp;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setAlloworiginregexp(ConfigNodePropertyArray  alloworiginregexp)
{
	this->alloworiginregexp = alloworiginregexp;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getAllowedpaths()
{
	return allowedpaths;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setAllowedpaths(ConfigNodePropertyArray  allowedpaths)
{
	this->allowedpaths = allowedpaths;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getExposedheaders()
{
	return exposedheaders;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setExposedheaders(ConfigNodePropertyArray  exposedheaders)
{
	this->exposedheaders = exposedheaders;
}

ConfigNodePropertyInteger
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getMaxage()
{
	return maxage;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setMaxage(ConfigNodePropertyInteger  maxage)
{
	this->maxage = maxage;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getSupportedheaders()
{
	return supportedheaders;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setSupportedheaders(ConfigNodePropertyArray  supportedheaders)
{
	this->supportedheaders = supportedheaders;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getSupportedmethods()
{
	return supportedmethods;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setSupportedmethods(ConfigNodePropertyArray  supportedmethods)
{
	this->supportedmethods = supportedmethods;
}

ConfigNodePropertyBoolean
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getSupportscredentials()
{
	return supportscredentials;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setSupportscredentials(ConfigNodePropertyBoolean  supportscredentials)
{
	this->supportscredentials = supportscredentials;
}


