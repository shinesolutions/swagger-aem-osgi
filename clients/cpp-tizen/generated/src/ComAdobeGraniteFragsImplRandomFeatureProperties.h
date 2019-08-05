/*
 * ComAdobeGraniteFragsImplRandomFeatureProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteFragsImplRandomFeatureProperties_H_
#define _ComAdobeGraniteFragsImplRandomFeatureProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteFragsImplRandomFeatureProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteFragsImplRandomFeatureProperties();
	ComAdobeGraniteFragsImplRandomFeatureProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteFragsImplRandomFeatureProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFeaturename();

	/*! \brief Set 
	 */
	void setFeaturename(ConfigNodePropertyString  featurename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFeaturedescription();

	/*! \brief Set 
	 */
	void setFeaturedescription(ConfigNodePropertyString  featuredescription);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getActivepercentage();

	/*! \brief Set 
	 */
	void setActivepercentage(ConfigNodePropertyString  activepercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCookiename();

	/*! \brief Set 
	 */
	void setCookiename(ConfigNodePropertyString  cookiename);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCookiemaxAge();

	/*! \brief Set 
	 */
	void setCookiemaxAge(ConfigNodePropertyInteger  cookiemaxAge);

private:
	ConfigNodePropertyString featurename;
	ConfigNodePropertyString featuredescription;
	ConfigNodePropertyString activepercentage;
	ConfigNodePropertyString cookiename;
	ConfigNodePropertyInteger cookiemaxAge;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteFragsImplRandomFeatureProperties_H_ */
