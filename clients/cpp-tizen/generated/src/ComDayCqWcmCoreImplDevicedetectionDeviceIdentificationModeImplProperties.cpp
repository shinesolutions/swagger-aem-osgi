#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::~ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::__init()
{
	//dimdefaultmode = new ConfigNodePropertyDropDown();
	//dimappcacheenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::__cleanup()
{
	//if(dimdefaultmode != NULL) {
	//
	//delete dimdefaultmode;
	//dimdefaultmode = NULL;
	//}
	//if(dimappcacheenabled != NULL) {
	//
	//delete dimappcacheenabled;
	//dimappcacheenabled = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dimdefaultmodeKey = "dim.default.mode";
	node = json_object_get_member(pJsonObject, dimdefaultmodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&dimdefaultmode, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&dimdefaultmode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dimappcacheenabledKey = "dim.appcache.enabled";
	node = json_object_get_member(pJsonObject, dimappcacheenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&dimappcacheenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&dimappcacheenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getDimdefaultmode();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getDimdefaultmode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dimdefaultmodeKey = "dim.default.mode";
	json_object_set_member(pJsonObject, dimdefaultmodeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDimappcacheenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDimappcacheenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dimappcacheenabledKey = "dim.appcache.enabled";
	json_object_set_member(pJsonObject, dimappcacheenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::getDimdefaultmode()
{
	return dimdefaultmode;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::setDimdefaultmode(ConfigNodePropertyDropDown  dimdefaultmode)
{
	this->dimdefaultmode = dimdefaultmode;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::getDimappcacheenabled()
{
	return dimappcacheenabled;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::setDimappcacheenabled(ConfigNodePropertyBoolean  dimappcacheenabled)
{
	this->dimappcacheenabled = dimappcacheenabled;
}


