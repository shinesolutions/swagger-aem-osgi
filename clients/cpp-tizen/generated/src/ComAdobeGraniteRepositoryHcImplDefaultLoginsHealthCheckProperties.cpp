#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//accountlogins = new ConfigNodePropertyArray();
	//consolelogins = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(accountlogins != NULL) {
	//
	//delete accountlogins;
	//accountlogins = NULL;
	//}
	//if(consolelogins != NULL) {
	//
	//delete consolelogins;
	//consolelogins = NULL;
	//}
	//
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *accountloginsKey = "account.logins";
	node = json_object_get_member(pJsonObject, accountloginsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&accountlogins, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&accountlogins);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *consoleloginsKey = "console.logins";
	node = json_object_get_member(pJsonObject, consoleloginsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&consolelogins, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&consolelogins);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAccountlogins();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAccountlogins());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accountloginsKey = "account.logins";
	json_object_set_member(pJsonObject, accountloginsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getConsolelogins();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConsolelogins());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *consoleloginsKey = "console.logins";
	json_object_set_member(pJsonObject, consoleloginsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::getAccountlogins()
{
	return accountlogins;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::setAccountlogins(ConfigNodePropertyArray  accountlogins)
{
	this->accountlogins = accountlogins;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::getConsolelogins()
{
	return consolelogins;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::setConsolelogins(ConfigNodePropertyArray  consolelogins)
{
	this->consolelogins = consolelogins;
}


