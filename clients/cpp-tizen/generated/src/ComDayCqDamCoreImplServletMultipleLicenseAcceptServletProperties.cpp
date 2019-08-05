#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::~ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::__init()
{
	//cqdamdrmenable = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::__cleanup()
{
	//if(cqdamdrmenable != NULL) {
	//
	//delete cqdamdrmenable;
	//cqdamdrmenable = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::getCqdamdrmenable()
{
	return cqdamdrmenable;
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::setCqdamdrmenable(ConfigNodePropertyBoolean  cqdamdrmenable)
{
	this->cqdamdrmenable = cqdamdrmenable;
}


