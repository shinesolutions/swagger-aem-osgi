
/*
 * ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties();
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSize();

	/*! \brief Set 
	 */
	void setSize(ConfigNodePropertyInteger size);


    private:
    ConfigNodePropertyInteger size;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties_H_ */
