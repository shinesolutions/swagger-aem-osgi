
/*
 * ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties_H_


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

class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties();
    ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString oauthproviderid);


    private:
    ConfigNodePropertyString oauthproviderid;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties_H_ */
