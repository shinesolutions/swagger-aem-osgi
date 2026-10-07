#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties()
{
	//__init();
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::__init()
{
	//cqsocialreportinganalyticspollingimporterinterval = new ConfigNodePropertyInteger();
	//cqsocialreportinganalyticspollingimporterpageSize = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::__cleanup()
{
	//if(cqsocialreportinganalyticspollingimporterinterval != NULL) {
	//
	//delete cqsocialreportinganalyticspollingimporterinterval;
	//cqsocialreportinganalyticspollingimporterinterval = NULL;
	//}
	//if(cqsocialreportinganalyticspollingimporterpageSize != NULL) {
	//
	//delete cqsocialreportinganalyticspollingimporterpageSize;
	//cqsocialreportinganalyticspollingimporterpageSize = NULL;
	//}
	//
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqsocialreportinganalyticspollingimporterintervalKey = "cq.social.reporting.analytics.polling.importer.interval";
	node = json_object_get_member(pJsonObject, cqsocialreportinganalyticspollingimporterintervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqsocialreportinganalyticspollingimporterinterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqsocialreportinganalyticspollingimporterinterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqsocialreportinganalyticspollingimporterpageSizeKey = "cq.social.reporting.analytics.polling.importer.pageSize";
	node = json_object_get_member(pJsonObject, cqsocialreportinganalyticspollingimporterpageSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqsocialreportinganalyticspollingimporterpageSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqsocialreportinganalyticspollingimporterpageSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqsocialreportinganalyticspollingimporterinterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqsocialreportinganalyticspollingimporterinterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsocialreportinganalyticspollingimporterintervalKey = "cq.social.reporting.analytics.polling.importer.interval";
	json_object_set_member(pJsonObject, cqsocialreportinganalyticspollingimporterintervalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqsocialreportinganalyticspollingimporterpageSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqsocialreportinganalyticspollingimporterpageSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsocialreportinganalyticspollingimporterpageSizeKey = "cq.social.reporting.analytics.polling.importer.pageSize";
	json_object_set_member(pJsonObject, cqsocialreportinganalyticspollingimporterpageSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::getCqsocialreportinganalyticspollingimporterinterval()
{
	return cqsocialreportinganalyticspollingimporterinterval;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::setCqsocialreportinganalyticspollingimporterinterval(ConfigNodePropertyInteger  cqsocialreportinganalyticspollingimporterinterval)
{
	this->cqsocialreportinganalyticspollingimporterinterval = cqsocialreportinganalyticspollingimporterinterval;
}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::getCqsocialreportinganalyticspollingimporterpageSize()
{
	return cqsocialreportinganalyticspollingimporterpageSize;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties::setCqsocialreportinganalyticspollingimporterpageSize(ConfigNodePropertyInteger  cqsocialreportinganalyticspollingimporterpageSize)
{
	this->cqsocialreportinganalyticspollingimporterpageSize = cqsocialreportinganalyticspollingimporterpageSize;
}


