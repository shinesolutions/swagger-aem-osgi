
/*
 * ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDtmReactorImplServiceWebServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDtmReactorImplServiceWebServiceImplProperties_H_


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

class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties();
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDtmReactorImplServiceWebServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEndpointUri();

	/*! \brief Set 
	 */
	void setEndpointUri(ConfigNodePropertyString endpointUri);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectionTimeout();

	/*! \brief Set 
	 */
	void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSocketTimeout();

	/*! \brief Set 
	 */
	void setSocketTimeout(ConfigNodePropertyInteger socketTimeout);


    private:
    ConfigNodePropertyString endpointUri;
    ConfigNodePropertyInteger connectionTimeout;
    ConfigNodePropertyInteger socketTimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDtmReactorImplServiceWebServiceImplProperties_H_ */
