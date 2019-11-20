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



#include "OrgApacheFelixJaasConfigurationFactoryProperties.h"

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

OrgApacheFelixJaasConfigurationFactoryProperties::OrgApacheFelixJaasConfigurationFactoryProperties()
{
    
}

OrgApacheFelixJaasConfigurationFactoryProperties::~OrgApacheFelixJaasConfigurationFactoryProperties()
{
}

std::string OrgApacheFelixJaasConfigurationFactoryProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void OrgApacheFelixJaasConfigurationFactoryProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyDropDown> OrgApacheFelixJaasConfigurationFactoryProperties::getJaasControlFlag() const
{
    return m_Jaas_controlFlag;
}
void OrgApacheFelixJaasConfigurationFactoryProperties::setJaasControlFlag(std::shared_ptr<ConfigNodePropertyDropDown> value)
{
    m_Jaas_controlFlag = value;
}
std::shared_ptr<ConfigNodePropertyInteger> OrgApacheFelixJaasConfigurationFactoryProperties::getJaasRanking() const
{
    return m_Jaas_ranking;
}
void OrgApacheFelixJaasConfigurationFactoryProperties::setJaasRanking(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Jaas_ranking = value;
}
std::shared_ptr<ConfigNodePropertyString> OrgApacheFelixJaasConfigurationFactoryProperties::getJaasRealmName() const
{
    return m_Jaas_realmName;
}
void OrgApacheFelixJaasConfigurationFactoryProperties::setJaasRealmName(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Jaas_realmName = value;
}
std::shared_ptr<ConfigNodePropertyString> OrgApacheFelixJaasConfigurationFactoryProperties::getJaasClassname() const
{
    return m_Jaas_classname;
}
void OrgApacheFelixJaasConfigurationFactoryProperties::setJaasClassname(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Jaas_classname = value;
}
std::shared_ptr<ConfigNodePropertyArray> OrgApacheFelixJaasConfigurationFactoryProperties::getJaasOptions() const
{
    return m_Jaas_options;
}
void OrgApacheFelixJaasConfigurationFactoryProperties::setJaasOptions(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Jaas_options = value;
}

}
}
}
}
