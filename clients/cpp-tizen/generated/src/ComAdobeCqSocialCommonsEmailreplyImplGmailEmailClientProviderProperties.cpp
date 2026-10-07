#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::__init()
{
	//priorityOrder = new ConfigNodePropertyInteger();
	//replyEmailPatterns = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::__cleanup()
{
	//if(priorityOrder != NULL) {
	//
	//delete priorityOrder;
	//priorityOrder = NULL;
	//}
	//if(replyEmailPatterns != NULL) {
	//
	//delete replyEmailPatterns;
	//replyEmailPatterns = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *priorityOrderKey = "priorityOrder";
	node = json_object_get_member(pJsonObject, priorityOrderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&priorityOrder, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&priorityOrder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *replyEmailPatternsKey = "replyEmailPatterns";
	node = json_object_get_member(pJsonObject, replyEmailPatternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&replyEmailPatterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&replyEmailPatterns);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPriorityOrder();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPriorityOrder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priorityOrderKey = "priorityOrder";
	json_object_set_member(pJsonObject, priorityOrderKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getReplyEmailPatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getReplyEmailPatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *replyEmailPatternsKey = "replyEmailPatterns";
	json_object_set_member(pJsonObject, replyEmailPatternsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger  priorityOrder)
{
	this->priorityOrder = priorityOrder;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray  replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}


