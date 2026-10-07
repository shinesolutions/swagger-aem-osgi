#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties()
{
	//__init();
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::~OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//packageBuildertarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(packageBuildertarget != NULL) {
	//
	//delete packageBuildertarget;
	//packageBuildertarget = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *packageBuildertargetKey = "packageBuilder.target";
	node = json_object_get_member(pJsonObject, packageBuildertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&packageBuildertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&packageBuildertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPackageBuildertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPackageBuildertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageBuildertargetKey = "packageBuilder.target";
	json_object_set_member(pJsonObject, packageBuildertargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}


