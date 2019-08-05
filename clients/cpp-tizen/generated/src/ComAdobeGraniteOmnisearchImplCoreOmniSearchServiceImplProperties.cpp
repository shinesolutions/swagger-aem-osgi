#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties()
{
	//__init();
}

ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::~ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::__init()
{
	//omnisearchsuggestionrequiretextmin = new ConfigNodePropertyInteger();
	//omnisearchsuggestionspellcheckrequire = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::__cleanup()
{
	//if(omnisearchsuggestionrequiretextmin != NULL) {
	//
	//delete omnisearchsuggestionrequiretextmin;
	//omnisearchsuggestionrequiretextmin = NULL;
	//}
	//if(omnisearchsuggestionspellcheckrequire != NULL) {
	//
	//delete omnisearchsuggestionspellcheckrequire;
	//omnisearchsuggestionspellcheckrequire = NULL;
	//}
	//
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *omnisearchsuggestionrequiretextminKey = "omnisearch.suggestion.requiretext.min";
	node = json_object_get_member(pJsonObject, omnisearchsuggestionrequiretextminKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&omnisearchsuggestionrequiretextmin, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&omnisearchsuggestionrequiretextmin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *omnisearchsuggestionspellcheckrequireKey = "omnisearch.suggestion.spellcheck.require";
	node = json_object_get_member(pJsonObject, omnisearchsuggestionspellcheckrequireKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&omnisearchsuggestionspellcheckrequire, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&omnisearchsuggestionspellcheckrequire);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOmnisearchsuggestionrequiretextmin();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOmnisearchsuggestionrequiretextmin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *omnisearchsuggestionrequiretextminKey = "omnisearch.suggestion.requiretext.min";
	json_object_set_member(pJsonObject, omnisearchsuggestionrequiretextminKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOmnisearchsuggestionspellcheckrequire();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOmnisearchsuggestionspellcheckrequire());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *omnisearchsuggestionspellcheckrequireKey = "omnisearch.suggestion.spellcheck.require";
	json_object_set_member(pJsonObject, omnisearchsuggestionspellcheckrequireKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::getOmnisearchsuggestionrequiretextmin()
{
	return omnisearchsuggestionrequiretextmin;
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::setOmnisearchsuggestionrequiretextmin(ConfigNodePropertyInteger  omnisearchsuggestionrequiretextmin)
{
	this->omnisearchsuggestionrequiretextmin = omnisearchsuggestionrequiretextmin;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::getOmnisearchsuggestionspellcheckrequire()
{
	return omnisearchsuggestionspellcheckrequire;
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::setOmnisearchsuggestionspellcheckrequire(ConfigNodePropertyBoolean  omnisearchsuggestionspellcheckrequire)
{
	this->omnisearchsuggestionspellcheckrequire = omnisearchsuggestionspellcheckrequire;
}


