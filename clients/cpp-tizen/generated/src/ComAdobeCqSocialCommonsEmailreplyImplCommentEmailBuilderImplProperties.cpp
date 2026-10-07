#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::__init()
{
	//contextpath = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::__cleanup()
{
	//if(contextpath != NULL) {
	//
	//delete contextpath;
	//contextpath = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contextpathKey = "context.path";
	node = json_object_get_member(pJsonObject, contextpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&contextpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&contextpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getContextpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getContextpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contextpathKey = "context.path";
	json_object_set_member(pJsonObject, contextpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::getContextpath()
{
	return contextpath;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::setContextpath(ConfigNodePropertyString  contextpath)
{
	this->contextpath = contextpath;
}


