#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingStartupfilterImplStartupFilterImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingStartupfilterImplStartupFilterImplProperties::OrgApacheSlingStartupfilterImplStartupFilterImplProperties()
{
	//__init();
}

OrgApacheSlingStartupfilterImplStartupFilterImplProperties::~OrgApacheSlingStartupfilterImplStartupFilterImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::__init()
{
	//activebydefault = new ConfigNodePropertyBoolean();
	//defaultmessage = new ConfigNodePropertyString();
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::__cleanup()
{
	//if(activebydefault != NULL) {
	//
	//delete activebydefault;
	//activebydefault = NULL;
	//}
	//if(defaultmessage != NULL) {
	//
	//delete defaultmessage;
	//defaultmessage = NULL;
	//}
	//
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *activebydefaultKey = "active.by.default";
	node = json_object_get_member(pJsonObject, activebydefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&activebydefault, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&activebydefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultmessageKey = "default.message";
	node = json_object_get_member(pJsonObject, defaultmessageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultmessage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultmessage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingStartupfilterImplStartupFilterImplProperties::OrgApacheSlingStartupfilterImplStartupFilterImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getActivebydefault();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getActivebydefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *activebydefaultKey = "active.by.default";
	json_object_set_member(pJsonObject, activebydefaultKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultmessage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultmessage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultmessageKey = "default.message";
	json_object_set_member(pJsonObject, defaultmessageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::getActivebydefault()
{
	return activebydefault;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::setActivebydefault(ConfigNodePropertyBoolean  activebydefault)
{
	this->activebydefault = activebydefault;
}

ConfigNodePropertyString
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::getDefaultmessage()
{
	return defaultmessage;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::setDefaultmessage(ConfigNodePropertyString  defaultmessage)
{
	this->defaultmessage = defaultmessage;
}


