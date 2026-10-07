#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties()
{
	//__init();
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::~ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::__init()
{
	//comdaycqdamcoreimplioSpecialFilesHandlerfilepatters = new ConfigNodePropertyArray();
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::__cleanup()
{
	//if(comdaycqdamcoreimplioSpecialFilesHandlerfilepatters != NULL) {
	//
	//delete comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
	//comdaycqdamcoreimplioSpecialFilesHandlerfilepatters = NULL;
	//}
	//
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey = "com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters";
	node = json_object_get_member(pJsonObject, comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comdaycqdamcoreimplioSpecialFilesHandlerfilepatters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comdaycqdamcoreimplioSpecialFilesHandlerfilepatters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey = "com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters";
	json_object_set_member(pJsonObject, comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters()
{
	return comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::setComdaycqdamcoreimplioSpecialFilesHandlerfilepatters(ConfigNodePropertyArray  comdaycqdamcoreimplioSpecialFilesHandlerfilepatters)
{
	this->comdaycqdamcoreimplioSpecialFilesHandlerfilepatters = comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
}


