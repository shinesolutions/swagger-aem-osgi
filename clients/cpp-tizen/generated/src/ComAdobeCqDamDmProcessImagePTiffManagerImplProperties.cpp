#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::ComAdobeCqDamDmProcessImagePTiffManagerImplProperties()
{
	//__init();
}

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::~ComAdobeCqDamDmProcessImagePTiffManagerImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::__init()
{
	//maxMemory = new ConfigNodePropertyInteger();
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::__cleanup()
{
	//if(maxMemory != NULL) {
	//
	//delete maxMemory;
	//maxMemory = NULL;
	//}
	//
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxMemoryKey = "maxMemory";
	node = json_object_get_member(pJsonObject, maxMemoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxMemory, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxMemory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxMemory();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxMemory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxMemoryKey = "maxMemory";
	json_object_set_member(pJsonObject, maxMemoryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::getMaxMemory()
{
	return maxMemory;
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::setMaxMemory(ConfigNodePropertyInteger  maxMemory)
{
	this->maxMemory = maxMemory;
}


