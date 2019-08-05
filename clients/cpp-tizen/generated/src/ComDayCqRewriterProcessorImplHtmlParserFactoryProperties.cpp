#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::ComDayCqRewriterProcessorImplHtmlParserFactoryProperties()
{
	//__init();
}

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::~ComDayCqRewriterProcessorImplHtmlParserFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::__init()
{
	//htmlparserprocessTags = new ConfigNodePropertyArray();
	//htmlparserpreserveCamelCase = new ConfigNodePropertyBoolean();
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::__cleanup()
{
	//if(htmlparserprocessTags != NULL) {
	//
	//delete htmlparserprocessTags;
	//htmlparserprocessTags = NULL;
	//}
	//if(htmlparserpreserveCamelCase != NULL) {
	//
	//delete htmlparserpreserveCamelCase;
	//htmlparserpreserveCamelCase = NULL;
	//}
	//
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *htmlparserprocessTagsKey = "htmlparser.processTags";
	node = json_object_get_member(pJsonObject, htmlparserprocessTagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmlparserprocessTags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmlparserprocessTags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmlparserpreserveCamelCaseKey = "htmlparser.preserveCamelCase";
	node = json_object_get_member(pJsonObject, htmlparserpreserveCamelCaseKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmlparserpreserveCamelCase, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmlparserpreserveCamelCase);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmlparserprocessTags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmlparserprocessTags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmlparserprocessTagsKey = "htmlparser.processTags";
	json_object_set_member(pJsonObject, htmlparserprocessTagsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmlparserpreserveCamelCase();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmlparserpreserveCamelCase());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmlparserpreserveCamelCaseKey = "htmlparser.preserveCamelCase";
	json_object_set_member(pJsonObject, htmlparserpreserveCamelCaseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::getHtmlparserprocessTags()
{
	return htmlparserprocessTags;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::setHtmlparserprocessTags(ConfigNodePropertyArray  htmlparserprocessTags)
{
	this->htmlparserprocessTags = htmlparserprocessTags;
}

ConfigNodePropertyBoolean
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::getHtmlparserpreserveCamelCase()
{
	return htmlparserpreserveCamelCase;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::setHtmlparserpreserveCamelCase(ConfigNodePropertyBoolean  htmlparserpreserveCamelCase)
{
	this->htmlparserpreserveCamelCase = htmlparserpreserveCamelCase;
}


