
/*
 * OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties();
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEndpoints();

	/*! \brief Set 
	 */
	void setEndpoints(ConfigNodePropertyArray endpoints);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPullitems();

	/*! \brief Set 
	 */
	void setPullitems(ConfigNodePropertyInteger pullitems);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageBuildertarget();

	/*! \brief Set 
	 */
	void setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyArray endpoints;
    ConfigNodePropertyInteger pullitems;
    ConfigNodePropertyString packageBuildertarget;
    ConfigNodePropertyString transportSecretProvidertarget;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties_H_ */
