#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties()
{
	//__init();
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::~ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::__init()
{
	//allowedpaths = new ConfigNodePropertyArray();
	//cqanalyticssaintexporterpagesize = new ConfigNodePropertyInteger();
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::__cleanup()
{
	//if(allowedpaths != NULL) {
	//
	//delete allowedpaths;
	//allowedpaths = NULL;
	//}
	//if(cqanalyticssaintexporterpagesize != NULL) {
	//
	//delete cqanalyticssaintexporterpagesize;
	//cqanalyticssaintexporterpagesize = NULL;
	//}
	//
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *allowedpathsKey = "allowed.paths";
	node = json_object_get_member(pJsonObject, allowedpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowedpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowedpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqanalyticssaintexporterpagesizeKey = "cq.analytics.saint.exporter.pagesize";
	node = json_object_get_member(pJsonObject, cqanalyticssaintexporterpagesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqanalyticssaintexporterpagesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqanalyticssaintexporterpagesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowedpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowedpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowedpathsKey = "allowed.paths";
	json_object_set_member(pJsonObject, allowedpathsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqanalyticssaintexporterpagesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqanalyticssaintexporterpagesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticssaintexporterpagesizeKey = "cq.analytics.saint.exporter.pagesize";
	json_object_set_member(pJsonObject, cqanalyticssaintexporterpagesizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::getAllowedpaths()
{
	return allowedpaths;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::setAllowedpaths(ConfigNodePropertyArray  allowedpaths)
{
	this->allowedpaths = allowedpaths;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::getCqanalyticssaintexporterpagesize()
{
	return cqanalyticssaintexporterpagesize;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties::setCqanalyticssaintexporterpagesize(ConfigNodePropertyInteger  cqanalyticssaintexporterpagesize)
{
	this->cqanalyticssaintexporterpagesize = cqanalyticssaintexporterpagesize;
}


