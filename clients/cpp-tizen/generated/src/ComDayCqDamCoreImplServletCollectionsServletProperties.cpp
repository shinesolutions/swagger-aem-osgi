#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletCollectionsServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletCollectionsServletProperties::ComDayCqDamCoreImplServletCollectionsServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletCollectionsServletProperties::~ComDayCqDamCoreImplServletCollectionsServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::__init()
{
	//cqdambatchcollectionsproperties = new ConfigNodePropertyArray();
	//cqdambatchcollectionslimit = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::__cleanup()
{
	//if(cqdambatchcollectionsproperties != NULL) {
	//
	//delete cqdambatchcollectionsproperties;
	//cqdambatchcollectionsproperties = NULL;
	//}
	//if(cqdambatchcollectionslimit != NULL) {
	//
	//delete cqdambatchcollectionslimit;
	//cqdambatchcollectionslimit = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdambatchcollectionspropertiesKey = "cq.dam.batch.collections.properties";
	node = json_object_get_member(pJsonObject, cqdambatchcollectionspropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdambatchcollectionsproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdambatchcollectionsproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdambatchcollectionslimitKey = "cq.dam.batch.collections.limit";
	node = json_object_get_member(pJsonObject, cqdambatchcollectionslimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdambatchcollectionslimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdambatchcollectionslimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletCollectionsServletProperties::ComDayCqDamCoreImplServletCollectionsServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletCollectionsServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdambatchcollectionsproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdambatchcollectionsproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchcollectionspropertiesKey = "cq.dam.batch.collections.properties";
	json_object_set_member(pJsonObject, cqdambatchcollectionspropertiesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdambatchcollectionslimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdambatchcollectionslimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchcollectionslimitKey = "cq.dam.batch.collections.limit";
	json_object_set_member(pJsonObject, cqdambatchcollectionslimitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletCollectionsServletProperties::getCqdambatchcollectionsproperties()
{
	return cqdambatchcollectionsproperties;
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::setCqdambatchcollectionsproperties(ConfigNodePropertyArray  cqdambatchcollectionsproperties)
{
	this->cqdambatchcollectionsproperties = cqdambatchcollectionsproperties;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletCollectionsServletProperties::getCqdambatchcollectionslimit()
{
	return cqdambatchcollectionslimit;
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::setCqdambatchcollectionslimit(ConfigNodePropertyInteger  cqdambatchcollectionslimit)
{
	this->cqdambatchcollectionslimit = cqdambatchcollectionslimit;
}


