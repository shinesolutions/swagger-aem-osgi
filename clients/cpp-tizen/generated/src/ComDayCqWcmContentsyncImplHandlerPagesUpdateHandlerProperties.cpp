#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties()
{
	//__init();
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::__init()
{
	//cqpagesupdatehandlerimageresourcetypes = new ConfigNodePropertyArray();
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::__cleanup()
{
	//if(cqpagesupdatehandlerimageresourcetypes != NULL) {
	//
	//delete cqpagesupdatehandlerimageresourcetypes;
	//cqpagesupdatehandlerimageresourcetypes = NULL;
	//}
	//
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqpagesupdatehandlerimageresourcetypesKey = "cq.pagesupdatehandler.imageresourcetypes";
	node = json_object_get_member(pJsonObject, cqpagesupdatehandlerimageresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqpagesupdatehandlerimageresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqpagesupdatehandlerimageresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqpagesupdatehandlerimageresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqpagesupdatehandlerimageresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqpagesupdatehandlerimageresourcetypesKey = "cq.pagesupdatehandler.imageresourcetypes";
	json_object_set_member(pJsonObject, cqpagesupdatehandlerimageresourcetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::getCqpagesupdatehandlerimageresourcetypes()
{
	return cqpagesupdatehandlerimageresourcetypes;
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerimageresourcetypes)
{
	this->cqpagesupdatehandlerimageresourcetypes = cqpagesupdatehandlerimageresourcetypes;
}


