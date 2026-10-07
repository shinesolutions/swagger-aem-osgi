
/*
 * ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties();
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagertiming();

	/*! \brief Set 
	 */
	void setHtmllibmanagertiming(ConfigNodePropertyBoolean htmllibmanagertiming);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerdebuginitjs();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdebuginitjs(ConfigNodePropertyString htmllibmanagerdebuginitjs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerminify();

	/*! \brief Set 
	 */
	void setHtmllibmanagerminify(ConfigNodePropertyBoolean htmllibmanagerminify);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerdebug();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdebug(ConfigNodePropertyBoolean htmllibmanagerdebug);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagergzip();

	/*! \brief Set 
	 */
	void setHtmllibmanagergzip(ConfigNodePropertyBoolean htmllibmanagergzip);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHtmllibmanagermaxDataUriSize();

	/*! \brief Set 
	 */
	void setHtmllibmanagermaxDataUriSize(ConfigNodePropertyInteger htmllibmanagermaxDataUriSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHtmllibmanagermaxage();

	/*! \brief Set 
	 */
	void setHtmllibmanagermaxage(ConfigNodePropertyInteger htmllibmanagermaxage);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerforceCQUrlInfo();

	/*! \brief Set 
	 */
	void setHtmllibmanagerforceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerforceCQUrlInfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerdefaultthemename();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdefaultthemename(ConfigNodePropertyString htmllibmanagerdefaultthemename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerdefaultuserthemename();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdefaultuserthemename(ConfigNodePropertyString htmllibmanagerdefaultuserthemename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerclientmanager();

	/*! \brief Set 
	 */
	void setHtmllibmanagerclientmanager(ConfigNodePropertyString htmllibmanagerclientmanager);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerpathlist();

	/*! \brief Set 
	 */
	void setHtmllibmanagerpathlist(ConfigNodePropertyArray htmllibmanagerpathlist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerexcludedpathlist();

	/*! \brief Set 
	 */
	void setHtmllibmanagerexcludedpathlist(ConfigNodePropertyArray htmllibmanagerexcludedpathlist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerprocessorjs();

	/*! \brief Set 
	 */
	void setHtmllibmanagerprocessorjs(ConfigNodePropertyArray htmllibmanagerprocessorjs);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerprocessorcss();

	/*! \brief Set 
	 */
	void setHtmllibmanagerprocessorcss(ConfigNodePropertyArray htmllibmanagerprocessorcss);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerlongcachepatterns();

	/*! \brief Set 
	 */
	void setHtmllibmanagerlongcachepatterns(ConfigNodePropertyArray htmllibmanagerlongcachepatterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerlongcacheformat();

	/*! \brief Set 
	 */
	void setHtmllibmanagerlongcacheformat(ConfigNodePropertyString htmllibmanagerlongcacheformat);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanageruseFileSystemOutputCache();

	/*! \brief Set 
	 */
	void setHtmllibmanageruseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanageruseFileSystemOutputCache);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerfileSystemOutputCacheLocation();

	/*! \brief Set 
	 */
	void setHtmllibmanagerfileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerfileSystemOutputCacheLocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerdisablereplacement();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdisablereplacement(ConfigNodePropertyArray htmllibmanagerdisablereplacement);


    private:
    ConfigNodePropertyBoolean htmllibmanagertiming;
    ConfigNodePropertyString htmllibmanagerdebuginitjs;
    ConfigNodePropertyBoolean htmllibmanagerminify;
    ConfigNodePropertyBoolean htmllibmanagerdebug;
    ConfigNodePropertyBoolean htmllibmanagergzip;
    ConfigNodePropertyInteger htmllibmanagermaxDataUriSize;
    ConfigNodePropertyInteger htmllibmanagermaxage;
    ConfigNodePropertyBoolean htmllibmanagerforceCQUrlInfo;
    ConfigNodePropertyString htmllibmanagerdefaultthemename;
    ConfigNodePropertyString htmllibmanagerdefaultuserthemename;
    ConfigNodePropertyString htmllibmanagerclientmanager;
    ConfigNodePropertyArray htmllibmanagerpathlist;
    ConfigNodePropertyArray htmllibmanagerexcludedpathlist;
    ConfigNodePropertyArray htmllibmanagerprocessorjs;
    ConfigNodePropertyArray htmllibmanagerprocessorcss;
    ConfigNodePropertyArray htmllibmanagerlongcachepatterns;
    ConfigNodePropertyString htmllibmanagerlongcacheformat;
    ConfigNodePropertyBoolean htmllibmanageruseFileSystemOutputCache;
    ConfigNodePropertyString htmllibmanagerfileSystemOutputCacheLocation;
    ConfigNodePropertyArray htmllibmanagerdisablereplacement;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties_H_ */
