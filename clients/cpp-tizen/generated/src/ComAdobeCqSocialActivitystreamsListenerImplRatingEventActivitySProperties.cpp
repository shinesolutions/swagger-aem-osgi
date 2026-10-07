#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties()
{
	//__init();
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::~ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::__init()
{
	//ranking = new ConfigNodePropertyInteger();
	//enable = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::__cleanup()
{
	//if(ranking != NULL) {
	//
	//delete ranking;
	//ranking = NULL;
	//}
	//if(enable != NULL) {
	//
	//delete enable;
	//enable = NULL;
	//}
	//
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::fromJson(char* jsonStr)
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
	const gchar *enableKey = "enable";
	node = json_object_get_member(pJsonObject, enableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableKey = "enable";
	json_object_set_member(pJsonObject, enableKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::getRanking()
{
	return ranking;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::setRanking(ConfigNodePropertyInteger  ranking)
{
	this->ranking = ranking;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::setEnable(ConfigNodePropertyBoolean  enable)
{
	this->enable = enable;
}


