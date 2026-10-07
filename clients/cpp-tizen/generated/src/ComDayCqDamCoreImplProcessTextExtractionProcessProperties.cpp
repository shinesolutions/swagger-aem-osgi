#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplProcessTextExtractionProcessProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplProcessTextExtractionProcessProperties::ComDayCqDamCoreImplProcessTextExtractionProcessProperties()
{
	//__init();
}

ComDayCqDamCoreImplProcessTextExtractionProcessProperties::~ComDayCqDamCoreImplProcessTextExtractionProcessProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::__init()
{
	//mimeTypes = new ConfigNodePropertyArray();
	//maxExtract = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::__cleanup()
{
	//if(mimeTypes != NULL) {
	//
	//delete mimeTypes;
	//mimeTypes = NULL;
	//}
	//if(maxExtract != NULL) {
	//
	//delete maxExtract;
	//maxExtract = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mimeTypesKey = "mimeTypes";
	node = json_object_get_member(pJsonObject, mimeTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&mimeTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&mimeTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxExtractKey = "maxExtract";
	node = json_object_get_member(pJsonObject, maxExtractKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxExtract, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxExtract);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplProcessTextExtractionProcessProperties::ComDayCqDamCoreImplProcessTextExtractionProcessProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMimeTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMimeTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mimeTypesKey = "mimeTypes";
	json_object_set_member(pJsonObject, mimeTypesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxExtract();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxExtract());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxExtractKey = "maxExtract";
	json_object_set_member(pJsonObject, maxExtractKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::getMimeTypes()
{
	return mimeTypes;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::setMimeTypes(ConfigNodePropertyArray  mimeTypes)
{
	this->mimeTypes = mimeTypes;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::getMaxExtract()
{
	return maxExtract;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::setMaxExtract(ConfigNodePropertyInteger  maxExtract)
{
	this->maxExtract = maxExtract;
}


