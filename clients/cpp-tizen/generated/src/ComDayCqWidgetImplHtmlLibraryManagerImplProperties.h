/*
 * ComDayCqWidgetImplHtmlLibraryManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWidgetImplHtmlLibraryManagerImplProperties_H_
#define _ComDayCqWidgetImplHtmlLibraryManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWidgetImplHtmlLibraryManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWidgetImplHtmlLibraryManagerImplProperties();
	ComDayCqWidgetImplHtmlLibraryManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWidgetImplHtmlLibraryManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerclientmanager();

	/*! \brief Set 
	 */
	void setHtmllibmanagerclientmanager(ConfigNodePropertyString  htmllibmanagerclientmanager);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerdebug();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdebug(ConfigNodePropertyBoolean  htmllibmanagerdebug);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerdebugconsole();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdebugconsole(ConfigNodePropertyBoolean  htmllibmanagerdebugconsole);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerdebuginitjs();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdebuginitjs(ConfigNodePropertyString  htmllibmanagerdebuginitjs);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerdefaultthemename();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdefaultthemename(ConfigNodePropertyString  htmllibmanagerdefaultthemename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerdefaultuserthemename();

	/*! \brief Set 
	 */
	void setHtmllibmanagerdefaultuserthemename(ConfigNodePropertyString  htmllibmanagerdefaultuserthemename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHtmllibmanagerfirebuglitepath();

	/*! \brief Set 
	 */
	void setHtmllibmanagerfirebuglitepath(ConfigNodePropertyString  htmllibmanagerfirebuglitepath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerforceCQUrlInfo();

	/*! \brief Set 
	 */
	void setHtmllibmanagerforceCQUrlInfo(ConfigNodePropertyBoolean  htmllibmanagerforceCQUrlInfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagergzip();

	/*! \brief Set 
	 */
	void setHtmllibmanagergzip(ConfigNodePropertyBoolean  htmllibmanagergzip);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHtmllibmanagermaxage();

	/*! \brief Set 
	 */
	void setHtmllibmanagermaxage(ConfigNodePropertyInteger  htmllibmanagermaxage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHtmllibmanagermaxDataUriSize();

	/*! \brief Set 
	 */
	void setHtmllibmanagermaxDataUriSize(ConfigNodePropertyInteger  htmllibmanagermaxDataUriSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagerminify();

	/*! \brief Set 
	 */
	void setHtmllibmanagerminify(ConfigNodePropertyBoolean  htmllibmanagerminify);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmllibmanagerpathlist();

	/*! \brief Set 
	 */
	void setHtmllibmanagerpathlist(ConfigNodePropertyArray  htmllibmanagerpathlist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmllibmanagertiming();

	/*! \brief Set 
	 */
	void setHtmllibmanagertiming(ConfigNodePropertyBoolean  htmllibmanagertiming);

private:
	ConfigNodePropertyString htmllibmanagerclientmanager;
	ConfigNodePropertyBoolean htmllibmanagerdebug;
	ConfigNodePropertyBoolean htmllibmanagerdebugconsole;
	ConfigNodePropertyString htmllibmanagerdebuginitjs;
	ConfigNodePropertyString htmllibmanagerdefaultthemename;
	ConfigNodePropertyString htmllibmanagerdefaultuserthemename;
	ConfigNodePropertyString htmllibmanagerfirebuglitepath;
	ConfigNodePropertyBoolean htmllibmanagerforceCQUrlInfo;
	ConfigNodePropertyBoolean htmllibmanagergzip;
	ConfigNodePropertyInteger htmllibmanagermaxage;
	ConfigNodePropertyInteger htmllibmanagermaxDataUriSize;
	ConfigNodePropertyBoolean htmllibmanagerminify;
	ConfigNodePropertyArray htmllibmanagerpathlist;
	ConfigNodePropertyBoolean htmllibmanagertiming;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWidgetImplHtmlLibraryManagerImplProperties_H_ */
