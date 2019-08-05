#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqAccountImplAccountManagementServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqAccountImplAccountManagementServletProperties::ComAdobeCqAccountImplAccountManagementServletProperties()
{
	//__init();
}

ComAdobeCqAccountImplAccountManagementServletProperties::~ComAdobeCqAccountImplAccountManagementServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::__init()
{
	//cqaccountmanagerconfiginformnewaccountmail = new ConfigNodePropertyString();
	//cqaccountmanagerconfiginformnewpwdmail = new ConfigNodePropertyString();
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::__cleanup()
{
	//if(cqaccountmanagerconfiginformnewaccountmail != NULL) {
	//
	//delete cqaccountmanagerconfiginformnewaccountmail;
	//cqaccountmanagerconfiginformnewaccountmail = NULL;
	//}
	//if(cqaccountmanagerconfiginformnewpwdmail != NULL) {
	//
	//delete cqaccountmanagerconfiginformnewpwdmail;
	//cqaccountmanagerconfiginformnewpwdmail = NULL;
	//}
	//
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqaccountmanagerconfiginformnewaccountmailKey = "cq.accountmanager.config.informnewaccount.mail";
	node = json_object_get_member(pJsonObject, cqaccountmanagerconfiginformnewaccountmailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqaccountmanagerconfiginformnewaccountmail, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqaccountmanagerconfiginformnewaccountmail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqaccountmanagerconfiginformnewpwdmailKey = "cq.accountmanager.config.informnewpwd.mail";
	node = json_object_get_member(pJsonObject, cqaccountmanagerconfiginformnewpwdmailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqaccountmanagerconfiginformnewpwdmail, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqaccountmanagerconfiginformnewpwdmail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqAccountImplAccountManagementServletProperties::ComAdobeCqAccountImplAccountManagementServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqAccountImplAccountManagementServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqaccountmanagerconfiginformnewaccountmail();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqaccountmanagerconfiginformnewaccountmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaccountmanagerconfiginformnewaccountmailKey = "cq.accountmanager.config.informnewaccount.mail";
	json_object_set_member(pJsonObject, cqaccountmanagerconfiginformnewaccountmailKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqaccountmanagerconfiginformnewpwdmail();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqaccountmanagerconfiginformnewpwdmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaccountmanagerconfiginformnewpwdmailKey = "cq.accountmanager.config.informnewpwd.mail";
	json_object_set_member(pJsonObject, cqaccountmanagerconfiginformnewpwdmailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqAccountImplAccountManagementServletProperties::getCqaccountmanagerconfiginformnewaccountmail()
{
	return cqaccountmanagerconfiginformnewaccountmail;
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::setCqaccountmanagerconfiginformnewaccountmail(ConfigNodePropertyString  cqaccountmanagerconfiginformnewaccountmail)
{
	this->cqaccountmanagerconfiginformnewaccountmail = cqaccountmanagerconfiginformnewaccountmail;
}

ConfigNodePropertyString
ComAdobeCqAccountImplAccountManagementServletProperties::getCqaccountmanagerconfiginformnewpwdmail()
{
	return cqaccountmanagerconfiginformnewpwdmail;
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::setCqaccountmanagerconfiginformnewpwdmail(ConfigNodePropertyString  cqaccountmanagerconfiginformnewpwdmail)
{
	this->cqaccountmanagerconfiginformnewpwdmail = cqaccountmanagerconfiginformnewpwdmail;
}


