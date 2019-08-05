#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::~ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::__init()
{
	//cqanalyticstestandtargetsegmentimporterenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::__cleanup()
{
	//if(cqanalyticstestandtargetsegmentimporterenabled != NULL) {
	//
	//delete cqanalyticstestandtargetsegmentimporterenabled;
	//cqanalyticstestandtargetsegmentimporterenabled = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticstestandtargetsegmentimporterenabledKey = "cq.analytics.testandtarget.segmentimporter.enabled";
	node = json_object_get_member(pJsonObject, cqanalyticstestandtargetsegmentimporterenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqanalyticstestandtargetsegmentimporterenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqanalyticstestandtargetsegmentimporterenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqanalyticstestandtargetsegmentimporterenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqanalyticstestandtargetsegmentimporterenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticstestandtargetsegmentimporterenabledKey = "cq.analytics.testandtarget.segmentimporter.enabled";
	json_object_set_member(pJsonObject, cqanalyticstestandtargetsegmentimporterenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::getCqanalyticstestandtargetsegmentimporterenabled()
{
	return cqanalyticstestandtargetsegmentimporterenabled;
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::setCqanalyticstestandtargetsegmentimporterenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetsegmentimporterenabled)
{
	this->cqanalyticstestandtargetsegmentimporterenabled = cqanalyticstestandtargetsegmentimporterenabled;
}


