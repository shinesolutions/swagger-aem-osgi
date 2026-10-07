#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
	//__init();
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::~ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::__init()
{
	//activeRunModes = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::__cleanup()
{
	//if(activeRunModes != NULL) {
	//
	//delete activeRunModes;
	//activeRunModes = NULL;
	//}
	//
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *activeRunModesKey = "activeRunModes";
	node = json_object_get_member(pJsonObject, activeRunModesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&activeRunModes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&activeRunModes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getActiveRunModes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getActiveRunModes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *activeRunModesKey = "activeRunModes";
	json_object_set_member(pJsonObject, activeRunModesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::getActiveRunModes()
{
	return activeRunModes;
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::setActiveRunModes(ConfigNodePropertyArray  activeRunModes)
{
	this->activeRunModes = activeRunModes;
}


