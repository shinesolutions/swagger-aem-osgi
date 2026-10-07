
/*
 * ComAdobeGraniteRestImplServletDefaultGETServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRestImplServletDefaultGETServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRestImplServletDefaultGETServletProperties_H_


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

class ComAdobeGraniteRestImplServletDefaultGETServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRestImplServletDefaultGETServletProperties();
    ComAdobeGraniteRestImplServletDefaultGETServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRestImplServletDefaultGETServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaultlimit();

	/*! \brief Set 
	 */
	void setDefaultlimit(ConfigNodePropertyInteger defaultlimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseabsoluteuri();

	/*! \brief Set 
	 */
	void setUseabsoluteuri(ConfigNodePropertyBoolean useabsoluteuri);


    private:
    ConfigNodePropertyInteger defaultlimit;
    ConfigNodePropertyBoolean useabsoluteuri;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRestImplServletDefaultGETServletProperties_H_ */
