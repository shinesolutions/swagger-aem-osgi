#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::__init()
{
	//commitsTrackerWriterGroups = new ConfigNodePropertyArray();
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::__cleanup()
{
	//if(commitsTrackerWriterGroups != NULL) {
	//
	//delete commitsTrackerWriterGroups;
	//commitsTrackerWriterGroups = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *commitsTrackerWriterGroupsKey = "commitsTrackerWriterGroups";
	node = json_object_get_member(pJsonObject, commitsTrackerWriterGroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&commitsTrackerWriterGroups, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&commitsTrackerWriterGroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCommitsTrackerWriterGroups();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCommitsTrackerWriterGroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *commitsTrackerWriterGroupsKey = "commitsTrackerWriterGroups";
	json_object_set_member(pJsonObject, commitsTrackerWriterGroupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::getCommitsTrackerWriterGroups()
{
	return commitsTrackerWriterGroups;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::setCommitsTrackerWriterGroups(ConfigNodePropertyArray  commitsTrackerWriterGroups)
{
	this->commitsTrackerWriterGroups = commitsTrackerWriterGroups;
}


