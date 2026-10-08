
/*
 * OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties();
    OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroots();

	/*! \brief Set 
	 */
	void setProviderroots(ConfigNodePropertyString providerroots);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKind();

	/*! \brief Set 
	 */
	void setKind(ConfigNodePropertyString kind);


    private:
    ConfigNodePropertyString providerroots;
    ConfigNodePropertyString kind;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties_H_ */
