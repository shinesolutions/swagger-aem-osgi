#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommercePimImplPageEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommercePimImplPageEventListenerProperties::ComAdobeCqCommercePimImplPageEventListenerProperties()
{
	//__init();
}

ComAdobeCqCommercePimImplPageEventListenerProperties::~ComAdobeCqCommercePimImplPageEventListenerProperties()
{
	//__cleanup();
}

void
ComAdobeCqCommercePimImplPageEventListenerProperties::__init()
{
	//cqcommercepageeventlistenerenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqCommercePimImplPageEventListenerProperties::__cleanup()
{
	//if(cqcommercepageeventlistenerenabled != NULL) {
	//
	//delete cqcommercepageeventlistenerenabled;
	//cqcommercepageeventlistenerenabled = NULL;
	//}
	//
}

void
ComAdobeCqCommercePimImplPageEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqcommercepageeventlistenerenabledKey = "cq.commerce.pageeventlistener.enabled";
	node = json_object_get_member(pJsonObject, cqcommercepageeventlistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqcommercepageeventlistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqcommercepageeventlistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommercePimImplPageEventListenerProperties::ComAdobeCqCommercePimImplPageEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommercePimImplPageEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqcommercepageeventlistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqcommercepageeventlistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommercepageeventlistenerenabledKey = "cq.commerce.pageeventlistener.enabled";
	json_object_set_member(pJsonObject, cqcommercepageeventlistenerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqCommercePimImplPageEventListenerProperties::getCqcommercepageeventlistenerenabled()
{
	return cqcommercepageeventlistenerenabled;
}

void
ComAdobeCqCommercePimImplPageEventListenerProperties::setCqcommercepageeventlistenerenabled(ConfigNodePropertyBoolean  cqcommercepageeventlistenerenabled)
{
	this->cqcommercepageeventlistenerenabled = cqcommercepageeventlistenerenabled;
}


