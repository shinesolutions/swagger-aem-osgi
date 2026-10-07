#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties()
{
	//__init();
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::~ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::__init()
{
	//size = new ConfigNodePropertyInteger();
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::__cleanup()
{
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&size, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&size);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::getSize()
{
	return size;
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::setSize(ConfigNodePropertyInteger  size)
{
	this->size = size;
}


