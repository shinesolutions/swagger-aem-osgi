#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplReplicationReceiverImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplReplicationReceiverImplProperties::ComDayCqReplicationImplReplicationReceiverImplProperties()
{
	//__init();
}

ComDayCqReplicationImplReplicationReceiverImplProperties::~ComDayCqReplicationImplReplicationReceiverImplProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::__init()
{
	//receivertmpfilethreshold = new ConfigNodePropertyInteger();
	//receiverpackagesuseinstall = new ConfigNodePropertyBoolean();
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::__cleanup()
{
	//if(receivertmpfilethreshold != NULL) {
	//
	//delete receivertmpfilethreshold;
	//receivertmpfilethreshold = NULL;
	//}
	//if(receiverpackagesuseinstall != NULL) {
	//
	//delete receiverpackagesuseinstall;
	//receiverpackagesuseinstall = NULL;
	//}
	//
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *receivertmpfilethresholdKey = "receiver.tmpfile.threshold";
	node = json_object_get_member(pJsonObject, receivertmpfilethresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&receivertmpfilethreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&receivertmpfilethreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *receiverpackagesuseinstallKey = "receiver.packages.use.install";
	node = json_object_get_member(pJsonObject, receiverpackagesuseinstallKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&receiverpackagesuseinstall, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&receiverpackagesuseinstall);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplReplicationReceiverImplProperties::ComDayCqReplicationImplReplicationReceiverImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplReplicationReceiverImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReceivertmpfilethreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReceivertmpfilethreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *receivertmpfilethresholdKey = "receiver.tmpfile.threshold";
	json_object_set_member(pJsonObject, receivertmpfilethresholdKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getReceiverpackagesuseinstall();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getReceiverpackagesuseinstall());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *receiverpackagesuseinstallKey = "receiver.packages.use.install";
	json_object_set_member(pJsonObject, receiverpackagesuseinstallKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplReplicationReceiverImplProperties::getReceivertmpfilethreshold()
{
	return receivertmpfilethreshold;
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::setReceivertmpfilethreshold(ConfigNodePropertyInteger  receivertmpfilethreshold)
{
	this->receivertmpfilethreshold = receivertmpfilethreshold;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplReplicationReceiverImplProperties::getReceiverpackagesuseinstall()
{
	return receiverpackagesuseinstall;
}

void
ComDayCqReplicationImplReplicationReceiverImplProperties::setReceiverpackagesuseinstall(ConfigNodePropertyBoolean  receiverpackagesuseinstall)
{
	this->receiverpackagesuseinstall = receiverpackagesuseinstall;
}


