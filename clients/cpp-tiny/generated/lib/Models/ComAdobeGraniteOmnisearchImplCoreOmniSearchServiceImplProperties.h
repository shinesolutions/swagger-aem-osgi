
/*
 * ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties();
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOmnisearchsuggestionrequiretextmin();

	/*! \brief Set 
	 */
	void setOmnisearchsuggestionrequiretextmin(ConfigNodePropertyInteger omnisearchsuggestionrequiretextmin);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOmnisearchsuggestionspellcheckrequire();

	/*! \brief Set 
	 */
	void setOmnisearchsuggestionspellcheckrequire(ConfigNodePropertyBoolean omnisearchsuggestionspellcheckrequire);


    private:
    ConfigNodePropertyInteger omnisearchsuggestionrequiretextmin;
    ConfigNodePropertyBoolean omnisearchsuggestionspellcheckrequire;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties_H_ */
