#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties()
{
	//__init();
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties()
{
	//__cleanup();
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::__init()
{
	//workflowpackageinfoproviderfilter = new ConfigNodePropertyArray();
	//workflowpackageinfoproviderfilterrootpath = new ConfigNodePropertyString();
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::__cleanup()
{
	//if(workflowpackageinfoproviderfilter != NULL) {
	//
	//delete workflowpackageinfoproviderfilter;
	//workflowpackageinfoproviderfilter = NULL;
	//}
	//if(workflowpackageinfoproviderfilterrootpath != NULL) {
	//
	//delete workflowpackageinfoproviderfilterrootpath;
	//workflowpackageinfoproviderfilterrootpath = NULL;
	//}
	//
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *workflowpackageinfoproviderfilterKey = "workflowpackageinfoprovider.filter";
	node = json_object_get_member(pJsonObject, workflowpackageinfoproviderfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&workflowpackageinfoproviderfilter, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&workflowpackageinfoproviderfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *workflowpackageinfoproviderfilterrootpathKey = "workflowpackageinfoprovider.filter.rootpath";
	node = json_object_get_member(pJsonObject, workflowpackageinfoproviderfilterrootpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&workflowpackageinfoproviderfilterrootpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&workflowpackageinfoproviderfilterrootpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getWorkflowpackageinfoproviderfilter();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getWorkflowpackageinfoproviderfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workflowpackageinfoproviderfilterKey = "workflowpackageinfoprovider.filter";
	json_object_set_member(pJsonObject, workflowpackageinfoproviderfilterKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWorkflowpackageinfoproviderfilterrootpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWorkflowpackageinfoproviderfilterrootpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workflowpackageinfoproviderfilterrootpathKey = "workflowpackageinfoprovider.filter.rootpath";
	json_object_set_member(pJsonObject, workflowpackageinfoproviderfilterrootpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::getWorkflowpackageinfoproviderfilter()
{
	return workflowpackageinfoproviderfilter;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::setWorkflowpackageinfoproviderfilter(ConfigNodePropertyArray  workflowpackageinfoproviderfilter)
{
	this->workflowpackageinfoproviderfilter = workflowpackageinfoproviderfilter;
}

ConfigNodePropertyString
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::getWorkflowpackageinfoproviderfilterrootpath()
{
	return workflowpackageinfoproviderfilterrootpath;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::setWorkflowpackageinfoproviderfilterrootpath(ConfigNodePropertyString  workflowpackageinfoproviderfilterrootpath)
{
	this->workflowpackageinfoproviderfilterrootpath = workflowpackageinfoproviderfilterrootpath;
}


