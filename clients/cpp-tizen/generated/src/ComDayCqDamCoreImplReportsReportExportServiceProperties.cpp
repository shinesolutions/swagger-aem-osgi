#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplReportsReportExportServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplReportsReportExportServiceProperties::ComDayCqDamCoreImplReportsReportExportServiceProperties()
{
	//__init();
}

ComDayCqDamCoreImplReportsReportExportServiceProperties::~ComDayCqDamCoreImplReportsReportExportServiceProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplReportsReportExportServiceProperties::__init()
{
	//queryBatchSize = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplReportsReportExportServiceProperties::__cleanup()
{
	//if(queryBatchSize != NULL) {
	//
	//delete queryBatchSize;
	//queryBatchSize = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplReportsReportExportServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *queryBatchSizeKey = "queryBatchSize";
	node = json_object_get_member(pJsonObject, queryBatchSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queryBatchSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queryBatchSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplReportsReportExportServiceProperties::ComDayCqDamCoreImplReportsReportExportServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplReportsReportExportServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueryBatchSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueryBatchSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queryBatchSizeKey = "queryBatchSize";
	json_object_set_member(pJsonObject, queryBatchSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplReportsReportExportServiceProperties::getQueryBatchSize()
{
	return queryBatchSize;
}

void
ComDayCqDamCoreImplReportsReportExportServiceProperties::setQueryBatchSize(ConfigNodePropertyInteger  queryBatchSize)
{
	this->queryBatchSize = queryBatchSize;
}


