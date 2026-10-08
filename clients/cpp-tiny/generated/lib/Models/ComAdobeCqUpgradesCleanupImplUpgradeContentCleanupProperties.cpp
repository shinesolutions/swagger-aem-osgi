

#include "ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.h"

using namespace Tiny;

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties()
{
	deletepathregexps = ConfigNodePropertyArray();
	deletesql2query = ConfigNodePropertyString();
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::~ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties()
{

}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deletepathregexpsKey = "delete.path.regexps";

    if(object.has_key(deletepathregexpsKey))
    {
        bourne::json value = object[deletepathregexpsKey];




        ConfigNodePropertyArray* obj = &deletepathregexps;
		obj->fromJson(value.dump());

    }

    const char *deletesql2queryKey = "delete.sql2.query";

    if(object.has_key(deletesql2queryKey))
    {
        bourne::json value = object[deletesql2queryKey];




        ConfigNodePropertyString* obj = &deletesql2query;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["deletepathregexps"] = getDeletepathregexps().toJson();






	object["deletesql2query"] = getDeletesql2query().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::getDeletepathregexps()
{
	return deletepathregexps;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::setDeletepathregexps(ConfigNodePropertyArray deletepathregexps)
{
	this->deletepathregexps = deletepathregexps;
}

ConfigNodePropertyString
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::getDeletesql2query()
{
	return deletesql2query;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::setDeletesql2query(ConfigNodePropertyString deletesql2query)
{
	this->deletesql2query = deletesql2query;
}



