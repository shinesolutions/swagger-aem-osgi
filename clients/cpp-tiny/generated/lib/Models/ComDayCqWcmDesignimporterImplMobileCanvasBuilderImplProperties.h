
/*
 * ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties_H_


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

class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties();
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilepattern();

	/*! \brief Set 
	 */
	void setFilepattern(ConfigNodePropertyString filepattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDevicegroups();

	/*! \brief Set 
	 */
	void setDevicegroups(ConfigNodePropertyArray devicegroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBuildpagenodes();

	/*! \brief Set 
	 */
	void setBuildpagenodes(ConfigNodePropertyBoolean buildpagenodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBuildclientlibs();

	/*! \brief Set 
	 */
	void setBuildclientlibs(ConfigNodePropertyBoolean buildclientlibs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBuildcanvascomponent();

	/*! \brief Set 
	 */
	void setBuildcanvascomponent(ConfigNodePropertyBoolean buildcanvascomponent);


    private:
    ConfigNodePropertyString filepattern;
    ConfigNodePropertyArray devicegroups;
    ConfigNodePropertyBoolean buildpagenodes;
    ConfigNodePropertyBoolean buildclientlibs;
    ConfigNodePropertyBoolean buildcanvascomponent;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties_H_ */
