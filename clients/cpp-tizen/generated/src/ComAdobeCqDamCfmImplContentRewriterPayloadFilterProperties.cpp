#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties()
{
	//__init();
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::~ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::__init()
{
	//pipelinetype = new ConfigNodePropertyString();
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::__cleanup()
{
	//if(pipelinetype != NULL) {
	//
	//delete pipelinetype;
	//pipelinetype = NULL;
	//}
	//
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pipelinetypeKey = "pipeline.type";
	node = json_object_get_member(pJsonObject, pipelinetypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pipelinetype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pipelinetype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPipelinetype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPipelinetype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pipelinetypeKey = "pipeline.type";
	json_object_set_member(pJsonObject, pipelinetypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::getPipelinetype()
{
	return pipelinetype;
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::setPipelinetype(ConfigNodePropertyString  pipelinetype)
{
	this->pipelinetype = pipelinetype;
}


