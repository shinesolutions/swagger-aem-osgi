#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingSecurityImplReferrerFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingSecurityImplReferrerFilterProperties::OrgApacheSlingSecurityImplReferrerFilterProperties()
{
	//__init();
}

OrgApacheSlingSecurityImplReferrerFilterProperties::~OrgApacheSlingSecurityImplReferrerFilterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::__init()
{
	//allowempty = new ConfigNodePropertyBoolean();
	//allowhosts = new ConfigNodePropertyArray();
	//allowhostsregexp = new ConfigNodePropertyArray();
	//filtermethods = new ConfigNodePropertyArray();
	//excludeagentsregexp = new ConfigNodePropertyArray();
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::__cleanup()
{
	//if(allowempty != NULL) {
	//
	//delete allowempty;
	//allowempty = NULL;
	//}
	//if(allowhosts != NULL) {
	//
	//delete allowhosts;
	//allowhosts = NULL;
	//}
	//if(allowhostsregexp != NULL) {
	//
	//delete allowhostsregexp;
	//allowhostsregexp = NULL;
	//}
	//if(filtermethods != NULL) {
	//
	//delete filtermethods;
	//filtermethods = NULL;
	//}
	//if(excludeagentsregexp != NULL) {
	//
	//delete excludeagentsregexp;
	//excludeagentsregexp = NULL;
	//}
	//
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *allowemptyKey = "allow.empty";
	node = json_object_get_member(pJsonObject, allowemptyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&allowempty, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&allowempty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowhostsKey = "allow.hosts";
	node = json_object_get_member(pJsonObject, allowhostsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowhosts, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowhosts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowhostsregexpKey = "allow.hosts.regexp";
	node = json_object_get_member(pJsonObject, allowhostsregexpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowhostsregexp, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowhostsregexp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filtermethodsKey = "filter.methods";
	node = json_object_get_member(pJsonObject, filtermethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&filtermethods, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&filtermethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *excludeagentsregexpKey = "exclude.agents.regexp";
	node = json_object_get_member(pJsonObject, excludeagentsregexpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excludeagentsregexp, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excludeagentsregexp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingSecurityImplReferrerFilterProperties::OrgApacheSlingSecurityImplReferrerFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingSecurityImplReferrerFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAllowempty();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAllowempty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowemptyKey = "allow.empty";
	json_object_set_member(pJsonObject, allowemptyKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowhosts();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowhosts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowhostsKey = "allow.hosts";
	json_object_set_member(pJsonObject, allowhostsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowhostsregexp();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowhostsregexp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowhostsregexpKey = "allow.hosts.regexp";
	json_object_set_member(pJsonObject, allowhostsregexpKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFiltermethods();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFiltermethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtermethodsKey = "filter.methods";
	json_object_set_member(pJsonObject, filtermethodsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcludeagentsregexp();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcludeagentsregexp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excludeagentsregexpKey = "exclude.agents.regexp";
	json_object_set_member(pJsonObject, excludeagentsregexpKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingSecurityImplReferrerFilterProperties::getAllowempty()
{
	return allowempty;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setAllowempty(ConfigNodePropertyBoolean  allowempty)
{
	this->allowempty = allowempty;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getAllowhosts()
{
	return allowhosts;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setAllowhosts(ConfigNodePropertyArray  allowhosts)
{
	this->allowhosts = allowhosts;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getAllowhostsregexp()
{
	return allowhostsregexp;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setAllowhostsregexp(ConfigNodePropertyArray  allowhostsregexp)
{
	this->allowhostsregexp = allowhostsregexp;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getFiltermethods()
{
	return filtermethods;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setFiltermethods(ConfigNodePropertyArray  filtermethods)
{
	this->filtermethods = filtermethods;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplReferrerFilterProperties::getExcludeagentsregexp()
{
	return excludeagentsregexp;
}

void
OrgApacheSlingSecurityImplReferrerFilterProperties::setExcludeagentsregexp(ConfigNodePropertyArray  excludeagentsregexp)
{
	this->excludeagentsregexp = excludeagentsregexp;
}


