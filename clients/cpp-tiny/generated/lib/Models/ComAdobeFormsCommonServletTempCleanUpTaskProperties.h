
/*
 * ComAdobeFormsCommonServletTempCleanUpTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeFormsCommonServletTempCleanUpTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeFormsCommonServletTempCleanUpTaskProperties_H_


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

class ComAdobeFormsCommonServletTempCleanUpTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeFormsCommonServletTempCleanUpTaskProperties();
    ComAdobeFormsCommonServletTempCleanUpTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeFormsCommonServletTempCleanUpTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDurationforTemporaryStorage();

	/*! \brief Set 
	 */
	void setDurationforTemporaryStorage(ConfigNodePropertyString durationforTemporaryStorage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDurationforAnonymousStorage();

	/*! \brief Set 
	 */
	void setDurationforAnonymousStorage(ConfigNodePropertyString durationforAnonymousStorage);


    private:
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyString durationforTemporaryStorage;
    ConfigNodePropertyString durationforAnonymousStorage;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeFormsCommonServletTempCleanUpTaskProperties_H_ */
