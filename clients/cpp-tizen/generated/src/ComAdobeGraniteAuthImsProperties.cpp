#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthImsProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthImsProperties::ComAdobeGraniteAuthImsProperties()
{
	//__init();
}

ComAdobeGraniteAuthImsProperties::~ComAdobeGraniteAuthImsProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthImsProperties::__init()
{
	//configid = new ConfigNodePropertyString();
	//scope = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthImsProperties::__cleanup()
{
	//if(configid != NULL) {
	//
	//delete configid;
	//configid = NULL;
	//}
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthImsProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *configidKey = "configid";
	node = json_object_get_member(pJsonObject, configidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&configid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&configid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scope, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scope);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthImsProperties::ComAdobeGraniteAuthImsProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthImsProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getConfigid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getConfigid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configidKey = "configid";
	json_object_set_member(pJsonObject, configidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScope();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScope());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsProperties::getConfigid()
{
	return configid;
}

void
ComAdobeGraniteAuthImsProperties::setConfigid(ConfigNodePropertyString  configid)
{
	this->configid = configid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsProperties::getScope()
{
	return scope;
}

void
ComAdobeGraniteAuthImsProperties::setScope(ConfigNodePropertyString  scope)
{
	this->scope = scope;
}


