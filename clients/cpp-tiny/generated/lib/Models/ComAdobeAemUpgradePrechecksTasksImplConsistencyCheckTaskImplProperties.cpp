

#include "ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties()
{
	rootpath = ConfigNodePropertyString();
	fixinconsistencies = ConfigNodePropertyBoolean();
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::~ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties()
{

}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rootpathKey = "root.path";

    if(object.has_key(rootpathKey))
    {
        bourne::json value = object[rootpathKey];




        ConfigNodePropertyString* obj = &rootpath;
		obj->fromJson(value.dump());

    }

    const char *fixinconsistenciesKey = "fix.inconsistencies";

    if(object.has_key(fixinconsistenciesKey))
    {
        bourne::json value = object[fixinconsistenciesKey];




        ConfigNodePropertyBoolean* obj = &fixinconsistencies;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["rootpath"] = getRootpath().toJson();






	object["fixinconsistencies"] = getFixinconsistencies().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::getRootpath()
{
	return rootpath;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::setRootpath(ConfigNodePropertyString rootpath)
{
	this->rootpath = rootpath;
}

ConfigNodePropertyBoolean
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::getFixinconsistencies()
{
	return fixinconsistencies;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::setFixinconsistencies(ConfigNodePropertyBoolean fixinconsistencies)
{
	this->fixinconsistencies = fixinconsistencies;
}



