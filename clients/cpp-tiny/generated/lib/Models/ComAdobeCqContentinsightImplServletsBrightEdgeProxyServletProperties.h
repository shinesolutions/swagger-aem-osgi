
/*
 * ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties_H_


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

class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties();
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getBrightedgeurl();

	/*! \brief Set 
	 */
	void setBrightedgeurl(ConfigNodePropertyString brightedgeurl);


    private:
    ConfigNodePropertyString brightedgeurl;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties_H_ */
