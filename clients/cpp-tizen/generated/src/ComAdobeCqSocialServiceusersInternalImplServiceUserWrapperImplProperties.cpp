#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties()
{
	//__init();
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::~ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::__init()
{
	//enableFallback = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::__cleanup()
{
	//if(enableFallback != NULL) {
	//
	//delete enableFallback;
	//enableFallback = NULL;
	//}
	//
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enableFallbackKey = "enableFallback";
	node = json_object_get_member(pJsonObject, enableFallbackKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableFallback, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableFallback);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableFallback();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableFallback());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableFallbackKey = "enableFallback";
	json_object_set_member(pJsonObject, enableFallbackKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::getEnableFallback()
{
	return enableFallback;
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::setEnableFallback(ConfigNodePropertyBoolean  enableFallback)
{
	this->enableFallback = enableFallback;
}


