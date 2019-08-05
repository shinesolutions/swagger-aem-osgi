#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::ComDayCqDamCoreImplGfxCommonsGfxRendererProperties()
{
	//__init();
}

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::~ComDayCqDamCoreImplGfxCommonsGfxRendererProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::__init()
{
	//skipbufferedcache = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::__cleanup()
{
	//if(skipbufferedcache != NULL) {
	//
	//delete skipbufferedcache;
	//skipbufferedcache = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *skipbufferedcacheKey = "skip.bufferedcache";
	node = json_object_get_member(pJsonObject, skipbufferedcacheKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&skipbufferedcache, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&skipbufferedcache);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSkipbufferedcache();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSkipbufferedcache());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *skipbufferedcacheKey = "skip.bufferedcache";
	json_object_set_member(pJsonObject, skipbufferedcacheKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::getSkipbufferedcache()
{
	return skipbufferedcache;
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::setSkipbufferedcache(ConfigNodePropertyBoolean  skipbufferedcache)
{
	this->skipbufferedcache = skipbufferedcache;
}


