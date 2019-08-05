#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::__init()
{
	//numUserLimit = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::__cleanup()
{
	//if(numUserLimit != NULL) {
	//
	//delete numUserLimit;
	//numUserLimit = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *numUserLimitKey = "numUserLimit";
	node = json_object_get_member(pJsonObject, numUserLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&numUserLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&numUserLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getNumUserLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getNumUserLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *numUserLimitKey = "numUserLimit";
	json_object_set_member(pJsonObject, numUserLimitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::getNumUserLimit()
{
	return numUserLimit;
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::setNumUserLimit(ConfigNodePropertyInteger  numUserLimit)
{
	this->numUserLimit = numUserLimit;
}


