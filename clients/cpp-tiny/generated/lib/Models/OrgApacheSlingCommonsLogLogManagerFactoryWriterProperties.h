
/*
 * OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogfile();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfile(ConfigNodePropertyString orgapacheslingcommonslogfile);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslogfilenumber();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfilenumber(ConfigNodePropertyInteger orgapacheslingcommonslogfilenumber);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogfilesize();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfilesize(ConfigNodePropertyString orgapacheslingcommonslogfilesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslingcommonslogfilebuffered();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfilebuffered(ConfigNodePropertyBoolean orgapacheslingcommonslogfilebuffered);


    private:
    ConfigNodePropertyString orgapacheslingcommonslogfile;
    ConfigNodePropertyInteger orgapacheslingcommonslogfilenumber;
    ConfigNodePropertyString orgapacheslingcommonslogfilesize;
    ConfigNodePropertyBoolean orgapacheslingcommonslogfilebuffered;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H_ */
