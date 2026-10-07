#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties()
{
	//__init();
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::~ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::__init()
{
	//processlabel = new ConfigNodePropertyString();
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::__cleanup()
{
	//if(processlabel != NULL) {
	//
	//delete processlabel;
	//processlabel = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *processlabelKey = "process.label";
	node = json_object_get_member(pJsonObject, processlabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&processlabel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&processlabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProcesslabel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProcesslabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *processlabelKey = "process.label";
	json_object_set_member(pJsonObject, processlabelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}


