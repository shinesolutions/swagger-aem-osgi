
/*
 * OrgApacheSlingCommonsLogLogManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsLogLogManagerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsLogLogManagerProperties();
    OrgApacheSlingCommonsLogLogManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsLogLogManagerProperties();


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
	ConfigNodePropertyString getOrgapacheslingcommonslogpattern();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogpattern(ConfigNodePropertyString orgapacheslingcommonslogpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslingcommonslogconfigurationFile();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogconfigurationFile(ConfigNodePropertyString orgapacheslingcommonslogconfigurationFile);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslingcommonslogpackagingDataEnabled();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogpackagingDataEnabled(ConfigNodePropertyBoolean orgapacheslingcommonslogpackagingDataEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslogmaxCallerDataDepth();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogmaxCallerDataDepth(ConfigNodePropertyInteger orgapacheslingcommonslogmaxCallerDataDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslogmaxOldFileCountInDump();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslogmaxOldFileCountInDump(ConfigNodePropertyInteger orgapacheslingcommonslogmaxOldFileCountInDump);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingcommonslognumOfLines();

	/*! \brief Set 
	 */
	void setOrgapacheslingcommonslognumOfLines(ConfigNodePropertyInteger orgapacheslingcommonslognumOfLines);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsLogLogManagerProperties_H_ */
