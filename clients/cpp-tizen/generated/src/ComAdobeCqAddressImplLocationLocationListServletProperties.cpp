#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqAddressImplLocationLocationListServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqAddressImplLocationLocationListServletProperties::ComAdobeCqAddressImplLocationLocationListServletProperties()
{
	//__init();
}

ComAdobeCqAddressImplLocationLocationListServletProperties::~ComAdobeCqAddressImplLocationLocationListServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqAddressImplLocationLocationListServletProperties::__init()
{
	//cqaddresslocationdefaultmaxResults = new ConfigNodePropertyInteger();
}

void
ComAdobeCqAddressImplLocationLocationListServletProperties::__cleanup()
{
	//if(cqaddresslocationdefaultmaxResults != NULL) {
	//
	//delete cqaddresslocationdefaultmaxResults;
	//cqaddresslocationdefaultmaxResults = NULL;
	//}
	//
}

void
ComAdobeCqAddressImplLocationLocationListServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqaddresslocationdefaultmaxResultsKey = "cq.address.location.default.maxResults";
	node = json_object_get_member(pJsonObject, cqaddresslocationdefaultmaxResultsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqaddresslocationdefaultmaxResults, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqaddresslocationdefaultmaxResults);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqAddressImplLocationLocationListServletProperties::ComAdobeCqAddressImplLocationLocationListServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqAddressImplLocationLocationListServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqaddresslocationdefaultmaxResults();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqaddresslocationdefaultmaxResults());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaddresslocationdefaultmaxResultsKey = "cq.address.location.default.maxResults";
	json_object_set_member(pJsonObject, cqaddresslocationdefaultmaxResultsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqAddressImplLocationLocationListServletProperties::getCqaddresslocationdefaultmaxResults()
{
	return cqaddresslocationdefaultmaxResults;
}

void
ComAdobeCqAddressImplLocationLocationListServletProperties::setCqaddresslocationdefaultmaxResults(ConfigNodePropertyInteger  cqaddresslocationdefaultmaxResults)
{
	this->cqaddresslocationdefaultmaxResults = cqaddresslocationdefaultmaxResults;
}


