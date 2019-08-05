#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
{
	//__init();
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::__init()
{
	//cqcommerceassethandlerfallback = new ConfigNodePropertyString();
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::__cleanup()
{
	//if(cqcommerceassethandlerfallback != NULL) {
	//
	//delete cqcommerceassethandlerfallback;
	//cqcommerceassethandlerfallback = NULL;
	//}
	//
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqcommerceassethandlerfallbackKey = "cq.commerce.asset.handler.fallback";
	node = json_object_get_member(pJsonObject, cqcommerceassethandlerfallbackKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcommerceassethandlerfallback, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcommerceassethandlerfallback);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcommerceassethandlerfallback();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcommerceassethandlerfallback());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommerceassethandlerfallbackKey = "cq.commerce.asset.handler.fallback";
	json_object_set_member(pJsonObject, cqcommerceassethandlerfallbackKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::getCqcommerceassethandlerfallback()
{
	return cqcommerceassethandlerfallback;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::setCqcommerceassethandlerfallback(ConfigNodePropertyString  cqcommerceassethandlerfallback)
{
	this->cqcommerceassethandlerfallback = cqcommerceassethandlerfallback;
}


