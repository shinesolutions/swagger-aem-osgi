#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties()
{
	//__init();
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::~AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties()
{
	//__cleanup();
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::__init()
{
	//fontList = new ConfigNodePropertyArray();
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::__cleanup()
{
	//if(fontList != NULL) {
	//
	//delete fontList;
	//fontList = NULL;
	//}
	//
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fontListKey = "fontList";
	node = json_object_get_member(pJsonObject, fontListKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fontList, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fontList);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(char* json)
{
	this->fromJson(json);
}

char*
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFontList();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFontList());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fontListKey = "fontList";
	json_object_set_member(pJsonObject, fontListKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::getFontList()
{
	return fontList;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties::setFontList(ConfigNodePropertyArray  fontList)
{
	this->fontList = fontList;
}


