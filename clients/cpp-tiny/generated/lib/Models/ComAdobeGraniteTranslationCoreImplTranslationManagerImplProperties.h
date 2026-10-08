
/*
 * ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_


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

class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorName();

	/*! \brief Set 
	 */
	void setDefaultConnectorName(ConfigNodePropertyString defaultConnectorName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultCategory();

	/*! \brief Set 
	 */
	void setDefaultCategory(ConfigNodePropertyString defaultCategory);


    private:
    ConfigNodePropertyString defaultConnectorName;
    ConfigNodePropertyString defaultCategory;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_ */
