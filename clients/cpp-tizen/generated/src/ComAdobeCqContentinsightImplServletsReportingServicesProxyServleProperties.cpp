#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties()
{
	//__init();
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::~ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties()
{
	//__cleanup();
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::__init()
{
	//reportingservicesproxywhitelist = new ConfigNodePropertyArray();
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::__cleanup()
{
	//if(reportingservicesproxywhitelist != NULL) {
	//
	//delete reportingservicesproxywhitelist;
	//reportingservicesproxywhitelist = NULL;
	//}
	//
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reportingservicesproxywhitelistKey = "reportingservices.proxy.whitelist";
	node = json_object_get_member(pJsonObject, reportingservicesproxywhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&reportingservicesproxywhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&reportingservicesproxywhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getReportingservicesproxywhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getReportingservicesproxywhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reportingservicesproxywhitelistKey = "reportingservices.proxy.whitelist";
	json_object_set_member(pJsonObject, reportingservicesproxywhitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::getReportingservicesproxywhitelist()
{
	return reportingservicesproxywhitelist;
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties::setReportingservicesproxywhitelist(ConfigNodePropertyArray  reportingservicesproxywhitelist)
{
	this->reportingservicesproxywhitelist = reportingservicesproxywhitelist;
}


