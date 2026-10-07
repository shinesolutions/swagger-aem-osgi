#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties()
{
	//__init();
}

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::~ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::__init()
{
	//disabledciphersuites = new ConfigNodePropertyArray();
	//enabledciphersuites = new ConfigNodePropertyArray();
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::__cleanup()
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
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::fromJson(char* jsonStr)
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

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::toJson()
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
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::getDisabledciphersuites()
{
	return disabledciphersuites;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::setDisabledciphersuites(ConfigNodePropertyArray  disabledciphersuites)
{
	this->disabledciphersuites = disabledciphersuites;
}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::getEnabledciphersuites()
{
	return enabledciphersuites;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::setEnabledciphersuites(ConfigNodePropertyArray  enabledciphersuites)
{
	this->enabledciphersuites = enabledciphersuites;
}


