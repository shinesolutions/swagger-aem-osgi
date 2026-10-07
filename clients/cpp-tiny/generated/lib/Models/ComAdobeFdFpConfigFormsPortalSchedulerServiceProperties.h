
/*
 * ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_


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

class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFormportalinterval();

	/*! \brief Set 
	 */
	void setFormportalinterval(ConfigNodePropertyString formportalinterval);


    private:
    ConfigNodePropertyString formportalinterval;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_ */
