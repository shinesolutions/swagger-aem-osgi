
/*
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties();
    ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTagpattern();

	/*! \brief Set 
	 */
	void setTagpattern(ConfigNodePropertyString tagpattern);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyString tagpattern;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties_H_ */
