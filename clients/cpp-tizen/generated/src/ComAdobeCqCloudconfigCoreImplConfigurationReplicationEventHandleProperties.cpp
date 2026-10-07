#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties()
{
	//__init();
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::~ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties()
{
	//__cleanup();
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::__init()
{
	//flushagents = new ConfigNodePropertyArray();
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::__cleanup()
{
	//if(flushagents != NULL) {
	//
	//delete flushagents;
	//flushagents = NULL;
	//}
	//
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *flushagentsKey = "flush.agents";
	node = json_object_get_member(pJsonObject, flushagentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&flushagents, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&flushagents);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFlushagents();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFlushagents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *flushagentsKey = "flush.agents";
	json_object_set_member(pJsonObject, flushagentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::getFlushagents()
{
	return flushagents;
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::setFlushagents(ConfigNodePropertyArray  flushagents)
{
	this->flushagents = flushagents;
}


