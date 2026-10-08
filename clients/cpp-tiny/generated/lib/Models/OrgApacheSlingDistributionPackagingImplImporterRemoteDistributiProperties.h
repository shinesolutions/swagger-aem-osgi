
/*
 * OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties();
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties();


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
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString transportSecretProvidertarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyArray endpoints;
    ConfigNodePropertyString transportSecretProvidertarget;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties_H_ */
