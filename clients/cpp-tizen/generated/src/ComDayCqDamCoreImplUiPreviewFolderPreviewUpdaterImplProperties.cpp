#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::~ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::__init()
{
	//createPreviewEnabled = new ConfigNodePropertyBoolean();
	//updatePreviewEnabled = new ConfigNodePropertyBoolean();
	//queueSize = new ConfigNodePropertyInteger();
	//folderPreviewRenditionRegex = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::__cleanup()
{
	//if(createPreviewEnabled != NULL) {
	//
	//delete createPreviewEnabled;
	//createPreviewEnabled = NULL;
	//}
	//if(updatePreviewEnabled != NULL) {
	//
	//delete updatePreviewEnabled;
	//updatePreviewEnabled = NULL;
	//}
	//if(queueSize != NULL) {
	//
	//delete queueSize;
	//queueSize = NULL;
	//}
	//if(folderPreviewRenditionRegex != NULL) {
	//
	//delete folderPreviewRenditionRegex;
	//folderPreviewRenditionRegex = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *createPreviewEnabledKey = "createPreviewEnabled";
	node = json_object_get_member(pJsonObject, createPreviewEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&createPreviewEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&createPreviewEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *updatePreviewEnabledKey = "updatePreviewEnabled";
	node = json_object_get_member(pJsonObject, updatePreviewEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&updatePreviewEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&updatePreviewEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueSizeKey = "queueSize";
	node = json_object_get_member(pJsonObject, queueSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queueSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queueSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *folderPreviewRenditionRegexKey = "folderPreviewRenditionRegex";
	node = json_object_get_member(pJsonObject, folderPreviewRenditionRegexKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&folderPreviewRenditionRegex, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&folderPreviewRenditionRegex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCreatePreviewEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCreatePreviewEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *createPreviewEnabledKey = "createPreviewEnabled";
	json_object_set_member(pJsonObject, createPreviewEnabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUpdatePreviewEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUpdatePreviewEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updatePreviewEnabledKey = "updatePreviewEnabled";
	json_object_set_member(pJsonObject, updatePreviewEnabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueueSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueueSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueSizeKey = "queueSize";
	json_object_set_member(pJsonObject, queueSizeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFolderPreviewRenditionRegex();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFolderPreviewRenditionRegex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *folderPreviewRenditionRegexKey = "folderPreviewRenditionRegex";
	json_object_set_member(pJsonObject, folderPreviewRenditionRegexKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getCreatePreviewEnabled()
{
	return createPreviewEnabled;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setCreatePreviewEnabled(ConfigNodePropertyBoolean  createPreviewEnabled)
{
	this->createPreviewEnabled = createPreviewEnabled;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getUpdatePreviewEnabled()
{
	return updatePreviewEnabled;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setUpdatePreviewEnabled(ConfigNodePropertyBoolean  updatePreviewEnabled)
{
	this->updatePreviewEnabled = updatePreviewEnabled;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getQueueSize()
{
	return queueSize;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setQueueSize(ConfigNodePropertyInteger  queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyString
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getFolderPreviewRenditionRegex()
{
	return folderPreviewRenditionRegex;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setFolderPreviewRenditionRegex(ConfigNodePropertyString  folderPreviewRenditionRegex)
{
	this->folderPreviewRenditionRegex = folderPreviewRenditionRegex;
}


