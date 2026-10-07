#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties()
{
	//__init();
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::~ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
	//jmxobjectname = new ConfigNodePropertyString();
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(jmxobjectname != NULL) {
	//
	//delete jmxobjectname;
	//jmxobjectname = NULL;
	//}
	//
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jmxobjectnameKey = "jmx.objectname";
	node = json_object_get_member(pJsonObject, jmxobjectnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jmxobjectname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jmxobjectname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJmxobjectname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJmxobjectname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jmxobjectnameKey = "jmx.objectname";
	json_object_set_member(pJsonObject, jmxobjectnameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyString
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::setJmxobjectname(ConfigNodePropertyString  jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}


