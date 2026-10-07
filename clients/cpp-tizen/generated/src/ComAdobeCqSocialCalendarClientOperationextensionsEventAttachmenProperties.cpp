#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties()
{
	//__init();
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::~ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::__init()
{
	//attachmentTypeBlacklist = new ConfigNodePropertyString();
	//extensionorder = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::__cleanup()
{
	//if(attachmentTypeBlacklist != NULL) {
	//
	//delete attachmentTypeBlacklist;
	//attachmentTypeBlacklist = NULL;
	//}
	//if(extensionorder != NULL) {
	//
	//delete extensionorder;
	//extensionorder = NULL;
	//}
	//
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";
	node = json_object_get_member(pJsonObject, attachmentTypeBlacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&attachmentTypeBlacklist, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&attachmentTypeBlacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAttachmentTypeBlacklist();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAttachmentTypeBlacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";
	json_object_set_member(pJsonObject, attachmentTypeBlacklistKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::setAttachmentTypeBlacklist(ConfigNodePropertyString  attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::getExtensionorder()
{
	return extensionorder;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::setExtensionorder(ConfigNodePropertyInteger  extensionorder)
{
	this->extensionorder = extensionorder;
}


