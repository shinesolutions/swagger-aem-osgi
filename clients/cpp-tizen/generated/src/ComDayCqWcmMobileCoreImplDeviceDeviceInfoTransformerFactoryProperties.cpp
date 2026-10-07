#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties()
{
	//__init();
}

ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::~ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::__init()
{
	//deviceinfotransformerenabled = new ConfigNodePropertyBoolean();
	//deviceinfotransformercssstyle = new ConfigNodePropertyString();
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::__cleanup()
{
	//if(deviceinfotransformerenabled != NULL) {
	//
	//delete deviceinfotransformerenabled;
	//deviceinfotransformerenabled = NULL;
	//}
	//if(deviceinfotransformercssstyle != NULL) {
	//
	//delete deviceinfotransformercssstyle;
	//deviceinfotransformercssstyle = NULL;
	//}
	//
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deviceinfotransformerenabledKey = "device.info.transformer.enabled";
	node = json_object_get_member(pJsonObject, deviceinfotransformerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&deviceinfotransformerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&deviceinfotransformerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deviceinfotransformercssstyleKey = "device.info.transformer.css.style";
	node = json_object_get_member(pJsonObject, deviceinfotransformercssstyleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&deviceinfotransformercssstyle, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&deviceinfotransformercssstyle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDeviceinfotransformerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDeviceinfotransformerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deviceinfotransformerenabledKey = "device.info.transformer.enabled";
	json_object_set_member(pJsonObject, deviceinfotransformerenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDeviceinfotransformercssstyle();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDeviceinfotransformercssstyle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deviceinfotransformercssstyleKey = "device.info.transformer.css.style";
	json_object_set_member(pJsonObject, deviceinfotransformercssstyleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::getDeviceinfotransformerenabled()
{
	return deviceinfotransformerenabled;
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::setDeviceinfotransformerenabled(ConfigNodePropertyBoolean  deviceinfotransformerenabled)
{
	this->deviceinfotransformerenabled = deviceinfotransformerenabled;
}

ConfigNodePropertyString
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::getDeviceinfotransformercssstyle()
{
	return deviceinfotransformercssstyle;
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::setDeviceinfotransformercssstyle(ConfigNodePropertyString  deviceinfotransformercssstyle)
{
	this->deviceinfotransformercssstyle = deviceinfotransformercssstyle;
}


