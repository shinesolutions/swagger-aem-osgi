#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::~ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::__init()
{
	//cqanalyticstestandtargetdeleteauthoractivitylistenerenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::__cleanup()
{
	//if(cqanalyticstestandtargetdeleteauthoractivitylistenerenabled != NULL) {
	//
	//delete cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
	//cqanalyticstestandtargetdeleteauthoractivitylistenerenabled = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey = "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqanalyticstestandtargetdeleteauthoractivitylistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqanalyticstestandtargetdeleteauthoractivitylistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey = "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetdeleteauthoractivitylistenerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled()
{
	return cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties::setCqanalyticstestandtargetdeleteauthoractivitylistenerenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetdeleteauthoractivitylistenerenabled)
{
	this->cqanalyticstestandtargetdeleteauthoractivitylistenerenabled = cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
}


