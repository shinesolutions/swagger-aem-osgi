
/*
 * OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties_H_


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

class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties();
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHandlerschemes();

	/*! \brief Set 
	 */
	void setHandlerschemes(ConfigNodePropertyArray handlerschemes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingjcrinstallfoldernameregexp();

	/*! \brief Set 
	 */
	void setSlingjcrinstallfoldernameregexp(ConfigNodePropertyString slingjcrinstallfoldernameregexp);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingjcrinstallfoldermaxdepth();

	/*! \brief Set 
	 */
	void setSlingjcrinstallfoldermaxdepth(ConfigNodePropertyInteger slingjcrinstallfoldermaxdepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingjcrinstallsearchpath();

	/*! \brief Set 
	 */
	void setSlingjcrinstallsearchpath(ConfigNodePropertyArray slingjcrinstallsearchpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingjcrinstallnewconfigpath();

	/*! \brief Set 
	 */
	void setSlingjcrinstallnewconfigpath(ConfigNodePropertyString slingjcrinstallnewconfigpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingjcrinstallsignalpath();

	/*! \brief Set 
	 */
	void setSlingjcrinstallsignalpath(ConfigNodePropertyString slingjcrinstallsignalpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingjcrinstallenablewriteback();

	/*! \brief Set 
	 */
	void setSlingjcrinstallenablewriteback(ConfigNodePropertyBoolean slingjcrinstallenablewriteback);


    private:
    ConfigNodePropertyArray handlerschemes;
    ConfigNodePropertyString slingjcrinstallfoldernameregexp;
    ConfigNodePropertyInteger slingjcrinstallfoldermaxdepth;
    ConfigNodePropertyArray slingjcrinstallsearchpath;
    ConfigNodePropertyString slingjcrinstallnewconfigpath;
    ConfigNodePropertyString slingjcrinstallsignalpath;
    ConfigNodePropertyBoolean slingjcrinstallenablewriteback;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties_H_ */
