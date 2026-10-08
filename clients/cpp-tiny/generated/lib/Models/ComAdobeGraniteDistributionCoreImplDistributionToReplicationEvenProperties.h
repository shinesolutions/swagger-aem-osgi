
/*
 * ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties();
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getImportername();

	/*! \brief Set 
	 */
	void setImportername(ConfigNodePropertyArray importername);


    private:
    ConfigNodePropertyArray importername;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties_H_ */
