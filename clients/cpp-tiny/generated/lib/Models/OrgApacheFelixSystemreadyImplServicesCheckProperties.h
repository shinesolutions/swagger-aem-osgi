
/*
 * OrgApacheFelixSystemreadyImplServicesCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServicesCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServicesCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixSystemreadyImplServicesCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixSystemreadyImplServicesCheckProperties();
    OrgApacheFelixSystemreadyImplServicesCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixSystemreadyImplServicesCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServiceslist();

	/*! \brief Set 
	 */
	void setServiceslist(ConfigNodePropertyArray serviceslist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown type);


    private:
    ConfigNodePropertyArray serviceslist;
    ConfigNodePropertyDropDown type;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServicesCheckProperties_H_ */
