#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplRenditionMakerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplRenditionMakerImplProperties::ComDayCqDamCoreImplRenditionMakerImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplRenditionMakerImplProperties::~ComDayCqDamCoreImplRenditionMakerImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::__init()
{
	//xmppropagate = new ConfigNodePropertyBoolean();
	//xmpexcludes = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::__cleanup()
{
	//if(xmppropagate != NULL) {
	//
	//delete xmppropagate;
	//xmppropagate = NULL;
	//}
	//if(xmpexcludes != NULL) {
	//
	//delete xmpexcludes;
	//xmpexcludes = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *xmppropagateKey = "xmp.propagate";
	node = json_object_get_member(pJsonObject, xmppropagateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&xmppropagate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&xmppropagate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *xmpexcludesKey = "xmp.excludes";
	node = json_object_get_member(pJsonObject, xmpexcludesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&xmpexcludes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&xmpexcludes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplRenditionMakerImplProperties::ComDayCqDamCoreImplRenditionMakerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplRenditionMakerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getXmppropagate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getXmppropagate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmppropagateKey = "xmp.propagate";
	json_object_set_member(pJsonObject, xmppropagateKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getXmpexcludes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getXmpexcludes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmpexcludesKey = "xmp.excludes";
	json_object_set_member(pJsonObject, xmpexcludesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplRenditionMakerImplProperties::getXmppropagate()
{
	return xmppropagate;
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::setXmppropagate(ConfigNodePropertyBoolean  xmppropagate)
{
	this->xmppropagate = xmppropagate;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplRenditionMakerImplProperties::getXmpexcludes()
{
	return xmpexcludes;
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::setXmpexcludes(ConfigNodePropertyArray  xmpexcludes)
{
	this->xmpexcludes = xmpexcludes;
}


