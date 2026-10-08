
/*
 * ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties();
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties();


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
	ConfigNodePropertyInteger getMinimumcodecachesize();

	/*! \brief Set 
	 */
	void setMinimumcodecachesize(ConfigNodePropertyInteger minimumcodecachesize);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyInteger minimumcodecachesize;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties_H_ */
