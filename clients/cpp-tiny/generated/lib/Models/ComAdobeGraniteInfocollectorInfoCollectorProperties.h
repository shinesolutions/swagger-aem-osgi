
/*
 * ComAdobeGraniteInfocollectorInfoCollectorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteInfocollectorInfoCollectorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteInfocollectorInfoCollectorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteInfocollectorInfoCollectorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteInfocollectorInfoCollectorProperties();
    ComAdobeGraniteInfocollectorInfoCollectorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteInfocollectorInfoCollectorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteinfocollectorincludeThreadDumps();

	/*! \brief Set 
	 */
	void setGraniteinfocollectorincludeThreadDumps(ConfigNodePropertyBoolean graniteinfocollectorincludeThreadDumps);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteinfocollectorincludeHeapDump();

	/*! \brief Set 
	 */
	void setGraniteinfocollectorincludeHeapDump(ConfigNodePropertyBoolean graniteinfocollectorincludeHeapDump);


    private:
    ConfigNodePropertyBoolean graniteinfocollectorincludeThreadDumps;
    ConfigNodePropertyBoolean graniteinfocollectorincludeHeapDump;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteInfocollectorInfoCollectorProperties_H_ */
