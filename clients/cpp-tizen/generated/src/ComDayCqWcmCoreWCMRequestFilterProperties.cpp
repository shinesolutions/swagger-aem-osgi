#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreWCMRequestFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreWCMRequestFilterProperties::ComDayCqWcmCoreWCMRequestFilterProperties()
{
	//__init();
}

ComDayCqWcmCoreWCMRequestFilterProperties::~ComDayCqWcmCoreWCMRequestFilterProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreWCMRequestFilterProperties::__init()
{
	//wcmfiltermode = new ConfigNodePropertyDropDown();
}

void
ComDayCqWcmCoreWCMRequestFilterProperties::__cleanup()
{
	//if(wcmfiltermode != NULL) {
	//
	//delete wcmfiltermode;
	//wcmfiltermode = NULL;
	//}
	//
}

void
ComDayCqWcmCoreWCMRequestFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *wcmfiltermodeKey = "wcmfilter.mode";
	node = json_object_get_member(pJsonObject, wcmfiltermodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&wcmfiltermode, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&wcmfiltermode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreWCMRequestFilterProperties::ComDayCqWcmCoreWCMRequestFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreWCMRequestFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getWcmfiltermode();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getWcmfiltermode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *wcmfiltermodeKey = "wcmfilter.mode";
	json_object_set_member(pJsonObject, wcmfiltermodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComDayCqWcmCoreWCMRequestFilterProperties::getWcmfiltermode()
{
	return wcmfiltermode;
}

void
ComDayCqWcmCoreWCMRequestFilterProperties::setWcmfiltermode(ConfigNodePropertyDropDown  wcmfiltermode)
{
	this->wcmfiltermode = wcmfiltermode;
}


