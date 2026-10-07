#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqJcrclustersupportClusterStartLevelControllerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqJcrclustersupportClusterStartLevelControllerProperties::ComDayCqJcrclustersupportClusterStartLevelControllerProperties()
{
	//__init();
}

ComDayCqJcrclustersupportClusterStartLevelControllerProperties::~ComDayCqJcrclustersupportClusterStartLevelControllerProperties()
{
	//__cleanup();
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::__init()
{
	//clusterlevelenable = new ConfigNodePropertyBoolean();
	//clustermasterlevel = new ConfigNodePropertyInteger();
	//clusterslavelevel = new ConfigNodePropertyInteger();
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::__cleanup()
{
	//if(clusterlevelenable != NULL) {
	//
	//delete clusterlevelenable;
	//clusterlevelenable = NULL;
	//}
	//if(clustermasterlevel != NULL) {
	//
	//delete clustermasterlevel;
	//clustermasterlevel = NULL;
	//}
	//if(clusterslavelevel != NULL) {
	//
	//delete clusterslavelevel;
	//clusterslavelevel = NULL;
	//}
	//
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *clusterlevelenableKey = "cluster.level.enable";
	node = json_object_get_member(pJsonObject, clusterlevelenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&clusterlevelenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&clusterlevelenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clustermasterlevelKey = "cluster.master.level";
	node = json_object_get_member(pJsonObject, clustermasterlevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&clustermasterlevel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&clustermasterlevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clusterslavelevelKey = "cluster.slave.level";
	node = json_object_get_member(pJsonObject, clusterslavelevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&clusterslavelevel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&clusterslavelevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqJcrclustersupportClusterStartLevelControllerProperties::ComDayCqJcrclustersupportClusterStartLevelControllerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getClusterlevelenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getClusterlevelenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clusterlevelenableKey = "cluster.level.enable";
	json_object_set_member(pJsonObject, clusterlevelenableKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getClustermasterlevel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getClustermasterlevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clustermasterlevelKey = "cluster.master.level";
	json_object_set_member(pJsonObject, clustermasterlevelKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getClusterslavelevel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getClusterslavelevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clusterslavelevelKey = "cluster.slave.level";
	json_object_set_member(pJsonObject, clusterslavelevelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::getClusterlevelenable()
{
	return clusterlevelenable;
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::setClusterlevelenable(ConfigNodePropertyBoolean  clusterlevelenable)
{
	this->clusterlevelenable = clusterlevelenable;
}

ConfigNodePropertyInteger
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::getClustermasterlevel()
{
	return clustermasterlevel;
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::setClustermasterlevel(ConfigNodePropertyInteger  clustermasterlevel)
{
	this->clustermasterlevel = clustermasterlevel;
}

ConfigNodePropertyInteger
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::getClusterslavelevel()
{
	return clusterslavelevel;
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::setClusterslavelevel(ConfigNodePropertyInteger  clusterslavelevel)
{
	this->clusterslavelevel = clusterslavelevel;
}


