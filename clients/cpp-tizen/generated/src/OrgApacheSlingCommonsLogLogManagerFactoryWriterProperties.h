/*
 * OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H_
#define _OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();
	OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogfile();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfile(ConfigNodePropertyString  orgapacheslingcommonslogfile);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslogfilenumber();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfilenumber(ConfigNodePropertyInteger  orgapacheslingcommonslogfilenumber);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogfilesize();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfilesize(ConfigNodePropertyString  orgapacheslingcommonslogfilesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslingcommonslogfilebuffered();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogfilebuffered(ConfigNodePropertyBoolean  orgapacheslingcommonslogfilebuffered);

private:
	ConfigNodePropertyString orgapacheslingcommonslogfile;
	ConfigNodePropertyInteger orgapacheslingcommonslogfilenumber;
	ConfigNodePropertyString orgapacheslingcommonslogfilesize;
	ConfigNodePropertyBoolean orgapacheslingcommonslogfilebuffered;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H_ */
