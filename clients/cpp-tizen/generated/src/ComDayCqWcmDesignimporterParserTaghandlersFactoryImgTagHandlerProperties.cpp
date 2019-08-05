#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties()
{
	//__init();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//tagpattern = new ConfigNodePropertyString();
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(tagpattern != NULL) {
	//
	//delete tagpattern;
	//tagpattern = NULL;
	//}
	//
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tagpatternKey = "tagpattern";
	node = json_object_get_member(pJsonObject, tagpatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tagpattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tagpattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTagpattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTagpattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tagpatternKey = "tagpattern";
	json_object_set_member(pJsonObject, tagpatternKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties::setTagpattern(ConfigNodePropertyString  tagpattern)
{
	this->tagpattern = tagpattern;
}


