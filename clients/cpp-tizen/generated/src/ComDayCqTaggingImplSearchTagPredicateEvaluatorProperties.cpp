#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties()
{
	//__init();
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::~ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties()
{
	//__cleanup();
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::__init()
{
	//ignore_path = new ConfigNodePropertyBoolean();
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::__cleanup()
{
	//if(ignore_path != NULL) {
	//
	//delete ignore_path;
	//ignore_path = NULL;
	//}
	//
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ignore_pathKey = "ignore_path";
	node = json_object_get_member(pJsonObject, ignore_pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&ignore_path, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&ignore_path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIgnorePath();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIgnorePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignore_pathKey = "ignore_path";
	json_object_set_member(pJsonObject, ignore_pathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::getIgnorePath()
{
	return ignore_path;
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::setIgnorePath(ConfigNodePropertyBoolean  ignore_path)
{
	this->ignore_path = ignore_path;
}


