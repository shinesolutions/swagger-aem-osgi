#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
{
	//__init();
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::~OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::__init()
{
	//datasources = new ConfigNodePropertyArray();
	//step = new ConfigNodePropertyInteger();
	//archives = new ConfigNodePropertyArray();
	//path = new ConfigNodePropertyString();
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::__cleanup()
{
	//if(datasources != NULL) {
	//
	//delete datasources;
	//datasources = NULL;
	//}
	//if(step != NULL) {
	//
	//delete step;
	//step = NULL;
	//}
	//if(archives != NULL) {
	//
	//delete archives;
	//archives = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *datasourcesKey = "datasources";
	node = json_object_get_member(pJsonObject, datasourcesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&datasources, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&datasources);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stepKey = "step";
	node = json_object_get_member(pJsonObject, stepKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&step, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&step);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *archivesKey = "archives";
	node = json_object_get_member(pJsonObject, archivesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&archives, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&archives);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDatasources();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDatasources());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datasourcesKey = "datasources";
	json_object_set_member(pJsonObject, datasourcesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getStep();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getStep());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stepKey = "step";
	json_object_set_member(pJsonObject, stepKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getArchives();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getArchives());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *archivesKey = "archives";
	json_object_set_member(pJsonObject, archivesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getDatasources()
{
	return datasources;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setDatasources(ConfigNodePropertyArray  datasources)
{
	this->datasources = datasources;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getStep()
{
	return step;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setStep(ConfigNodePropertyInteger  step)
{
	this->step = step;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getArchives()
{
	return archives;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setArchives(ConfigNodePropertyArray  archives)
{
	this->archives = archives;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getPath()
{
	return path;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}


