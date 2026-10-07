
/*
 * ComDayCqCommonsImplExternalizerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqCommonsImplExternalizerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqCommonsImplExternalizerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqCommonsImplExternalizerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqCommonsImplExternalizerImplProperties();
    ComDayCqCommonsImplExternalizerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqCommonsImplExternalizerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExternalizerdomains();

	/*! \brief Set 
	 */
	void setExternalizerdomains(ConfigNodePropertyArray externalizerdomains);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizerhost();

	/*! \brief Set 
	 */
	void setExternalizerhost(ConfigNodePropertyString externalizerhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizercontextpath();

	/*! \brief Set 
	 */
	void setExternalizercontextpath(ConfigNodePropertyString externalizercontextpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getExternalizerencodedpath();

	/*! \brief Set 
	 */
	void setExternalizerencodedpath(ConfigNodePropertyBoolean externalizerencodedpath);


    private:
    ConfigNodePropertyArray externalizerdomains;
    ConfigNodePropertyString externalizerhost;
    ConfigNodePropertyString externalizercontextpath;
    ConfigNodePropertyBoolean externalizerencodedpath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqCommonsImplExternalizerImplProperties_H_ */
