#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletCollectionServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletCollectionServletProperties::ComDayCqDamCoreImplServletCollectionServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletCollectionServletProperties::~ComDayCqDamCoreImplServletCollectionServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::__init()
{
	//cqdambatchcollectionproperties = new ConfigNodePropertyArray();
	//cqdambatchcollectionmaxcollections = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::__cleanup()
{
	//if(cqdambatchcollectionproperties != NULL) {
	//
	//delete cqdambatchcollectionproperties;
	//cqdambatchcollectionproperties = NULL;
	//}
	//if(cqdambatchcollectionmaxcollections != NULL) {
	//
	//delete cqdambatchcollectionmaxcollections;
	//cqdambatchcollectionmaxcollections = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdambatchcollectionpropertiesKey = "cq.dam.batch.collection.properties";
	node = json_object_get_member(pJsonObject, cqdambatchcollectionpropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdambatchcollectionproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdambatchcollectionproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdambatchcollectionmaxcollectionsKey = "cq.dam.batch.collection.maxcollections";
	node = json_object_get_member(pJsonObject, cqdambatchcollectionmaxcollectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdambatchcollectionmaxcollections, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdambatchcollectionmaxcollections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletCollectionServletProperties::ComDayCqDamCoreImplServletCollectionServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletCollectionServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdambatchcollectionproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdambatchcollectionproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchcollectionpropertiesKey = "cq.dam.batch.collection.properties";
	json_object_set_member(pJsonObject, cqdambatchcollectionpropertiesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdambatchcollectionmaxcollections();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdambatchcollectionmaxcollections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchcollectionmaxcollectionsKey = "cq.dam.batch.collection.maxcollections";
	json_object_set_member(pJsonObject, cqdambatchcollectionmaxcollectionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletCollectionServletProperties::getCqdambatchcollectionproperties()
{
	return cqdambatchcollectionproperties;
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::setCqdambatchcollectionproperties(ConfigNodePropertyArray  cqdambatchcollectionproperties)
{
	this->cqdambatchcollectionproperties = cqdambatchcollectionproperties;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletCollectionServletProperties::getCqdambatchcollectionmaxcollections()
{
	return cqdambatchcollectionmaxcollections;
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::setCqdambatchcollectionmaxcollections(ConfigNodePropertyInteger  cqdambatchcollectionmaxcollections)
{
	this->cqdambatchcollectionmaxcollections = cqdambatchcollectionmaxcollections;
}


