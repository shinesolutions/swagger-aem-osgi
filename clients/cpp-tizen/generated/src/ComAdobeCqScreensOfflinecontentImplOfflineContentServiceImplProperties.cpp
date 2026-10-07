#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties()
{
	//__init();
}

ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::~ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::__init()
{
	//disableSmartSync = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::__cleanup()
{
	//if(disableSmartSync != NULL) {
	//
	//delete disableSmartSync;
	//disableSmartSync = NULL;
	//}
	//
}

void
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *disableSmartSyncKey = "disableSmartSync";
	node = json_object_get_member(pJsonObject, disableSmartSyncKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&disableSmartSync, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&disableSmartSync);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDisableSmartSync();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDisableSmartSync());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disableSmartSyncKey = "disableSmartSync";
	json_object_set_member(pJsonObject, disableSmartSyncKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::getDisableSmartSync()
{
	return disableSmartSync;
}

void
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::setDisableSmartSync(ConfigNodePropertyBoolean  disableSmartSync)
{
	this->disableSmartSync = disableSmartSync;
}


