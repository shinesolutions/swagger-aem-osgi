
/*
 * ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties_H_


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

class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties();
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties();


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
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnoredbundles();

	/*! \brief Set 
	 */
	void setIgnoredbundles(ConfigNodePropertyArray ignoredbundles);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyArray ignoredbundles;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties_H_ */
