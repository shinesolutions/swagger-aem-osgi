#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties()
{
	//__init();
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::~ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::__init()
{
	//providerroots = new ConfigNodePropertyString();
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::__cleanup()
{
	//if(providerroots != NULL) {
	//
	//delete providerroots;
	//providerroots = NULL;
	//}
	//
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *providerrootsKey = "provider.roots";
	node = json_object_get_member(pJsonObject, providerrootsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providerroots, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providerroots);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProviderroots();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProviderroots());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerrootsKey = "provider.roots";
	json_object_set_member(pJsonObject, providerrootsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::getProviderroots()
{
	return providerroots;
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::setProviderroots(ConfigNodePropertyString  providerroots)
{
	this->providerroots = providerroots;
}


