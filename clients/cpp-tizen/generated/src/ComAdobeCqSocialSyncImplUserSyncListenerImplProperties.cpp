#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::ComAdobeCqSocialSyncImplUserSyncListenerImplProperties()
{
	//__init();
}

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::~ComAdobeCqSocialSyncImplUserSyncListenerImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::__init()
{
	//nodetypes = new ConfigNodePropertyArray();
	//ignorableprops = new ConfigNodePropertyArray();
	//ignorablenodes = new ConfigNodePropertyArray();
	//enabled = new ConfigNodePropertyBoolean();
	//distfolders = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::__cleanup()
{
	//if(nodetypes != NULL) {
	//
	//delete nodetypes;
	//nodetypes = NULL;
	//}
	//if(ignorableprops != NULL) {
	//
	//delete ignorableprops;
	//ignorableprops = NULL;
	//}
	//if(ignorablenodes != NULL) {
	//
	//delete ignorablenodes;
	//ignorablenodes = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(distfolders != NULL) {
	//
	//delete distfolders;
	//distfolders = NULL;
	//}
	//
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nodetypesKey = "nodetypes";
	node = json_object_get_member(pJsonObject, nodetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&nodetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&nodetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ignorablepropsKey = "ignorableprops";
	node = json_object_get_member(pJsonObject, ignorablepropsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ignorableprops, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ignorableprops);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ignorablenodesKey = "ignorablenodes";
	node = json_object_get_member(pJsonObject, ignorablenodesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ignorablenodes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ignorablenodes);
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
	const gchar *distfoldersKey = "distfolders";
	node = json_object_get_member(pJsonObject, distfoldersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&distfolders, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&distfolders);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getNodetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getNodetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nodetypesKey = "nodetypes";
	json_object_set_member(pJsonObject, nodetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIgnorableprops();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIgnorableprops());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignorablepropsKey = "ignorableprops";
	json_object_set_member(pJsonObject, ignorablepropsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIgnorablenodes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIgnorablenodes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignorablenodesKey = "ignorablenodes";
	json_object_set_member(pJsonObject, ignorablenodesKey, node);
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDistfolders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDistfolders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *distfoldersKey = "distfolders";
	json_object_set_member(pJsonObject, distfoldersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getNodetypes()
{
	return nodetypes;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setNodetypes(ConfigNodePropertyArray  nodetypes)
{
	this->nodetypes = nodetypes;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getIgnorableprops()
{
	return ignorableprops;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setIgnorableprops(ConfigNodePropertyArray  ignorableprops)
{
	this->ignorableprops = ignorableprops;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getIgnorablenodes()
{
	return ignorablenodes;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setIgnorablenodes(ConfigNodePropertyArray  ignorablenodes)
{
	this->ignorablenodes = ignorablenodes;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getDistfolders()
{
	return distfolders;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setDistfolders(ConfigNodePropertyArray  distfolders)
{
	this->distfolders = distfolders;
}


