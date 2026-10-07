#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties()
{
	//__init();
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::~ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::__init()
{
	//compatgroups = new ConfigNodePropertyArray();
	//enabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::__cleanup()
{
	//if(compatgroups != NULL) {
	//
	//delete compatgroups;
	//compatgroups = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *compatgroupsKey = "compatgroups";
	node = json_object_get_member(pJsonObject, compatgroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&compatgroups, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&compatgroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCompatgroups();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCompatgroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compatgroupsKey = "compatgroups";
	json_object_set_member(pJsonObject, compatgroupsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::getCompatgroups()
{
	return compatgroups;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::setCompatgroups(ConfigNodePropertyArray  compatgroups)
{
	this->compatgroups = compatgroups;
}

ConfigNodePropertyBoolean
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}


