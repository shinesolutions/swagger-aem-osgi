#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties()
{
	//__init();
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::~ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::__init()
{
	//cqdamwebdavversionlinkingenable = new ConfigNodePropertyBoolean();
	//cqdamwebdavversionlinkingschedulerperiod = new ConfigNodePropertyInteger();
	//cqdamwebdavversionlinkingstagingtimeout = new ConfigNodePropertyInteger();
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::__cleanup()
{
	//if(cqdamwebdavversionlinkingenable != NULL) {
	//
	//delete cqdamwebdavversionlinkingenable;
	//cqdamwebdavversionlinkingenable = NULL;
	//}
	//if(cqdamwebdavversionlinkingschedulerperiod != NULL) {
	//
	//delete cqdamwebdavversionlinkingschedulerperiod;
	//cqdamwebdavversionlinkingschedulerperiod = NULL;
	//}
	//if(cqdamwebdavversionlinkingstagingtimeout != NULL) {
	//
	//delete cqdamwebdavversionlinkingstagingtimeout;
	//cqdamwebdavversionlinkingstagingtimeout = NULL;
	//}
	//
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamwebdavversionlinkingenableKey = "cq.dam.webdav.version.linking.enable";
	node = json_object_get_member(pJsonObject, cqdamwebdavversionlinkingenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamwebdavversionlinkingenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamwebdavversionlinkingenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamwebdavversionlinkingschedulerperiodKey = "cq.dam.webdav.version.linking.scheduler.period";
	node = json_object_get_member(pJsonObject, cqdamwebdavversionlinkingschedulerperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamwebdavversionlinkingschedulerperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamwebdavversionlinkingschedulerperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamwebdavversionlinkingstagingtimeoutKey = "cq.dam.webdav.version.linking.staging.timeout";
	node = json_object_get_member(pJsonObject, cqdamwebdavversionlinkingstagingtimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamwebdavversionlinkingstagingtimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamwebdavversionlinkingstagingtimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamwebdavversionlinkingenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamwebdavversionlinkingenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamwebdavversionlinkingenableKey = "cq.dam.webdav.version.linking.enable";
	json_object_set_member(pJsonObject, cqdamwebdavversionlinkingenableKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamwebdavversionlinkingschedulerperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamwebdavversionlinkingschedulerperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamwebdavversionlinkingschedulerperiodKey = "cq.dam.webdav.version.linking.scheduler.period";
	json_object_set_member(pJsonObject, cqdamwebdavversionlinkingschedulerperiodKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamwebdavversionlinkingstagingtimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamwebdavversionlinkingstagingtimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamwebdavversionlinkingstagingtimeoutKey = "cq.dam.webdav.version.linking.staging.timeout";
	json_object_set_member(pJsonObject, cqdamwebdavversionlinkingstagingtimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::getCqdamwebdavversionlinkingenable()
{
	return cqdamwebdavversionlinkingenable;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::setCqdamwebdavversionlinkingenable(ConfigNodePropertyBoolean  cqdamwebdavversionlinkingenable)
{
	this->cqdamwebdavversionlinkingenable = cqdamwebdavversionlinkingenable;
}

ConfigNodePropertyInteger
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::getCqdamwebdavversionlinkingschedulerperiod()
{
	return cqdamwebdavversionlinkingschedulerperiod;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::setCqdamwebdavversionlinkingschedulerperiod(ConfigNodePropertyInteger  cqdamwebdavversionlinkingschedulerperiod)
{
	this->cqdamwebdavversionlinkingschedulerperiod = cqdamwebdavversionlinkingschedulerperiod;
}

ConfigNodePropertyInteger
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::getCqdamwebdavversionlinkingstagingtimeout()
{
	return cqdamwebdavversionlinkingstagingtimeout;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::setCqdamwebdavversionlinkingstagingtimeout(ConfigNodePropertyInteger  cqdamwebdavversionlinkingstagingtimeout)
{
	this->cqdamwebdavversionlinkingstagingtimeout = cqdamwebdavversionlinkingstagingtimeout;
}


