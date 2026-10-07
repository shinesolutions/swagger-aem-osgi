#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::~ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::__init()
{
	//pageinfoproviderpropertyregexdefault = new ConfigNodePropertyString();
	//pageinfoproviderpropertyname = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::__cleanup()
{
	//if(pageinfoproviderpropertyregexdefault != NULL) {
	//
	//delete pageinfoproviderpropertyregexdefault;
	//pageinfoproviderpropertyregexdefault = NULL;
	//}
	//if(pageinfoproviderpropertyname != NULL) {
	//
	//delete pageinfoproviderpropertyname;
	//pageinfoproviderpropertyname = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pageinfoproviderpropertyregexdefaultKey = "page.info.provider.property.regex.default";
	node = json_object_get_member(pJsonObject, pageinfoproviderpropertyregexdefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pageinfoproviderpropertyregexdefault, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pageinfoproviderpropertyregexdefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pageinfoproviderpropertynameKey = "page.info.provider.property.name";
	node = json_object_get_member(pJsonObject, pageinfoproviderpropertynameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pageinfoproviderpropertyname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pageinfoproviderpropertyname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPageinfoproviderpropertyregexdefault();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPageinfoproviderpropertyregexdefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pageinfoproviderpropertyregexdefaultKey = "page.info.provider.property.regex.default";
	json_object_set_member(pJsonObject, pageinfoproviderpropertyregexdefaultKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPageinfoproviderpropertyname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPageinfoproviderpropertyname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pageinfoproviderpropertynameKey = "page.info.provider.property.name";
	json_object_set_member(pJsonObject, pageinfoproviderpropertynameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::getPageinfoproviderpropertyregexdefault()
{
	return pageinfoproviderpropertyregexdefault;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::setPageinfoproviderpropertyregexdefault(ConfigNodePropertyString  pageinfoproviderpropertyregexdefault)
{
	this->pageinfoproviderpropertyregexdefault = pageinfoproviderpropertyregexdefault;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::getPageinfoproviderpropertyname()
{
	return pageinfoproviderpropertyname;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::setPageinfoproviderpropertyname(ConfigNodePropertyString  pageinfoproviderpropertyname)
{
	this->pageinfoproviderpropertyname = pageinfoproviderpropertyname;
}


