#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::~ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::__init()
{
	//ranking = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::__cleanup()
{
	//if(ranking != NULL) {
	//
	//delete ranking;
	//ranking = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rankingKey = "ranking";
	node = json_object_get_member(pJsonObject, rankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&ranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&ranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRanking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRanking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rankingKey = "ranking";
	json_object_set_member(pJsonObject, rankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::getRanking()
{
	return ranking;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::setRanking(ConfigNodePropertyInteger  ranking)
{
	this->ranking = ranking;
}


