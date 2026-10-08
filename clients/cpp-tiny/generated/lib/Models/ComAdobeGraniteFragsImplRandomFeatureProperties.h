
/*
 * ComAdobeGraniteFragsImplRandomFeatureProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteFragsImplRandomFeatureProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteFragsImplRandomFeatureProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteFragsImplRandomFeatureProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteFragsImplRandomFeatureProperties();
    ComAdobeGraniteFragsImplRandomFeatureProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteFragsImplRandomFeatureProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFeaturename();

	/*! \brief Set 
	 */
	void setFeaturename(ConfigNodePropertyString featurename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFeaturedescription();

	/*! \brief Set 
	 */
	void setFeaturedescription(ConfigNodePropertyString featuredescription);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getActivepercentage();

	/*! \brief Set 
	 */
	void setActivepercentage(ConfigNodePropertyString activepercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCookiename();

	/*! \brief Set 
	 */
	void setCookiename(ConfigNodePropertyString cookiename);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCookiemaxAge();

	/*! \brief Set 
	 */
	void setCookiemaxAge(ConfigNodePropertyInteger cookiemaxAge);


    private:
    ConfigNodePropertyString featurename;
    ConfigNodePropertyString featuredescription;
    ConfigNodePropertyString activepercentage;
    ConfigNodePropertyString cookiename;
    ConfigNodePropertyInteger cookiemaxAge;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteFragsImplRandomFeatureProperties_H_ */
