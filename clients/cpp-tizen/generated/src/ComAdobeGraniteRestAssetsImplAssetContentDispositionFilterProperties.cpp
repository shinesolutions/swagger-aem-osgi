#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties()
{
	//__init();
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::~ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::__init()
{
	//mimeallowEmpty = new ConfigNodePropertyBoolean();
	//mimeallowed = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::__cleanup()
{
	//if(mimeallowEmpty != NULL) {
	//
	//delete mimeallowEmpty;
	//mimeallowEmpty = NULL;
	//}
	//if(mimeallowed != NULL) {
	//
	//delete mimeallowed;
	//mimeallowed = NULL;
	//}
	//
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mimeallowEmptyKey = "mime.allowEmpty";
	node = json_object_get_member(pJsonObject, mimeallowEmptyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&mimeallowEmpty, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&mimeallowEmpty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mimeallowedKey = "mime.allowed";
	node = json_object_get_member(pJsonObject, mimeallowedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&mimeallowed, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&mimeallowed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getMimeallowEmpty();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getMimeallowEmpty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mimeallowEmptyKey = "mime.allowEmpty";
	json_object_set_member(pJsonObject, mimeallowEmptyKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMimeallowed();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMimeallowed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mimeallowedKey = "mime.allowed";
	json_object_set_member(pJsonObject, mimeallowedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::getMimeallowEmpty()
{
	return mimeallowEmpty;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::setMimeallowEmpty(ConfigNodePropertyBoolean  mimeallowEmpty)
{
	this->mimeallowEmpty = mimeallowEmpty;
}

ConfigNodePropertyArray
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::getMimeallowed()
{
	return mimeallowed;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::setMimeallowed(ConfigNodePropertyArray  mimeallowed)
{
	this->mimeallowed = mimeallowed;
}


