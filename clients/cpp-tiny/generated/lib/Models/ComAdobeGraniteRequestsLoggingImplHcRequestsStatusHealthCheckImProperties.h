
/*
 * ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties_H_


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

class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties();
    ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);


    private:
    ConfigNodePropertyArray hctags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties_H_ */
