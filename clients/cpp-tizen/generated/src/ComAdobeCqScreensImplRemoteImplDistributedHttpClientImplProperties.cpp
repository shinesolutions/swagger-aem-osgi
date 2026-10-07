#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties()
{
	//__init();
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::~ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::__init()
{
	//comadobeaemscreensimplremoterequest_timeout = new ConfigNodePropertyInteger();
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::__cleanup()
{
	//if(comadobeaemscreensimplremoterequest_timeout != NULL) {
	//
	//delete comadobeaemscreensimplremoterequest_timeout;
	//comadobeaemscreensimplremoterequest_timeout = NULL;
	//}
	//
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobeaemscreensimplremoterequest_timeoutKey = "com.adobe.aem.screens.impl.remote.request_timeout";
	node = json_object_get_member(pJsonObject, comadobeaemscreensimplremoterequest_timeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobeaemscreensimplremoterequest_timeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobeaemscreensimplremoterequest_timeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobeaemscreensimplremoterequestTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobeaemscreensimplremoterequestTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobeaemscreensimplremoterequest_timeoutKey = "com.adobe.aem.screens.impl.remote.request_timeout";
	json_object_set_member(pJsonObject, comadobeaemscreensimplremoterequest_timeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::getComadobeaemscreensimplremoterequestTimeout()
{
	return comadobeaemscreensimplremoterequest_timeout;
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::setComadobeaemscreensimplremoterequestTimeout(ConfigNodePropertyInteger  comadobeaemscreensimplremoterequest_timeout)
{
	this->comadobeaemscreensimplremoterequest_timeout = comadobeaemscreensimplremoterequest_timeout;
}


