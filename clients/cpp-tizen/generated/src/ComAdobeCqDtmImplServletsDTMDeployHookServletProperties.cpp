#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::ComAdobeCqDtmImplServletsDTMDeployHookServletProperties()
{
	//__init();
}

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::~ComAdobeCqDtmImplServletsDTMDeployHookServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::__init()
{
	//dtmstagingipwhitelist = new ConfigNodePropertyArray();
	//dtmproductionipwhitelist = new ConfigNodePropertyArray();
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::__cleanup()
{
	//if(dtmstagingipwhitelist != NULL) {
	//
	//delete dtmstagingipwhitelist;
	//dtmstagingipwhitelist = NULL;
	//}
	//if(dtmproductionipwhitelist != NULL) {
	//
	//delete dtmproductionipwhitelist;
	//dtmproductionipwhitelist = NULL;
	//}
	//
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dtmstagingipwhitelistKey = "dtm.staging.ip.whitelist";
	node = json_object_get_member(pJsonObject, dtmstagingipwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&dtmstagingipwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&dtmstagingipwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dtmproductionipwhitelistKey = "dtm.production.ip.whitelist";
	node = json_object_get_member(pJsonObject, dtmproductionipwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&dtmproductionipwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&dtmproductionipwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDtmstagingipwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDtmstagingipwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dtmstagingipwhitelistKey = "dtm.staging.ip.whitelist";
	json_object_set_member(pJsonObject, dtmstagingipwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDtmproductionipwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDtmproductionipwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dtmproductionipwhitelistKey = "dtm.production.ip.whitelist";
	json_object_set_member(pJsonObject, dtmproductionipwhitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::getDtmstagingipwhitelist()
{
	return dtmstagingipwhitelist;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::setDtmstagingipwhitelist(ConfigNodePropertyArray  dtmstagingipwhitelist)
{
	this->dtmstagingipwhitelist = dtmstagingipwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::getDtmproductionipwhitelist()
{
	return dtmproductionipwhitelist;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::setDtmproductionipwhitelist(ConfigNodePropertyArray  dtmproductionipwhitelist)
{
	this->dtmproductionipwhitelist = dtmproductionipwhitelist;
}


