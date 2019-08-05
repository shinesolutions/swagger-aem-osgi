/*
 * ComAdobeGraniteAuthOauthImplGraniteProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplGraniteProviderProperties_H_
#define _ComAdobeGraniteAuthOauthImplGraniteProviderProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthOauthImplGraniteProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplGraniteProviderProperties();
	ComAdobeGraniteAuthOauthImplGraniteProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplGraniteProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString  oauthproviderid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergraniteauthorizationurl();

	/*! \brief Set 
	 */
	void setOauthprovidergraniteauthorizationurl(ConfigNodePropertyString  oauthprovidergraniteauthorizationurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergranitetokenurl();

	/*! \brief Set 
	 */
	void setOauthprovidergranitetokenurl(ConfigNodePropertyString  oauthprovidergranitetokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergraniteprofileurl();

	/*! \brief Set 
	 */
	void setOauthprovidergraniteprofileurl(ConfigNodePropertyString  oauthprovidergraniteprofileurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergraniteextendeddetailsurls();

	/*! \brief Set 
	 */
	void setOauthprovidergraniteextendeddetailsurls(ConfigNodePropertyString  oauthprovidergraniteextendeddetailsurls);

private:
	ConfigNodePropertyString oauthproviderid;
	ConfigNodePropertyString oauthprovidergraniteauthorizationurl;
	ConfigNodePropertyString oauthprovidergranitetokenurl;
	ConfigNodePropertyString oauthprovidergraniteprofileurl;
	ConfigNodePropertyString oauthprovidergraniteextendeddetailsurls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplGraniteProviderProperties_H_ */
