
/*
 * ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties_H_


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

class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties();
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDiffPath();

	/*! \brief Set 
	 */
	void setDiffPath(ConfigNodePropertyString diffPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceUsertarget();

	/*! \brief Set 
	 */
	void setServiceUsertarget(ConfigNodePropertyString serviceUsertarget);


    private:
    ConfigNodePropertyString diffPath;
    ConfigNodePropertyString serviceName;
    ConfigNodePropertyString serviceUsertarget;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties_H_ */
