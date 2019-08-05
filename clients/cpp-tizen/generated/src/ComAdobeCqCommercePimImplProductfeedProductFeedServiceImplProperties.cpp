#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties()
{
	//__init();
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::~ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::__init()
{
	//feedgeneratoralgorithm = new ConfigNodePropertyDropDown();
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::__cleanup()
{
	//if(feedgeneratoralgorithm != NULL) {
	//
	//delete feedgeneratoralgorithm;
	//feedgeneratoralgorithm = NULL;
	//}
	//
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedgeneratoralgorithmKey = "Feed generator algorithm";
	node = json_object_get_member(pJsonObject, feedgeneratoralgorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&feedgeneratoralgorithm, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&feedgeneratoralgorithm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getFeedgeneratoralgorithm();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getFeedgeneratoralgorithm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *feedgeneratoralgorithmKey = "Feed generator algorithm";
	json_object_set_member(pJsonObject, feedgeneratoralgorithmKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::getFeedgeneratoralgorithm()
{
	return feedgeneratoralgorithm;
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties::setFeedgeneratoralgorithm(ConfigNodePropertyDropDown  feedgeneratoralgorithm)
{
	this->feedgeneratoralgorithm = feedgeneratoralgorithm;
}


