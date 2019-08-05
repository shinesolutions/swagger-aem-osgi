#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::~ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::__init()
{
	//importername = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::__cleanup()
{
	//if(importername != NULL) {
	//
	//delete importername;
	//importername = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *importernameKey = "importer.name";
	node = json_object_get_member(pJsonObject, importernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&importername, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&importername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getImportername();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getImportername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importernameKey = "importer.name";
	json_object_set_member(pJsonObject, importernameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::getImportername()
{
	return importername;
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::setImportername(ConfigNodePropertyArray  importername)
{
	this->importername = importername;
}


