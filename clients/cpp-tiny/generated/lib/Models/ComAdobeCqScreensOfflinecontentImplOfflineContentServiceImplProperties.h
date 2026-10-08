
/*
 * ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties();
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisableSmartSync();

	/*! \brief Set 
	 */
	void setDisableSmartSync(ConfigNodePropertyBoolean disableSmartSync);


    private:
    ConfigNodePropertyBoolean disableSmartSync;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties_H_ */
