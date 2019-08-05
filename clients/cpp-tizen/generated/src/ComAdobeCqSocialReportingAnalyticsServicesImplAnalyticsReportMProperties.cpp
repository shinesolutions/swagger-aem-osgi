#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties()
{
	//__init();
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::__init()
{
	//reportfetchdelay = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::__cleanup()
{
	//if(reportfetchdelay != NULL) {
	//
	//delete reportfetchdelay;
	//reportfetchdelay = NULL;
	//}
	//
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reportfetchdelayKey = "report.fetch.delay";
	node = json_object_get_member(pJsonObject, reportfetchdelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&reportfetchdelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&reportfetchdelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReportfetchdelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReportfetchdelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reportfetchdelayKey = "report.fetch.delay";
	json_object_set_member(pJsonObject, reportfetchdelayKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::getReportfetchdelay()
{
	return reportfetchdelay;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties::setReportfetchdelay(ConfigNodePropertyInteger  reportfetchdelay)
{
	this->reportfetchdelay = reportfetchdelay;
}


