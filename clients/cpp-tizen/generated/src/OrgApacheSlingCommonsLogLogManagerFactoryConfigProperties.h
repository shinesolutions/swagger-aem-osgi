/*
 * OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_
#define _OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
	OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getOrgapacheslingcommonsloglevel();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonsloglevel(ConfigNodePropertyDropDown  orgapacheslingcommonsloglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogfile();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfile(ConfigNodePropertyString  orgapacheslingcommonslogfile);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogpattern();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogpattern(ConfigNodePropertyString  orgapacheslingcommonslogpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslingcommonslognames();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslognames(ConfigNodePropertyArray  orgapacheslingcommonslognames);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslingcommonslogadditiv();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogadditiv(ConfigNodePropertyBoolean  orgapacheslingcommonslogadditiv);

private:
	ConfigNodePropertyDropDown orgapacheslingcommonsloglevel;
	ConfigNodePropertyString orgapacheslingcommonslogfile;
	ConfigNodePropertyString orgapacheslingcommonslogpattern;
	ConfigNodePropertyArray orgapacheslingcommonslognames;
	ConfigNodePropertyBoolean orgapacheslingcommonslogadditiv;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties_H_ */
