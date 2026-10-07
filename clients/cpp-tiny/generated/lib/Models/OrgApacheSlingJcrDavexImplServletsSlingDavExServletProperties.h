
/*
 * OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties();
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAlias();

	/*! \brief Set 
	 */
	void setAlias(ConfigNodePropertyString alias);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDavcreateabsoluteuri();

	/*! \brief Set 
	 */
	void setDavcreateabsoluteuri(ConfigNodePropertyBoolean davcreateabsoluteuri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDavprotectedhandlers();

	/*! \brief Set 
	 */
	void setDavprotectedhandlers(ConfigNodePropertyString davprotectedhandlers);


    private:
    ConfigNodePropertyString alias;
    ConfigNodePropertyBoolean davcreateabsoluteuri;
    ConfigNodePropertyString davprotectedhandlers;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties_H_ */
