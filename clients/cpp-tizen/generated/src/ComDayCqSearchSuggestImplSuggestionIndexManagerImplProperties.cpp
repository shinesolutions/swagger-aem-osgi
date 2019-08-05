#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties()
{
	//__init();
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::~ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::__init()
{
	//pathBuildertarget = new ConfigNodePropertyString();
	//suggestbasepath = new ConfigNodePropertyString();
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::__cleanup()
{
	//if(pathBuildertarget != NULL) {
	//
	//delete pathBuildertarget;
	//pathBuildertarget = NULL;
	//}
	//if(suggestbasepath != NULL) {
	//
	//delete suggestbasepath;
	//suggestbasepath = NULL;
	//}
	//
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathBuildertargetKey = "pathBuilder.target";
	node = json_object_get_member(pJsonObject, pathBuildertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathBuildertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathBuildertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *suggestbasepathKey = "suggest.basepath";
	node = json_object_get_member(pJsonObject, suggestbasepathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&suggestbasepath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&suggestbasepath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathBuildertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathBuildertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathBuildertargetKey = "pathBuilder.target";
	json_object_set_member(pJsonObject, pathBuildertargetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSuggestbasepath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSuggestbasepath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *suggestbasepathKey = "suggest.basepath";
	json_object_set_member(pJsonObject, suggestbasepathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::getPathBuildertarget()
{
	return pathBuildertarget;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::setPathBuildertarget(ConfigNodePropertyString  pathBuildertarget)
{
	this->pathBuildertarget = pathBuildertarget;
}

ConfigNodePropertyString
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::getSuggestbasepath()
{
	return suggestbasepath;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::setSuggestbasepath(ConfigNodePropertyString  suggestbasepath)
{
	this->suggestbasepath = suggestbasepath;
}


