#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties()
{
	//__init();
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::~ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::__init()
{
	//xmphandlercqformats = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::__cleanup()
{
	//if(xmphandlercqformats != NULL) {
	//
	//delete xmphandlercqformats;
	//xmphandlercqformats = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *xmphandlercqformatsKey = "xmphandler.cq.formats";
	node = json_object_get_member(pJsonObject, xmphandlercqformatsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&xmphandlercqformats, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&xmphandlercqformats);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getXmphandlercqformats();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getXmphandlercqformats());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmphandlercqformatsKey = "xmphandler.cq.formats";
	json_object_set_member(pJsonObject, xmphandlercqformatsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::getXmphandlercqformats()
{
	return xmphandlercqformats;
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::setXmphandlercqformats(ConfigNodePropertyArray  xmphandlercqformats)
{
	this->xmphandlercqformats = xmphandlercqformats;
}


