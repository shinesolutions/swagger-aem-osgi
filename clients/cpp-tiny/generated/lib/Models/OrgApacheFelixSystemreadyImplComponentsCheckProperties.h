
/*
 * OrgApacheFelixSystemreadyImplComponentsCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplComponentsCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplComponentsCheckProperties_H_


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

class OrgApacheFelixSystemreadyImplComponentsCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixSystemreadyImplComponentsCheckProperties();
    OrgApacheFelixSystemreadyImplComponentsCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixSystemreadyImplComponentsCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComponentslist();

	/*! \brief Set 
	 */
	void setComponentslist(ConfigNodePropertyArray componentslist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown type);


    private:
    ConfigNodePropertyArray componentslist;
    ConfigNodePropertyDropDown type;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplComponentsCheckProperties_H_ */
