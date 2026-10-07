#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCsrfImplCSRFFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCsrfImplCSRFFilterProperties::ComAdobeGraniteCsrfImplCSRFFilterProperties()
{
	//__init();
}

ComAdobeGraniteCsrfImplCSRFFilterProperties::~ComAdobeGraniteCsrfImplCSRFFilterProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::__init()
{
	//filtermethods = new ConfigNodePropertyArray();
	//filterenablesafeuseragents = new ConfigNodePropertyBoolean();
	//filtersafeuseragents = new ConfigNodePropertyArray();
	//filterexcludedpaths = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::__cleanup()
{
	//if(filtermethods != NULL) {
	//
	//delete filtermethods;
	//filtermethods = NULL;
	//}
	//if(filterenablesafeuseragents != NULL) {
	//
	//delete filterenablesafeuseragents;
	//filterenablesafeuseragents = NULL;
	//}
	//if(filtersafeuseragents != NULL) {
	//
	//delete filtersafeuseragents;
	//filtersafeuseragents = NULL;
	//}
	//if(filterexcludedpaths != NULL) {
	//
	//delete filterexcludedpaths;
	//filterexcludedpaths = NULL;
	//}
	//
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *filterenablesafeuseragentsKey = "filter.enable.safe.user.agents";
	node = json_object_get_member(pJsonObject, filterenablesafeuseragentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&filterenablesafeuseragents, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&filterenablesafeuseragents);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filtersafeuseragentsKey = "filter.safe.user.agents";
	node = json_object_get_member(pJsonObject, filtersafeuseragentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&filtersafeuseragents, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&filtersafeuseragents);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filterexcludedpathsKey = "filter.excluded.paths";
	node = json_object_get_member(pJsonObject, filterexcludedpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&filterexcludedpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&filterexcludedpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCsrfImplCSRFFilterProperties::ComAdobeGraniteCsrfImplCSRFFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCsrfImplCSRFFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFilterenablesafeuseragents();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFilterenablesafeuseragents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filterenablesafeuseragentsKey = "filter.enable.safe.user.agents";
	json_object_set_member(pJsonObject, filterenablesafeuseragentsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFiltersafeuseragents();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFiltersafeuseragents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersafeuseragentsKey = "filter.safe.user.agents";
	json_object_set_member(pJsonObject, filtersafeuseragentsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFilterexcludedpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFilterexcludedpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filterexcludedpathsKey = "filter.excluded.paths";
	json_object_set_member(pJsonObject, filterexcludedpathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFiltermethods()
{
	return filtermethods;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFiltermethods(ConfigNodePropertyArray  filtermethods)
{
	this->filtermethods = filtermethods;
}

ConfigNodePropertyBoolean
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFilterenablesafeuseragents()
{
	return filterenablesafeuseragents;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFilterenablesafeuseragents(ConfigNodePropertyBoolean  filterenablesafeuseragents)
{
	this->filterenablesafeuseragents = filterenablesafeuseragents;
}

ConfigNodePropertyArray
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFiltersafeuseragents()
{
	return filtersafeuseragents;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFiltersafeuseragents(ConfigNodePropertyArray  filtersafeuseragents)
{
	this->filtersafeuseragents = filtersafeuseragents;
}

ConfigNodePropertyArray
ComAdobeGraniteCsrfImplCSRFFilterProperties::getFilterexcludedpaths()
{
	return filterexcludedpaths;
}

void
ComAdobeGraniteCsrfImplCSRFFilterProperties::setFilterexcludedpaths(ConfigNodePropertyArray  filterexcludedpaths)
{
	this->filterexcludedpaths = filterexcludedpaths;
}


