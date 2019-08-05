#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties()
{
	//__init();
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::~ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::__init()
{
	//providerroot = new ConfigNodePropertyString();
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::__cleanup()
{
	//if(providerroot != NULL) {
	//
	//delete providerroot;
	//providerroot = NULL;
	//}
	//
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *providerrootKey = "provider.root";
	node = json_object_get_member(pJsonObject, providerrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providerroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providerroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProviderroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProviderroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerrootKey = "provider.root";
	json_object_set_member(pJsonObject, providerrootKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::getProviderroot()
{
	return providerroot;
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::setProviderroot(ConfigNodePropertyString  providerroot)
{
	this->providerroot = providerroot;
}


