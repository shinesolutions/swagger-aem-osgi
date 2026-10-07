#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::__init()
{
	//cqanalyticstestandtargetaccountoptionsupdaterenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::__cleanup()
{
	//if(cqanalyticstestandtargetaccountoptionsupdaterenabled != NULL) {
	//
	//delete cqanalyticstestandtargetaccountoptionsupdaterenabled;
	//cqanalyticstestandtargetaccountoptionsupdaterenabled = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticstestandtargetaccountoptionsupdaterenabledKey = "cq.analytics.testandtarget.accountoptionsupdater.enabled";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetaccountoptionsupdaterenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqanalyticstestandtargetaccountoptionsupdaterenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqanalyticstestandtargetaccountoptionsupdaterenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqanalyticstestandtargetaccountoptionsupdaterenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqanalyticstestandtargetaccountoptionsupdaterenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetaccountoptionsupdaterenabledKey = "cq.analytics.testandtarget.accountoptionsupdater.enabled";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetaccountoptionsupdaterenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::getCqanalyticstestandtargetaccountoptionsupdaterenabled()
{
	return cqanalyticstestandtargetaccountoptionsupdaterenabled;
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::setCqanalyticstestandtargetaccountoptionsupdaterenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetaccountoptionsupdaterenabled)
{
	this->cqanalyticstestandtargetaccountoptionsupdaterenabled = cqanalyticstestandtargetaccountoptionsupdaterenabled;
}


