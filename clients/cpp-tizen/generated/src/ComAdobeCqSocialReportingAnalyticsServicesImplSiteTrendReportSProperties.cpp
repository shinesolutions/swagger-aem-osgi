#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties()
{
	//__init();
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::~ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::__init()
{
	//cqsocialconsoleanalyticssitesmapping = new ConfigNodePropertyArray();
	//priority = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::__cleanup()
{
	//if(cqsocialconsoleanalyticssitesmapping != NULL) {
	//
	//delete cqsocialconsoleanalyticssitesmapping;
	//cqsocialconsoleanalyticssitesmapping = NULL;
	//}
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqsocialconsoleanalyticssitesmappingKey = "cq.social.console.analytics.sites.mapping";
	node = json_object_get_member(pJsonObject, cqsocialconsoleanalyticssitesmappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqsocialconsoleanalyticssitesmapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqsocialconsoleanalyticssitesmapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priorityKey = "priority";
	node = json_object_get_member(pJsonObject, priorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&priority, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&priority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqsocialconsoleanalyticssitesmapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqsocialconsoleanalyticssitesmapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsocialconsoleanalyticssitesmappingKey = "cq.social.console.analytics.sites.mapping";
	json_object_set_member(pJsonObject, cqsocialconsoleanalyticssitesmappingKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPriority();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priorityKey = "priority";
	json_object_set_member(pJsonObject, priorityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::getCqsocialconsoleanalyticssitesmapping()
{
	return cqsocialconsoleanalyticssitesmapping;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::setCqsocialconsoleanalyticssitesmapping(ConfigNodePropertyArray  cqsocialconsoleanalyticssitesmapping)
{
	this->cqsocialconsoleanalyticssitesmapping = cqsocialconsoleanalyticssitesmapping;
}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


