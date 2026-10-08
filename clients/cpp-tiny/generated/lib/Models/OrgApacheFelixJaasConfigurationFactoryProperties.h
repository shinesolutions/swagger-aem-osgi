
/*
 * OrgApacheFelixJaasConfigurationFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixJaasConfigurationFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixJaasConfigurationFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixJaasConfigurationFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixJaasConfigurationFactoryProperties();
    OrgApacheFelixJaasConfigurationFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixJaasConfigurationFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyDropDown jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasclassname();

	/*! \brief Set 
	 */
	void setJaasclassname(ConfigNodePropertyString jaasclassname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJaasoptions();

	/*! \brief Set 
	 */
	void setJaasoptions(ConfigNodePropertyArray jaasoptions);


    private:
    ConfigNodePropertyDropDown jaascontrolFlag;
    ConfigNodePropertyInteger jaasranking;
    ConfigNodePropertyString jaasrealmName;
    ConfigNodePropertyString jaasclassname;
    ConfigNodePropertyArray jaasoptions;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixJaasConfigurationFactoryProperties_H_ */
