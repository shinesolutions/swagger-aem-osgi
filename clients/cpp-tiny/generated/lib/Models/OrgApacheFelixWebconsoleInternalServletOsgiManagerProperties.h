
/*
 * OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties();
    OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getManagerroot();

	/*! \brief Set 
	 */
	void setManagerroot(ConfigNodePropertyString managerroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHttpservicefilter();

	/*! \brief Set 
	 */
	void setHttpservicefilter(ConfigNodePropertyString httpservicefilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultrender();

	/*! \brief Set 
	 */
	void setDefaultrender(ConfigNodePropertyString defaultrender);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRealm();

	/*! \brief Set 
	 */
	void setRealm(ConfigNodePropertyString realm);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString password);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCategory();

	/*! \brief Set 
	 */
	void setCategory(ConfigNodePropertyString category);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocale();

	/*! \brief Set 
	 */
	void setLocale(ConfigNodePropertyString locale);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLoglevel();

	/*! \brief Set 
	 */
	void setLoglevel(ConfigNodePropertyDropDown loglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getPlugins();

	/*! \brief Set 
	 */
	void setPlugins(ConfigNodePropertyDropDown plugins);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties_H_ */
