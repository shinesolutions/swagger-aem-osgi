#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties()
{
	//__init();
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::~OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::__init()
{
	//parserfeatures = new ConfigNodePropertyArray();
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::__cleanup()
{
	//if(parserfeatures != NULL) {
	//
	//delete parserfeatures;
	//parserfeatures = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parserfeaturesKey = "parser.features";
	node = json_object_get_member(pJsonObject, parserfeaturesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&parserfeatures, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&parserfeatures);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getParserfeatures();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getParserfeatures());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parserfeaturesKey = "parser.features";
	json_object_set_member(pJsonObject, parserfeaturesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::getParserfeatures()
{
	return parserfeatures;
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::setParserfeatures(ConfigNodePropertyArray  parserfeatures)
{
	this->parserfeatures = parserfeatures;
}


