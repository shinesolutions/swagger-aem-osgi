#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties()
{
	//__init();
}

ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::~ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::__init()
{
	//disabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::__cleanup()
{
	//if(disabled != NULL) {
	//
	//delete disabled;
	//disabled = NULL;
	//}
	//
}

void
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *disabledKey = "disabled";
	node = json_object_get_member(pJsonObject, disabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&disabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&disabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDisabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDisabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disabledKey = "disabled";
	json_object_set_member(pJsonObject, disabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::getDisabled()
{
	return disabled;
}

void
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::setDisabled(ConfigNodePropertyBoolean  disabled)
{
	this->disabled = disabled;
}


