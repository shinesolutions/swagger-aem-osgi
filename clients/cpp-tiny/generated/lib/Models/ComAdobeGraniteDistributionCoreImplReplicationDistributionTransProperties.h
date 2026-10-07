
/*
 * ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForwardrequests();

	/*! \brief Set 
	 */
	void setForwardrequests(ConfigNodePropertyBoolean forwardrequests);


    private:
    ConfigNodePropertyBoolean forwardrequests;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_ */
