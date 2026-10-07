
/*
 * ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties();
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGetPeriod();

	/*! \brief Set 
	 */
	void setGetPeriod(ConfigNodePropertyInteger getPeriod);


    private:
    ConfigNodePropertyInteger getPeriod;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties_H_ */
