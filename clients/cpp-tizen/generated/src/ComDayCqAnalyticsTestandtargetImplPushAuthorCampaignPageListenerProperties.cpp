#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::~ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::__init()
{
	//cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::__cleanup()
{
	//if(cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled != NULL) {
	//
	//delete cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
	//cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey = "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey = "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetpushauthorcampaignpagelistenerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled()
{
	return cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
}

void
ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties::setCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled)
{
	this->cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled = cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
}


