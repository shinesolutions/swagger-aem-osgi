
/*
 * ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_


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

class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();


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
	ConfigNodePropertyString getHttpheadername();

	/*! \brief Set 
	 */
	void setHttpheadername(ConfigNodePropertyString httpheadername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHttpheadervaluepattern();

	/*! \brief Set 
	 */
	void setHttpheadervaluepattern(ConfigNodePropertyString httpheadervaluepattern);


    private:
    ConfigNodePropertyString featurename;
    ConfigNodePropertyString featuredescription;
    ConfigNodePropertyString httpheadername;
    ConfigNodePropertyString httpheadervaluepattern;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_ */
