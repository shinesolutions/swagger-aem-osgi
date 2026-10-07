#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties()
{
	//__init();
}

ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::~ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//disabledForGroups = new ConfigNodePropertyArray();
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(disabledForGroups != NULL) {
	//
	//delete disabledForGroups;
	//disabledForGroups = NULL;
	//}
	//
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *disabledForGroupsKey = "disabledForGroups";
	node = json_object_get_member(pJsonObject, disabledForGroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&disabledForGroups, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&disabledForGroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		ConfigNodePropertyArray obj = getDisabledForGroups();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDisabledForGroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disabledForGroupsKey = "disabledForGroups";
	json_object_set_member(pJsonObject, disabledForGroupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::getDisabledForGroups()
{
	return disabledForGroups;
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::setDisabledForGroups(ConfigNodePropertyArray  disabledForGroups)
{
	this->disabledForGroups = disabledForGroups;
}


