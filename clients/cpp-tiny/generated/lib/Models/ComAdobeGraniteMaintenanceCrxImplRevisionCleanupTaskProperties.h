
/*
 * ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties_H_


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

class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties();
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFullgcdays();

	/*! \brief Set 
	 */
	void setFullgcdays(ConfigNodePropertyArray fullgcdays);


    private:
    ConfigNodePropertyArray fullgcdays;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties_H_ */
