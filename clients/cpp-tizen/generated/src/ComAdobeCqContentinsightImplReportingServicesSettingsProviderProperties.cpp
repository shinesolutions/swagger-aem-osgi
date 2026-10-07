#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties()
{
	//__init();
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::~ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties()
{
	//__cleanup();
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::__init()
{
	//reportingservicesurl = new ConfigNodePropertyString();
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::__cleanup()
{
	//if(reportingservicesurl != NULL) {
	//
	//delete reportingservicesurl;
	//reportingservicesurl = NULL;
	//}
	//
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reportingservicesurlKey = "reportingservices.url";
	node = json_object_get_member(pJsonObject, reportingservicesurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&reportingservicesurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&reportingservicesurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getReportingservicesurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getReportingservicesurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reportingservicesurlKey = "reportingservices.url";
	json_object_set_member(pJsonObject, reportingservicesurlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::getReportingservicesurl()
{
	return reportingservicesurl;
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties::setReportingservicesurl(ConfigNodePropertyString  reportingservicesurl)
{
	this->reportingservicesurl = reportingservicesurl;
}


