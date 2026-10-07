#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties()
{
	//__init();
}

OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::~OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties()
{
	//__cleanup();
}

void
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::__init()
{
	//maxsize = new ConfigNodePropertyInteger();
}

void
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::__cleanup()
{
	//if(maxsize != NULL) {
	//
	//delete maxsize;
	//maxsize = NULL;
	//}
	//
}

void
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxsizeKey = "max.size";
	node = json_object_get_member(pJsonObject, maxsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxsizeKey = "max.size";
	json_object_set_member(pJsonObject, maxsizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::getMaxsize()
{
	return maxsize;
}

void
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::setMaxsize(ConfigNodePropertyInteger  maxsize)
{
	this->maxsize = maxsize;
}


