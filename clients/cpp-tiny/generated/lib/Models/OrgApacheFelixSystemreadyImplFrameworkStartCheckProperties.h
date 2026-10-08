
/*
 * OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties();
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeout();

	/*! \brief Set 
	 */
	void setTimeout(ConfigNodePropertyInteger timeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTargetstartlevel();

	/*! \brief Set 
	 */
	void setTargetstartlevel(ConfigNodePropertyInteger targetstartlevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTargetstartlevelpropname();

	/*! \brief Set 
	 */
	void setTargetstartlevelpropname(ConfigNodePropertyString targetstartlevelpropname);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown type);


    private:
    ConfigNodePropertyInteger timeout;
    ConfigNodePropertyInteger targetstartlevel;
    ConfigNodePropertyString targetstartlevelpropname;
    ConfigNodePropertyDropDown type;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties_H_ */
