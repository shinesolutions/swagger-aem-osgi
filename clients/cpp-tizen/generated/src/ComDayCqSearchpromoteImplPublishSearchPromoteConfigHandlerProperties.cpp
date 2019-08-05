#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties()
{
	//__init();
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::~ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::__init()
{
	//cqsearchpromoteconfighandlerenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::__cleanup()
{
	//if(cqsearchpromoteconfighandlerenabled != NULL) {
	//
	//delete cqsearchpromoteconfighandlerenabled;
	//cqsearchpromoteconfighandlerenabled = NULL;
	//}
	//
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqsearchpromoteconfighandlerenabledKey = "cq.searchpromote.confighandler.enabled";
	node = json_object_get_member(pJsonObject, cqsearchpromoteconfighandlerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqsearchpromoteconfighandlerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqsearchpromoteconfighandlerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqsearchpromoteconfighandlerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqsearchpromoteconfighandlerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsearchpromoteconfighandlerenabledKey = "cq.searchpromote.confighandler.enabled";
	json_object_set_member(pJsonObject, cqsearchpromoteconfighandlerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::getCqsearchpromoteconfighandlerenabled()
{
	return cqsearchpromoteconfighandlerenabled;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::setCqsearchpromoteconfighandlerenabled(ConfigNodePropertyBoolean  cqsearchpromoteconfighandlerenabled)
{
	this->cqsearchpromoteconfighandlerenabled = cqsearchpromoteconfighandlerenabled;
}


