
/*
 * OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getOrgapacheslingcommonsloglevel();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonsloglevel(ConfigNodePropertyDropDown orgapacheslingcommonsloglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogfile();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfile(ConfigNodePropertyString orgapacheslingcommonslogfile);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogpattern();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogpattern(ConfigNodePropertyString orgapacheslingcommonslogpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslingcommonslognames();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslognames(ConfigNodePropertyArray orgapacheslingcommonslognames);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslingcommonslogadditiv();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogadditiv(ConfigNodePropertyBoolean orgapacheslingcommonslogadditiv);


    private:
    ConfigNodePropertyDropDown orgapacheslingcommonsloglevel;
    ConfigNodePropertyString orgapacheslingcommonslogfile;
    ConfigNodePropertyString orgapacheslingcommonslogpattern;
    ConfigNodePropertyArray orgapacheslingcommonslognames;
    ConfigNodePropertyBoolean orgapacheslingcommonslogadditiv;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_ */
