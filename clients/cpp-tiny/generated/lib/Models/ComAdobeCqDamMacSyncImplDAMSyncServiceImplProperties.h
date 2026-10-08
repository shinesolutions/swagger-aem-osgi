
/*
 * ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties();
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobecqdammacsyncdamsyncserviceregisteredPaths();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncserviceregisteredPaths(ConfigNodePropertyArray comadobecqdammacsyncdamsyncserviceregistered_paths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobecqdammacsyncdamsyncservicesyncrenditions();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncservicesyncrenditions(ConfigNodePropertyBoolean comadobecqdammacsyncdamsyncservicesyncrenditions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncservicereplicatethreadwaitms(ConfigNodePropertyInteger comadobecqdammacsyncdamsyncservicereplicatethreadwaitms);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getComadobecqdammacsyncdamsyncserviceplatform();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncserviceplatform(ConfigNodePropertyDropDown comadobecqdammacsyncdamsyncserviceplatform);


    private:
    ConfigNodePropertyArray comadobecqdammacsyncdamsyncserviceregistered_paths;
    ConfigNodePropertyBoolean comadobecqdammacsyncdamsyncservicesyncrenditions;
    ConfigNodePropertyInteger comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
    ConfigNodePropertyDropDown comadobecqdammacsyncdamsyncserviceplatform;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties_H_ */
