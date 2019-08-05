#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ApacheSlingHealthCheckResultHTMLSerializerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ApacheSlingHealthCheckResultHTMLSerializerProperties::ApacheSlingHealthCheckResultHTMLSerializerProperties()
{
	//__init();
}

ApacheSlingHealthCheckResultHTMLSerializerProperties::~ApacheSlingHealthCheckResultHTMLSerializerProperties()
{
	//__cleanup();
}

void
ApacheSlingHealthCheckResultHTMLSerializerProperties::__init()
{
	//styleString = new ConfigNodePropertyString();
}

void
ApacheSlingHealthCheckResultHTMLSerializerProperties::__cleanup()
{
	//if(styleString != NULL) {
	//
	//delete styleString;
	//styleString = NULL;
	//}
	//
}

void
ApacheSlingHealthCheckResultHTMLSerializerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *styleStringKey = "styleString";
	node = json_object_get_member(pJsonObject, styleStringKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&styleString, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&styleString);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ApacheSlingHealthCheckResultHTMLSerializerProperties::ApacheSlingHealthCheckResultHTMLSerializerProperties(char* json)
{
	this->fromJson(json);
}

char*
ApacheSlingHealthCheckResultHTMLSerializerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getStyleString();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getStyleString());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *styleStringKey = "styleString";
	json_object_set_member(pJsonObject, styleStringKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ApacheSlingHealthCheckResultHTMLSerializerProperties::getStyleString()
{
	return styleString;
}

void
ApacheSlingHealthCheckResultHTMLSerializerProperties::setStyleString(ConfigNodePropertyString  styleString)
{
	this->styleString = styleString;
}


