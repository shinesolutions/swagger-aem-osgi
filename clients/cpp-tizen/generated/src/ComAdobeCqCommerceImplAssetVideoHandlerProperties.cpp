#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommerceImplAssetVideoHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommerceImplAssetVideoHandlerProperties::ComAdobeCqCommerceImplAssetVideoHandlerProperties()
{
	//__init();
}

ComAdobeCqCommerceImplAssetVideoHandlerProperties::~ComAdobeCqCommerceImplAssetVideoHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::__init()
{
	//cqcommerceassethandleractive = new ConfigNodePropertyBoolean();
	//cqcommerceassethandlername = new ConfigNodePropertyString();
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::__cleanup()
{
	//if(cqcommerceassethandleractive != NULL) {
	//
	//delete cqcommerceassethandleractive;
	//cqcommerceassethandleractive = NULL;
	//}
	//if(cqcommerceassethandlername != NULL) {
	//
	//delete cqcommerceassethandlername;
	//cqcommerceassethandlername = NULL;
	//}
	//
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqcommerceassethandleractiveKey = "cq.commerce.asset.handler.active";
	node = json_object_get_member(pJsonObject, cqcommerceassethandleractiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqcommerceassethandleractive, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqcommerceassethandleractive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcommerceassethandlernameKey = "cq.commerce.asset.handler.name";
	node = json_object_get_member(pJsonObject, cqcommerceassethandlernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcommerceassethandlername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcommerceassethandlername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommerceImplAssetVideoHandlerProperties::ComAdobeCqCommerceImplAssetVideoHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommerceImplAssetVideoHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqcommerceassethandleractive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqcommerceassethandleractive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommerceassethandleractiveKey = "cq.commerce.asset.handler.active";
	json_object_set_member(pJsonObject, cqcommerceassethandleractiveKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcommerceassethandlername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcommerceassethandlername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommerceassethandlernameKey = "cq.commerce.asset.handler.name";
	json_object_set_member(pJsonObject, cqcommerceassethandlernameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqCommerceImplAssetVideoHandlerProperties::getCqcommerceassethandleractive()
{
	return cqcommerceassethandleractive;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::setCqcommerceassethandleractive(ConfigNodePropertyBoolean  cqcommerceassethandleractive)
{
	this->cqcommerceassethandleractive = cqcommerceassethandleractive;
}

ConfigNodePropertyString
ComAdobeCqCommerceImplAssetVideoHandlerProperties::getCqcommerceassethandlername()
{
	return cqcommerceassethandlername;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::setCqcommerceassethandlername(ConfigNodePropertyString  cqcommerceassethandlername)
{
	this->cqcommerceassethandlername = cqcommerceassethandlername;
}


