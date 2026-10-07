#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties()
{
	//__init();
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::~ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::__init()
{
	//cqdamallowallmime = new ConfigNodePropertyBoolean();
	//cqdamallowedassetmimes = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::__cleanup()
{
	//if(cqdamallowallmime != NULL) {
	//
	//delete cqdamallowallmime;
	//cqdamallowallmime = NULL;
	//}
	//if(cqdamallowedassetmimes != NULL) {
	//
	//delete cqdamallowedassetmimes;
	//cqdamallowedassetmimes = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamallowallmimeKey = "cq.dam.allow.all.mime";
	node = json_object_get_member(pJsonObject, cqdamallowallmimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamallowallmime, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamallowallmime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamallowedassetmimesKey = "cq.dam.allowed.asset.mimes";
	node = json_object_get_member(pJsonObject, cqdamallowedassetmimesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdamallowedassetmimes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdamallowedassetmimes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamallowallmime();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamallowallmime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamallowallmimeKey = "cq.dam.allow.all.mime";
	json_object_set_member(pJsonObject, cqdamallowallmimeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdamallowedassetmimes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdamallowedassetmimes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamallowedassetmimesKey = "cq.dam.allowed.asset.mimes";
	json_object_set_member(pJsonObject, cqdamallowedassetmimesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::getCqdamallowallmime()
{
	return cqdamallowallmime;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::setCqdamallowallmime(ConfigNodePropertyBoolean  cqdamallowallmime)
{
	this->cqdamallowallmime = cqdamallowallmime;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::getCqdamallowedassetmimes()
{
	return cqdamallowedassetmimes;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::setCqdamallowedassetmimes(ConfigNodePropertyArray  cqdamallowedassetmimes)
{
	this->cqdamallowedassetmimes = cqdamallowedassetmimes;
}


