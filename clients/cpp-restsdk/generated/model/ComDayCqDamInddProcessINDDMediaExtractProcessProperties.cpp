/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ComDayCqDamInddProcessINDDMediaExtractProcessProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
{
    m_Process_labelIsSet = false;
    m_Cq_dam_indd_pages_regexIsSet = false;
    m_Ids_job_decoupledIsSet = false;
    m_Ids_job_workflow_modelIsSet = false;
}

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::~ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
{
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqDamInddProcessINDDMediaExtractProcessProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Process_labelIsSet)
    {
        val[utility::conversions::to_string_t("process.label")] = ModelBase::toJson(m_Process_label);
    }
    if(m_Cq_dam_indd_pages_regexIsSet)
    {
        val[utility::conversions::to_string_t("cq.dam.indd.pages.regex")] = ModelBase::toJson(m_Cq_dam_indd_pages_regex);
    }
    if(m_Ids_job_decoupledIsSet)
    {
        val[utility::conversions::to_string_t("ids.job.decoupled")] = ModelBase::toJson(m_Ids_job_decoupled);
    }
    if(m_Ids_job_workflow_modelIsSet)
    {
        val[utility::conversions::to_string_t("ids.job.workflow.model")] = ModelBase::toJson(m_Ids_job_workflow_model);
    }

    return val;
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("process.label")))
    {
        if(!val[utility::conversions::to_string_t("process.label")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("process.label")]);
            setProcessLabel( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cq.dam.indd.pages.regex")))
    {
        if(!val[utility::conversions::to_string_t("cq.dam.indd.pages.regex")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("cq.dam.indd.pages.regex")]);
            setCqDamInddPagesRegex( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("ids.job.decoupled")))
    {
        if(!val[utility::conversions::to_string_t("ids.job.decoupled")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("ids.job.decoupled")]);
            setIdsJobDecoupled( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("ids.job.workflow.model")))
    {
        if(!val[utility::conversions::to_string_t("ids.job.workflow.model")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("ids.job.workflow.model")]);
            setIdsJobWorkflowModel( newItem );
        }
    }
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Process_labelIsSet)
    {
        if (m_Process_label.get())
        {
            m_Process_label->toMultipart(multipart, utility::conversions::to_string_t("process.label."));
        }
    }
    if(m_Cq_dam_indd_pages_regexIsSet)
    {
        if (m_Cq_dam_indd_pages_regex.get())
        {
            m_Cq_dam_indd_pages_regex->toMultipart(multipart, utility::conversions::to_string_t("cq.dam.indd.pages.regex."));
        }
    }
    if(m_Ids_job_decoupledIsSet)
    {
        if (m_Ids_job_decoupled.get())
        {
            m_Ids_job_decoupled->toMultipart(multipart, utility::conversions::to_string_t("ids.job.decoupled."));
        }
    }
    if(m_Ids_job_workflow_modelIsSet)
    {
        if (m_Ids_job_workflow_model.get())
        {
            m_Ids_job_workflow_model->toMultipart(multipart, utility::conversions::to_string_t("ids.job.workflow.model."));
        }
    }
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("process.label")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("process.label")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("process.label."));
            setProcessLabel( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cq.dam.indd.pages.regex")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cq.dam.indd.pages.regex")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cq.dam.indd.pages.regex."));
            setCqDamInddPagesRegex( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("ids.job.decoupled")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("ids.job.decoupled")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("ids.job.decoupled."));
            setIdsJobDecoupled( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("ids.job.workflow.model")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("ids.job.workflow.model")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("ids.job.workflow.model."));
            setIdsJobWorkflowModel( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getProcessLabel() const
{
    return m_Process_label;
}


void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setProcessLabel(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Process_label = value;
    m_Process_labelIsSet = true;
}
bool ComDayCqDamInddProcessINDDMediaExtractProcessProperties::processLabelIsSet() const
{
    return m_Process_labelIsSet;
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::unsetProcess_label()
{
    m_Process_labelIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getCqDamInddPagesRegex() const
{
    return m_Cq_dam_indd_pages_regex;
}


void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setCqDamInddPagesRegex(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cq_dam_indd_pages_regex = value;
    m_Cq_dam_indd_pages_regexIsSet = true;
}
bool ComDayCqDamInddProcessINDDMediaExtractProcessProperties::cqDamInddPagesRegexIsSet() const
{
    return m_Cq_dam_indd_pages_regexIsSet;
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::unsetCq_dam_indd_pages_regex()
{
    m_Cq_dam_indd_pages_regexIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getIdsJobDecoupled() const
{
    return m_Ids_job_decoupled;
}


void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setIdsJobDecoupled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Ids_job_decoupled = value;
    m_Ids_job_decoupledIsSet = true;
}
bool ComDayCqDamInddProcessINDDMediaExtractProcessProperties::idsJobDecoupledIsSet() const
{
    return m_Ids_job_decoupledIsSet;
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::unsetIds_job_decoupled()
{
    m_Ids_job_decoupledIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getIdsJobWorkflowModel() const
{
    return m_Ids_job_workflow_model;
}


void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setIdsJobWorkflowModel(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Ids_job_workflow_model = value;
    m_Ids_job_workflow_modelIsSet = true;
}
bool ComDayCqDamInddProcessINDDMediaExtractProcessProperties::idsJobWorkflowModelIsSet() const
{
    return m_Ids_job_workflow_modelIsSet;
}

void ComDayCqDamInddProcessINDDMediaExtractProcessProperties::unsetIds_job_workflow_model()
{
    m_Ids_job_workflow_modelIsSet = false;
}

}
}
}
}
