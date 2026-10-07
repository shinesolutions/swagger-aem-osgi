#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties()
{
	//__init();
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::~ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//webserveraddress = new ConfigNodePropertyString();
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(webserveraddress != NULL) {
	//
	//delete webserveraddress;
	//webserveraddress = NULL;
	//}
	//
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::fromJson(char* jsonStr)
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
	const gchar *webserveraddressKey = "webserver.address";
	node = json_object_get_member(pJsonObject, webserveraddressKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&webserveraddress, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&webserveraddress);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWebserveraddress();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWebserveraddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *webserveraddressKey = "webserver.address";
	json_object_set_member(pJsonObject, webserveraddressKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::getWebserveraddress()
{
	return webserveraddress;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties::setWebserveraddress(ConfigNodePropertyString  webserveraddress)
{
	this->webserveraddress = webserveraddress;
}


