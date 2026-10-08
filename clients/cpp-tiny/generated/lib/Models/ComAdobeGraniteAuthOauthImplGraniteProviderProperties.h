
/*
 * ComAdobeGraniteAuthOauthImplGraniteProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplGraniteProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplGraniteProviderProperties_H_


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

class ComAdobeGraniteAuthOauthImplGraniteProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties();
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthImplGraniteProviderProperties();


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
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergraniteauthorizationurl();

	/*! \brief Set 
	 */
	void setOauthprovidergraniteauthorizationurl(ConfigNodePropertyString oauthprovidergraniteauthorizationurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergranitetokenurl();

	/*! \brief Set 
	 */
	void setOauthprovidergranitetokenurl(ConfigNodePropertyString oauthprovidergranitetokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergraniteprofileurl();

	/*! \brief Set 
	 */
	void setOauthprovidergraniteprofileurl(ConfigNodePropertyString oauthprovidergraniteprofileurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergraniteextendeddetailsurls();

	/*! \brief Set 
	 */
	void setOauthprovidergraniteextendeddetailsurls(ConfigNodePropertyString oauthprovidergraniteextendeddetailsurls);


    private:
    ConfigNodePropertyString oauthproviderid;
    ConfigNodePropertyString oauthprovidergraniteauthorizationurl;
    ConfigNodePropertyString oauthprovidergranitetokenurl;
    ConfigNodePropertyString oauthprovidergraniteprofileurl;
    ConfigNodePropertyString oauthprovidergraniteextendeddetailsurls;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplGraniteProviderProperties_H_ */
