#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties()
{
	//__init();
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::~ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::__init()
{
	//reportfetchattempts = new ConfigNodePropertyInteger();
	//reportfetchdelay = new ConfigNodePropertyInteger();
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::__cleanup()
{
	//if(reportfetchattempts != NULL) {
	//
	//delete reportfetchattempts;
	//reportfetchattempts = NULL;
	//}
	//if(reportfetchdelay != NULL) {
	//
	//delete reportfetchdelay;
	//reportfetchdelay = NULL;
	//}
	//
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reportfetchattemptsKey = "report.fetch.attempts";
	node = json_object_get_member(pJsonObject, reportfetchattemptsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&reportfetchattempts, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&reportfetchattempts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *reportfetchdelayKey = "report.fetch.delay";
	node = json_object_get_member(pJsonObject, reportfetchdelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&reportfetchdelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&reportfetchdelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReportfetchattempts();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReportfetchattempts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reportfetchattemptsKey = "report.fetch.attempts";
	json_object_set_member(pJsonObject, reportfetchattemptsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReportfetchdelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReportfetchdelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reportfetchdelayKey = "report.fetch.delay";
	json_object_set_member(pJsonObject, reportfetchdelayKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::getReportfetchattempts()
{
	return reportfetchattempts;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::setReportfetchattempts(ConfigNodePropertyInteger  reportfetchattempts)
{
	this->reportfetchattempts = reportfetchattempts;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::getReportfetchdelay()
{
	return reportfetchdelay;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties::setReportfetchdelay(ConfigNodePropertyInteger  reportfetchdelay)
{
	this->reportfetchdelay = reportfetchdelay;
}


