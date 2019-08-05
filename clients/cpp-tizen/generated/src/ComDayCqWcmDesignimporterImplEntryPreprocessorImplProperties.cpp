#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties()
{
	//__init();
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::~ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::__init()
{
	//searchpattern = new ConfigNodePropertyString();
	//replacepattern = new ConfigNodePropertyString();
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::__cleanup()
{
	//if(searchpattern != NULL) {
	//
	//delete searchpattern;
	//searchpattern = NULL;
	//}
	//if(replacepattern != NULL) {
	//
	//delete replacepattern;
	//replacepattern = NULL;
	//}
	//
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *searchpatternKey = "search.pattern";
	node = json_object_get_member(pJsonObject, searchpatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&searchpattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&searchpattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *replacepatternKey = "replace.pattern";
	node = json_object_get_member(pJsonObject, replacepatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&replacepattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&replacepattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSearchpattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSearchpattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *searchpatternKey = "search.pattern";
	json_object_set_member(pJsonObject, searchpatternKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getReplacepattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getReplacepattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *replacepatternKey = "replace.pattern";
	json_object_set_member(pJsonObject, replacepatternKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::getSearchpattern()
{
	return searchpattern;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::setSearchpattern(ConfigNodePropertyString  searchpattern)
{
	this->searchpattern = searchpattern;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::getReplacepattern()
{
	return replacepattern;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::setReplacepattern(ConfigNodePropertyString  replacepattern)
{
	this->replacepattern = replacepattern;
}


