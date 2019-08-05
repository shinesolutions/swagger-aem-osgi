#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteContexthubImplContextHubImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteContexthubImplContextHubImplProperties::ComAdobeGraniteContexthubImplContextHubImplProperties()
{
	//__init();
}

ComAdobeGraniteContexthubImplContextHubImplProperties::~ComAdobeGraniteContexthubImplContextHubImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::__init()
{
	//comadobegranitecontexthubsilent_mode = new ConfigNodePropertyBoolean();
	//comadobegranitecontexthubshow_ui = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::__cleanup()
{
	//if(comadobegranitecontexthubsilent_mode != NULL) {
	//
	//delete comadobegranitecontexthubsilent_mode;
	//comadobegranitecontexthubsilent_mode = NULL;
	//}
	//if(comadobegranitecontexthubshow_ui != NULL) {
	//
	//delete comadobegranitecontexthubshow_ui;
	//comadobegranitecontexthubshow_ui = NULL;
	//}
	//
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobegranitecontexthubsilent_modeKey = "com.adobe.granite.contexthub.silent_mode";
	node = json_object_get_member(pJsonObject, comadobegranitecontexthubsilent_modeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&comadobegranitecontexthubsilent_mode, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&comadobegranitecontexthubsilent_mode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitecontexthubshow_uiKey = "com.adobe.granite.contexthub.show_ui";
	node = json_object_get_member(pJsonObject, comadobegranitecontexthubshow_uiKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&comadobegranitecontexthubshow_ui, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&comadobegranitecontexthubshow_ui);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteContexthubImplContextHubImplProperties::ComAdobeGraniteContexthubImplContextHubImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteContexthubImplContextHubImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getComadobegranitecontexthubsilentMode();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getComadobegranitecontexthubsilentMode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitecontexthubsilent_modeKey = "com.adobe.granite.contexthub.silent_mode";
	json_object_set_member(pJsonObject, comadobegranitecontexthubsilent_modeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getComadobegranitecontexthubshowUi();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getComadobegranitecontexthubshowUi());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitecontexthubshow_uiKey = "com.adobe.granite.contexthub.show_ui";
	json_object_set_member(pJsonObject, comadobegranitecontexthubshow_uiKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteContexthubImplContextHubImplProperties::getComadobegranitecontexthubsilentMode()
{
	return comadobegranitecontexthubsilent_mode;
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::setComadobegranitecontexthubsilentMode(ConfigNodePropertyBoolean  comadobegranitecontexthubsilent_mode)
{
	this->comadobegranitecontexthubsilent_mode = comadobegranitecontexthubsilent_mode;
}

ConfigNodePropertyBoolean
ComAdobeGraniteContexthubImplContextHubImplProperties::getComadobegranitecontexthubshowUi()
{
	return comadobegranitecontexthubshow_ui;
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::setComadobegranitecontexthubshowUi(ConfigNodePropertyBoolean  comadobegranitecontexthubshow_ui)
{
	this->comadobegranitecontexthubshow_ui = comadobegranitecontexthubshow_ui;
}


