#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties()
{
	//__init();
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::~ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::__init()
{
	//group = new ConfigNodePropertyString();
	//ids = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::__cleanup()
{
	//if(group != NULL) {
	//
	//delete group;
	//group = NULL;
	//}
	//if(ids != NULL) {
	//
	//delete ids;
	//ids = NULL;
	//}
	//
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *groupKey = "group";
	node = json_object_get_member(pJsonObject, groupKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&group, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idsKey = "ids";
	node = json_object_get_member(pJsonObject, idsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ids, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ids);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroup();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupKey = "group";
	json_object_set_member(pJsonObject, groupKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIds();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idsKey = "ids";
	json_object_set_member(pJsonObject, idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::getGroup()
{
	return group;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::setGroup(ConfigNodePropertyString  group)
{
	this->group = group;
}

ConfigNodePropertyArray
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::getIds()
{
	return ids;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::setIds(ConfigNodePropertyArray  ids)
{
	this->ids = ids;
}


