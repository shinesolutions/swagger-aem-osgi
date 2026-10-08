
/*
 * ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties();
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties();


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
    ConfigNodePropertyBoolean buildpagenodes;
    ConfigNodePropertyBoolean buildclientlibs;
    ConfigNodePropertyBoolean buildcanvascomponent;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties_H_ */
