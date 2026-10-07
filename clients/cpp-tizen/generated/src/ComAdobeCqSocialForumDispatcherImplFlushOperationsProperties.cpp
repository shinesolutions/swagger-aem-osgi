#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties()
{
	//__init();
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::~ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::__init()
{
	//extensionorder = new ConfigNodePropertyInteger();
	//flushforumontopic = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::__cleanup()
{
	//if(extensionorder != NULL) {
	//
	//delete extensionorder;
	//extensionorder = NULL;
	//}
	//if(flushforumontopic != NULL) {
	//
	//delete flushforumontopic;
	//flushforumontopic = NULL;
	//}
	//
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *extensionorderKey = "extension.order";
	node = json_object_get_member(pJsonObject, extensionorderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&extensionorder, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&extensionorder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *flushforumontopicKey = "flush.forumontopic";
	node = json_object_get_member(pJsonObject, flushforumontopicKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&flushforumontopic, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&flushforumontopic);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getExtensionorder();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getExtensionorder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extensionorderKey = "extension.order";
	json_object_set_member(pJsonObject, extensionorderKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFlushforumontopic();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFlushforumontopic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *flushforumontopicKey = "flush.forumontopic";
	json_object_set_member(pJsonObject, flushforumontopicKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::getExtensionorder()
{
	return extensionorder;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::setExtensionorder(ConfigNodePropertyInteger  extensionorder)
{
	this->extensionorder = extensionorder;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::getFlushforumontopic()
{
	return flushforumontopic;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::setFlushforumontopic(ConfigNodePropertyBoolean  flushforumontopic)
{
	this->flushforumontopic = flushforumontopic;
}


