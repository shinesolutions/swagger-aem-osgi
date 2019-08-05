#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties()
{
	//__init();
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::~ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::__init()
{
	//offloadingtransporter = new ConfigNodePropertyString();
	//offloadingcleanuppayload = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::__cleanup()
{
	//if(offloadingtransporter != NULL) {
	//
	//delete offloadingtransporter;
	//offloadingtransporter = NULL;
	//}
	//if(offloadingcleanuppayload != NULL) {
	//
	//delete offloadingcleanuppayload;
	//offloadingcleanuppayload = NULL;
	//}
	//
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offloadingtransporterKey = "offloading.transporter";
	node = json_object_get_member(pJsonObject, offloadingtransporterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&offloadingtransporter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&offloadingtransporter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offloadingcleanuppayloadKey = "offloading.cleanup.payload";
	node = json_object_get_member(pJsonObject, offloadingcleanuppayloadKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&offloadingcleanuppayload, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&offloadingcleanuppayload);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOffloadingtransporter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOffloadingtransporter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offloadingtransporterKey = "offloading.transporter";
	json_object_set_member(pJsonObject, offloadingtransporterKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOffloadingcleanuppayload();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOffloadingcleanuppayload());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offloadingcleanuppayloadKey = "offloading.cleanup.payload";
	json_object_set_member(pJsonObject, offloadingcleanuppayloadKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::getOffloadingtransporter()
{
	return offloadingtransporter;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::setOffloadingtransporter(ConfigNodePropertyString  offloadingtransporter)
{
	this->offloadingtransporter = offloadingtransporter;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::getOffloadingcleanuppayload()
{
	return offloadingcleanuppayload;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::setOffloadingcleanuppayload(ConfigNodePropertyBoolean  offloadingcleanuppayload)
{
	this->offloadingcleanuppayload = offloadingcleanuppayload;
}


