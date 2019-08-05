#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletBatchMetadataServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletBatchMetadataServletProperties::ComDayCqDamCoreImplServletBatchMetadataServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletBatchMetadataServletProperties::~ComDayCqDamCoreImplServletBatchMetadataServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::__init()
{
	//cqdambatchmetadataassetdefault = new ConfigNodePropertyArray();
	//cqdambatchmetadatacollectiondefault = new ConfigNodePropertyArray();
	//cqdambatchmetadatamaxresources = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::__cleanup()
{
	//if(cqdambatchmetadataassetdefault != NULL) {
	//
	//delete cqdambatchmetadataassetdefault;
	//cqdambatchmetadataassetdefault = NULL;
	//}
	//if(cqdambatchmetadatacollectiondefault != NULL) {
	//
	//delete cqdambatchmetadatacollectiondefault;
	//cqdambatchmetadatacollectiondefault = NULL;
	//}
	//if(cqdambatchmetadatamaxresources != NULL) {
	//
	//delete cqdambatchmetadatamaxresources;
	//cqdambatchmetadatamaxresources = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdambatchmetadataassetdefaultKey = "cq.dam.batch.metadata.asset.default";
	node = json_object_get_member(pJsonObject, cqdambatchmetadataassetdefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdambatchmetadataassetdefault, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdambatchmetadataassetdefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdambatchmetadatacollectiondefaultKey = "cq.dam.batch.metadata.collection.default";
	node = json_object_get_member(pJsonObject, cqdambatchmetadatacollectiondefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdambatchmetadatacollectiondefault, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdambatchmetadatacollectiondefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdambatchmetadatamaxresourcesKey = "cq.dam.batch.metadata.maxresources";
	node = json_object_get_member(pJsonObject, cqdambatchmetadatamaxresourcesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdambatchmetadatamaxresources, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdambatchmetadatamaxresources);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletBatchMetadataServletProperties::ComDayCqDamCoreImplServletBatchMetadataServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletBatchMetadataServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdambatchmetadataassetdefault();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdambatchmetadataassetdefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchmetadataassetdefaultKey = "cq.dam.batch.metadata.asset.default";
	json_object_set_member(pJsonObject, cqdambatchmetadataassetdefaultKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdambatchmetadatacollectiondefault();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdambatchmetadatacollectiondefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchmetadatacollectiondefaultKey = "cq.dam.batch.metadata.collection.default";
	json_object_set_member(pJsonObject, cqdambatchmetadatacollectiondefaultKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdambatchmetadatamaxresources();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdambatchmetadatamaxresources());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchmetadatamaxresourcesKey = "cq.dam.batch.metadata.maxresources";
	json_object_set_member(pJsonObject, cqdambatchmetadatamaxresourcesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBatchMetadataServletProperties::getCqdambatchmetadataassetdefault()
{
	return cqdambatchmetadataassetdefault;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::setCqdambatchmetadataassetdefault(ConfigNodePropertyArray  cqdambatchmetadataassetdefault)
{
	this->cqdambatchmetadataassetdefault = cqdambatchmetadataassetdefault;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBatchMetadataServletProperties::getCqdambatchmetadatacollectiondefault()
{
	return cqdambatchmetadatacollectiondefault;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::setCqdambatchmetadatacollectiondefault(ConfigNodePropertyArray  cqdambatchmetadatacollectiondefault)
{
	this->cqdambatchmetadatacollectiondefault = cqdambatchmetadatacollectiondefault;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletBatchMetadataServletProperties::getCqdambatchmetadatamaxresources()
{
	return cqdambatchmetadatamaxresources;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::setCqdambatchmetadatamaxresources(ConfigNodePropertyInteger  cqdambatchmetadatamaxresources)
{
	this->cqdambatchmetadatamaxresources = cqdambatchmetadatamaxresources;
}


