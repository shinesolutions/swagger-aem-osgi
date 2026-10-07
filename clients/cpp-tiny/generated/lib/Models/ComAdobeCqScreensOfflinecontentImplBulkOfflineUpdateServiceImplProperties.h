
/*
 * ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties();
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath();

	/*! \brief Set 
	 */
	void setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath(ConfigNodePropertyArray comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency();

	/*! \brief Set 
	 */
	void setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency(ConfigNodePropertyString comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency);


    private:
    ConfigNodePropertyArray comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
    ConfigNodePropertyString comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties_H_ */
