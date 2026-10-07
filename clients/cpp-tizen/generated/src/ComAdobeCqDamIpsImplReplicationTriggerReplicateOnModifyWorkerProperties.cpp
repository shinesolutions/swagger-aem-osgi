#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties()
{
	//__init();
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::~ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::__init()
{
	//dmreplicateonmodifyenabled = new ConfigNodePropertyBoolean();
	//dmreplicateonmodifyforcesyncdeletes = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::__cleanup()
{
	//if(dmreplicateonmodifyenabled != NULL) {
	//
	//delete dmreplicateonmodifyenabled;
	//dmreplicateonmodifyenabled = NULL;
	//}
	//if(dmreplicateonmodifyforcesyncdeletes != NULL) {
	//
	//delete dmreplicateonmodifyforcesyncdeletes;
	//dmreplicateonmodifyforcesyncdeletes = NULL;
	//}
	//
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dmreplicateonmodifyenabledKey = "dmreplicateonmodify.enabled";
	node = json_object_get_member(pJsonObject, dmreplicateonmodifyenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dmreplicateonmodifyenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dmreplicateonmodifyenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dmreplicateonmodifyforcesyncdeletesKey = "dmreplicateonmodify.forcesyncdeletes";
	node = json_object_get_member(pJsonObject, dmreplicateonmodifyforcesyncdeletesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dmreplicateonmodifyforcesyncdeletes, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dmreplicateonmodifyforcesyncdeletes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDmreplicateonmodifyenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDmreplicateonmodifyenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dmreplicateonmodifyenabledKey = "dmreplicateonmodify.enabled";
	json_object_set_member(pJsonObject, dmreplicateonmodifyenabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDmreplicateonmodifyforcesyncdeletes();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDmreplicateonmodifyforcesyncdeletes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dmreplicateonmodifyforcesyncdeletesKey = "dmreplicateonmodify.forcesyncdeletes";
	json_object_set_member(pJsonObject, dmreplicateonmodifyforcesyncdeletesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::getDmreplicateonmodifyenabled()
{
	return dmreplicateonmodifyenabled;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::setDmreplicateonmodifyenabled(ConfigNodePropertyBoolean  dmreplicateonmodifyenabled)
{
	this->dmreplicateonmodifyenabled = dmreplicateonmodifyenabled;
}

ConfigNodePropertyBoolean
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::getDmreplicateonmodifyforcesyncdeletes()
{
	return dmreplicateonmodifyforcesyncdeletes;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::setDmreplicateonmodifyforcesyncdeletes(ConfigNodePropertyBoolean  dmreplicateonmodifyforcesyncdeletes)
{
	this->dmreplicateonmodifyforcesyncdeletes = dmreplicateonmodifyforcesyncdeletes;
}


