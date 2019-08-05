#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqContentsyncImplContentSyncManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqContentsyncImplContentSyncManagerImplProperties::ComDayCqContentsyncImplContentSyncManagerImplProperties()
{
	//__init();
}

ComDayCqContentsyncImplContentSyncManagerImplProperties::~ComDayCqContentsyncImplContentSyncManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::__init()
{
	//contentsyncfallbackauthorizable = new ConfigNodePropertyString();
	//contentsyncfallbackupdateuser = new ConfigNodePropertyString();
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::__cleanup()
{
	//if(contentsyncfallbackauthorizable != NULL) {
	//
	//delete contentsyncfallbackauthorizable;
	//contentsyncfallbackauthorizable = NULL;
	//}
	//if(contentsyncfallbackupdateuser != NULL) {
	//
	//delete contentsyncfallbackupdateuser;
	//contentsyncfallbackupdateuser = NULL;
	//}
	//
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentsyncfallbackauthorizableKey = "contentsync.fallback.authorizable";
	node = json_object_get_member(pJsonObject, contentsyncfallbackauthorizableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&contentsyncfallbackauthorizable, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&contentsyncfallbackauthorizable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *contentsyncfallbackupdateuserKey = "contentsync.fallback.updateuser";
	node = json_object_get_member(pJsonObject, contentsyncfallbackupdateuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&contentsyncfallbackupdateuser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&contentsyncfallbackupdateuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqContentsyncImplContentSyncManagerImplProperties::ComDayCqContentsyncImplContentSyncManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqContentsyncImplContentSyncManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getContentsyncfallbackauthorizable();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getContentsyncfallbackauthorizable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentsyncfallbackauthorizableKey = "contentsync.fallback.authorizable";
	json_object_set_member(pJsonObject, contentsyncfallbackauthorizableKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getContentsyncfallbackupdateuser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getContentsyncfallbackupdateuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentsyncfallbackupdateuserKey = "contentsync.fallback.updateuser";
	json_object_set_member(pJsonObject, contentsyncfallbackupdateuserKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqContentsyncImplContentSyncManagerImplProperties::getContentsyncfallbackauthorizable()
{
	return contentsyncfallbackauthorizable;
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::setContentsyncfallbackauthorizable(ConfigNodePropertyString  contentsyncfallbackauthorizable)
{
	this->contentsyncfallbackauthorizable = contentsyncfallbackauthorizable;
}

ConfigNodePropertyString
ComDayCqContentsyncImplContentSyncManagerImplProperties::getContentsyncfallbackupdateuser()
{
	return contentsyncfallbackupdateuser;
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::setContentsyncfallbackupdateuser(ConfigNodePropertyString  contentsyncfallbackupdateuser)
{
	this->contentsyncfallbackupdateuser = contentsyncfallbackupdateuser;
}


