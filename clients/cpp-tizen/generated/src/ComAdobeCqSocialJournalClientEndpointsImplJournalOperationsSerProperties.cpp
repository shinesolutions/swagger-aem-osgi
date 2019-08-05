#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties()
{
	//__init();
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::~ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::__init()
{
	//fieldWhitelist = new ConfigNodePropertyArray();
	//attachmentTypeBlacklist = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::__cleanup()
{
	//if(fieldWhitelist != NULL) {
	//
	//delete fieldWhitelist;
	//fieldWhitelist = NULL;
	//}
	//if(attachmentTypeBlacklist != NULL) {
	//
	//delete attachmentTypeBlacklist;
	//attachmentTypeBlacklist = NULL;
	//}
	//
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	node = json_object_get_member(pJsonObject, fieldWhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fieldWhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fieldWhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";
	node = json_object_get_member(pJsonObject, attachmentTypeBlacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&attachmentTypeBlacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&attachmentTypeBlacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFieldWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFieldWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	json_object_set_member(pJsonObject, fieldWhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAttachmentTypeBlacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAttachmentTypeBlacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";
	json_object_set_member(pJsonObject, attachmentTypeBlacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray  attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}


