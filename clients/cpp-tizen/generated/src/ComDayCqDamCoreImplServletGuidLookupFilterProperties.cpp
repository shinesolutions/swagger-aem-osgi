#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletGuidLookupFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletGuidLookupFilterProperties::ComDayCqDamCoreImplServletGuidLookupFilterProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletGuidLookupFilterProperties::~ComDayCqDamCoreImplServletGuidLookupFilterProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletGuidLookupFilterProperties::__init()
{
	//cqdamcoreguidlookupfilterenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplServletGuidLookupFilterProperties::__cleanup()
{
	//if(cqdamcoreguidlookupfilterenabled != NULL) {
	//
	//delete cqdamcoreguidlookupfilterenabled;
	//cqdamcoreguidlookupfilterenabled = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletGuidLookupFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamcoreguidlookupfilterenabledKey = "cq.dam.core.guidlookupfilter.enabled";
	node = json_object_get_member(pJsonObject, cqdamcoreguidlookupfilterenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamcoreguidlookupfilterenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamcoreguidlookupfilterenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletGuidLookupFilterProperties::ComDayCqDamCoreImplServletGuidLookupFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletGuidLookupFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamcoreguidlookupfilterenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamcoreguidlookupfilterenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamcoreguidlookupfilterenabledKey = "cq.dam.core.guidlookupfilter.enabled";
	json_object_set_member(pJsonObject, cqdamcoreguidlookupfilterenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletGuidLookupFilterProperties::getCqdamcoreguidlookupfilterenabled()
{
	return cqdamcoreguidlookupfilterenabled;
}

void
ComDayCqDamCoreImplServletGuidLookupFilterProperties::setCqdamcoreguidlookupfilterenabled(ConfigNodePropertyBoolean  cqdamcoreguidlookupfilterenabled)
{
	this->cqdamcoreguidlookupfilterenabled = cqdamcoreguidlookupfilterenabled;
}


