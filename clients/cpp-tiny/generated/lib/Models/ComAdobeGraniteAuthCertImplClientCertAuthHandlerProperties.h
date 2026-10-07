
/*
 * ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties_H_


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

class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties();
    ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties_H_ */
