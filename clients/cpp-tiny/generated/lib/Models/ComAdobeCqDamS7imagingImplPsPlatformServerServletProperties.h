
/*
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheenable();

	/*! \brief Set 
	 */
	void setCacheenable(ConfigNodePropertyBoolean cacheenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCacherootPaths();

	/*! \brief Set 
	 */
	void setCacherootPaths(ConfigNodePropertyArray cacherootPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachemaxSize();

	/*! \brief Set 
	 */
	void setCachemaxSize(ConfigNodePropertyInteger cachemaxSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachemaxEntries();

	/*! \brief Set 
	 */
	void setCachemaxEntries(ConfigNodePropertyInteger cachemaxEntries);


    private:
    ConfigNodePropertyBoolean cacheenable;
    ConfigNodePropertyArray cacherootPaths;
    ConfigNodePropertyInteger cachemaxSize;
    ConfigNodePropertyInteger cachemaxEntries;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_ */
