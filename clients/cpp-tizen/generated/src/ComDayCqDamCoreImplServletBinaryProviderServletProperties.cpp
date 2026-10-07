#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletBinaryProviderServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletBinaryProviderServletProperties::ComDayCqDamCoreImplServletBinaryProviderServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletBinaryProviderServletProperties::~ComDayCqDamCoreImplServletBinaryProviderServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::__init()
{
	//slingservletresourceTypes = new ConfigNodePropertyArray();
	//slingservletmethods = new ConfigNodePropertyArray();
	//cqdamdrmenable = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::__cleanup()
{
	//if(slingservletresourceTypes != NULL) {
	//
	//delete slingservletresourceTypes;
	//slingservletresourceTypes = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//if(cqdamdrmenable != NULL) {
	//
	//delete cqdamdrmenable;
	//cqdamdrmenable = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	node = json_object_get_member(pJsonObject, slingservletresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletresourceTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	node = json_object_get_member(pJsonObject, slingservletmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletmethods, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletmethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamdrmenableKey = "cq.dam.drm.enable";
	node = json_object_get_member(pJsonObject, cqdamdrmenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamdrmenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamdrmenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletBinaryProviderServletProperties::ComDayCqDamCoreImplServletBinaryProviderServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletBinaryProviderServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	json_object_set_member(pJsonObject, slingservletresourceTypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletmethods();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	json_object_set_member(pJsonObject, slingservletmethodsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamdrmenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamdrmenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamdrmenableKey = "cq.dam.drm.enable";
	json_object_set_member(pJsonObject, cqdamdrmenableKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBinaryProviderServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::setSlingservletresourceTypes(ConfigNodePropertyArray  slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBinaryProviderServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletBinaryProviderServletProperties::getCqdamdrmenable()
{
	return cqdamdrmenable;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::setCqdamdrmenable(ConfigNodePropertyBoolean  cqdamdrmenable)
{
	this->cqdamdrmenable = cqdamdrmenable;
}


