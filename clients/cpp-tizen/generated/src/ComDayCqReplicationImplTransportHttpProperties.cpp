#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplTransportHttpProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplTransportHttpProperties::ComDayCqReplicationImplTransportHttpProperties()
{
	//__init();
}

ComDayCqReplicationImplTransportHttpProperties::~ComDayCqReplicationImplTransportHttpProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplTransportHttpProperties::__init()
{
	//disabledciphersuites = new ConfigNodePropertyArray();
	//enabledciphersuites = new ConfigNodePropertyArray();
}

void
ComDayCqReplicationImplTransportHttpProperties::__cleanup()
{
	//if(disabledciphersuites != NULL) {
	//
	//delete disabledciphersuites;
	//disabledciphersuites = NULL;
	//}
	//if(enabledciphersuites != NULL) {
	//
	//delete enabledciphersuites;
	//enabledciphersuites = NULL;
	//}
	//
}

void
ComDayCqReplicationImplTransportHttpProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *disabledciphersuitesKey = "disabled.cipher.suites";
	node = json_object_get_member(pJsonObject, disabledciphersuitesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&disabledciphersuites, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&disabledciphersuites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledciphersuitesKey = "enabled.cipher.suites";
	node = json_object_get_member(pJsonObject, enabledciphersuitesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&enabledciphersuites, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&enabledciphersuites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplTransportHttpProperties::ComDayCqReplicationImplTransportHttpProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplTransportHttpProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDisabledciphersuites();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDisabledciphersuites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disabledciphersuitesKey = "disabled.cipher.suites";
	json_object_set_member(pJsonObject, disabledciphersuitesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getEnabledciphersuites();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getEnabledciphersuites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledciphersuitesKey = "enabled.cipher.suites";
	json_object_set_member(pJsonObject, enabledciphersuitesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportHttpProperties::getDisabledciphersuites()
{
	return disabledciphersuites;
}

void
ComDayCqReplicationImplTransportHttpProperties::setDisabledciphersuites(ConfigNodePropertyArray  disabledciphersuites)
{
	this->disabledciphersuites = disabledciphersuites;
}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportHttpProperties::getEnabledciphersuites()
{
	return enabledciphersuites;
}

void
ComDayCqReplicationImplTransportHttpProperties::setEnabledciphersuites(ConfigNodePropertyArray  enabledciphersuites)
{
	this->enabledciphersuites = enabledciphersuites;
}


