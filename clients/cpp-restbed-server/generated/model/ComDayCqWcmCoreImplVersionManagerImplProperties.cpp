/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ComDayCqWcmCoreImplVersionManagerImplProperties.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmCoreImplVersionManagerImplProperties::ComDayCqWcmCoreImplVersionManagerImplProperties()
{
    
}

ComDayCqWcmCoreImplVersionManagerImplProperties::~ComDayCqWcmCoreImplVersionManagerImplProperties()
{
}

std::string ComDayCqWcmCoreImplVersionManagerImplProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqWcmCoreImplVersionManagerImplProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerCreateVersionOnActivation() const
{
    return m_Versionmanager_createVersionOnActivation;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerCreateVersionOnActivation(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Versionmanager_createVersionOnActivation = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerPurgingEnabled() const
{
    return m_Versionmanager_purgingEnabled;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerPurgingEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Versionmanager_purgingEnabled = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerPurgePaths() const
{
    return m_Versionmanager_purgePaths;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerPurgePaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Versionmanager_purgePaths = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerIvPaths() const
{
    return m_Versionmanager_ivPaths;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerIvPaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Versionmanager_ivPaths = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerMaxAgeDays() const
{
    return m_Versionmanager_maxAgeDays;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerMaxAgeDays(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Versionmanager_maxAgeDays = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerMaxNumberVersions() const
{
    return m_Versionmanager_maxNumberVersions;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerMaxNumberVersions(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Versionmanager_maxNumberVersions = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerMinNumberVersions() const
{
    return m_Versionmanager_minNumberVersions;
}
void ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerMinNumberVersions(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Versionmanager_minNumberVersions = value;
}

}
}
}
}
