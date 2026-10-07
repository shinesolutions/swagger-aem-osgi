/*
 * OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties_H_
#define _OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties_H_


#include <string>
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

class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties();
	OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getManagerroot();

	/*! \brief Set 
	 */
	void setManagerroot(ConfigNodePropertyString  managerroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHttpservicefilter();

	/*! \brief Set 
	 */
	void setHttpservicefilter(ConfigNodePropertyString  httpservicefilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultrender();

	/*! \brief Set 
	 */
	void setDefaultrender(ConfigNodePropertyString  defaultrender);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRealm();

	/*! \brief Set 
	 */
	void setRealm(ConfigNodePropertyString  realm);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString  username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString  password);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCategory();

	/*! \brief Set 
	 */
	void setCategory(ConfigNodePropertyString  category);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocale();

	/*! \brief Set 
	 */
	void setLocale(ConfigNodePropertyString  locale);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLoglevel();

	/*! \brief Set 
	 */
	void setLoglevel(ConfigNodePropertyDropDown  loglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getPlugins();

	/*! \brief Set 
	 */
	void setPlugins(ConfigNodePropertyDropDown  plugins);

private:
	ConfigNodePropertyString managerroot;
	ConfigNodePropertyString httpservicefilter;
	ConfigNodePropertyString defaultrender;
	ConfigNodePropertyString realm;
	ConfigNodePropertyString username;
	ConfigNodePropertyString password;
	ConfigNodePropertyString category;
	ConfigNodePropertyString locale;
	ConfigNodePropertyDropDown loglevel;
	ConfigNodePropertyDropDown plugins;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties_H_ */
