#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties()
{
	//__init();
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::~ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::__init()
{
	//fieldWhitelist = new ConfigNodePropertyArray();
	//sitePathFilters = new ConfigNodePropertyArray();
	//sitePackageGroup = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::__cleanup()
{
	//if(fieldWhitelist != NULL) {
	//
	//delete fieldWhitelist;
	//fieldWhitelist = NULL;
	//}
	//if(sitePathFilters != NULL) {
	//
	//delete sitePathFilters;
	//sitePathFilters = NULL;
	//}
	//if(sitePackageGroup != NULL) {
	//
	//delete sitePackageGroup;
	//sitePackageGroup = NULL;
	//}
	//
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	node = json_object_get_member(pJsonObject, fieldWhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fieldWhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fieldWhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sitePathFiltersKey = "sitePathFilters";
	node = json_object_get_member(pJsonObject, sitePathFiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&sitePathFilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&sitePathFilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sitePackageGroupKey = "sitePackageGroup";
	node = json_object_get_member(pJsonObject, sitePackageGroupKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sitePackageGroup, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sitePackageGroup);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFieldWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFieldWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	json_object_set_member(pJsonObject, fieldWhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSitePathFilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSitePathFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sitePathFiltersKey = "sitePathFilters";
	json_object_set_member(pJsonObject, sitePathFiltersKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSitePackageGroup();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSitePackageGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sitePackageGroupKey = "sitePackageGroup";
	json_object_set_member(pJsonObject, sitePackageGroupKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::getSitePathFilters()
{
	return sitePathFilters;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::setSitePathFilters(ConfigNodePropertyArray  sitePathFilters)
{
	this->sitePathFilters = sitePathFilters;
}

ConfigNodePropertyString
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::getSitePackageGroup()
{
	return sitePackageGroup;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::setSitePackageGroup(ConfigNodePropertyString  sitePackageGroup)
{
	this->sitePackageGroup = sitePackageGroup;
}


