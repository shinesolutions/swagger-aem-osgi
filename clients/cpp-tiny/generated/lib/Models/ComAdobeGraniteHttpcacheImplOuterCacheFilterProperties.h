
/*
 * ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_


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

class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobegranitehttpcacheurlpaths();

	/*! \brief Set 
	 */
	void setComadobegranitehttpcacheurlpaths(ConfigNodePropertyArray comadobegranitehttpcacheurlpaths);


    private:
    ConfigNodePropertyArray comadobegranitehttpcacheurlpaths;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_ */
