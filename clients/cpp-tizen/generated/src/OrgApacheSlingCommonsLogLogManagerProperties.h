/*
 * OrgApacheSlingCommonsLogLogManagerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsLogLogManagerProperties_H_
#define _OrgApacheSlingCommonsLogLogManagerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingCommonsLogLogManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsLogLogManagerProperties();
	OrgApacheSlingCommonsLogLogManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsLogLogManagerProperties();

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
	ConfigNodePropertyString getOrgapacheslingcommonslogpattern();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogpattern(ConfigNodePropertyString  orgapacheslingcommonslogpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogconfigurationFile();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogconfigurationFile(ConfigNodePropertyString  orgapacheslingcommonslogconfigurationFile);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslingcommonslogpackagingDataEnabled();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogpackagingDataEnabled(ConfigNodePropertyBoolean  orgapacheslingcommonslogpackagingDataEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslogmaxCallerDataDepth();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogmaxCallerDataDepth(ConfigNodePropertyInteger  orgapacheslingcommonslogmaxCallerDataDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslogmaxOldFileCountInDump();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogmaxOldFileCountInDump(ConfigNodePropertyInteger  orgapacheslingcommonslogmaxOldFileCountInDump);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslognumOfLines();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslognumOfLines(ConfigNodePropertyInteger  orgapacheslingcommonslognumOfLines);

private:
	ConfigNodePropertyDropDown orgapacheslingcommonsloglevel;
	ConfigNodePropertyString orgapacheslingcommonslogfile;
	ConfigNodePropertyInteger orgapacheslingcommonslogfilenumber;
	ConfigNodePropertyString orgapacheslingcommonslogfilesize;
	ConfigNodePropertyString orgapacheslingcommonslogpattern;
	ConfigNodePropertyString orgapacheslingcommonslogconfigurationFile;
	ConfigNodePropertyBoolean orgapacheslingcommonslogpackagingDataEnabled;
	ConfigNodePropertyInteger orgapacheslingcommonslogmaxCallerDataDepth;
	ConfigNodePropertyInteger orgapacheslingcommonslogmaxOldFileCountInDump;
	ConfigNodePropertyInteger orgapacheslingcommonslognumOfLines;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsLogLogManagerProperties_H_ */
