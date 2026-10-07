#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties()
{
	//__init();
}

ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::~ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::__init()
{
	//replicationcontentuseFileStorage = new ConfigNodePropertyBoolean();
	//replicationcontentmaxCommitAttempts = new ConfigNodePropertyInteger();
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::__cleanup()
{
	//if(replicationcontentuseFileStorage != NULL) {
	//
	//delete replicationcontentuseFileStorage;
	//replicationcontentuseFileStorage = NULL;
	//}
	//if(replicationcontentmaxCommitAttempts != NULL) {
	//
	//delete replicationcontentmaxCommitAttempts;
	//replicationcontentmaxCommitAttempts = NULL;
	//}
	//
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *replicationcontentuseFileStorageKey = "replication.content.useFileStorage";
	node = json_object_get_member(pJsonObject, replicationcontentuseFileStorageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&replicationcontentuseFileStorage, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&replicationcontentuseFileStorage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *replicationcontentmaxCommitAttemptsKey = "replication.content.maxCommitAttempts";
	node = json_object_get_member(pJsonObject, replicationcontentmaxCommitAttemptsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&replicationcontentmaxCommitAttempts, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&replicationcontentmaxCommitAttempts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getReplicationcontentuseFileStorage();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getReplicationcontentuseFileStorage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *replicationcontentuseFileStorageKey = "replication.content.useFileStorage";
	json_object_set_member(pJsonObject, replicationcontentuseFileStorageKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReplicationcontentmaxCommitAttempts();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReplicationcontentmaxCommitAttempts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *replicationcontentmaxCommitAttemptsKey = "replication.content.maxCommitAttempts";
	json_object_set_member(pJsonObject, replicationcontentmaxCommitAttemptsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::getReplicationcontentuseFileStorage()
{
	return replicationcontentuseFileStorage;
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::setReplicationcontentuseFileStorage(ConfigNodePropertyBoolean  replicationcontentuseFileStorage)
{
	this->replicationcontentuseFileStorage = replicationcontentuseFileStorage;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::getReplicationcontentmaxCommitAttempts()
{
	return replicationcontentmaxCommitAttempts;
}

void
ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties::setReplicationcontentmaxCommitAttempts(ConfigNodePropertyInteger  replicationcontentmaxCommitAttempts)
{
	this->replicationcontentmaxCommitAttempts = replicationcontentmaxCommitAttempts;
}


