using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamInddProcessINDDMediaExtractProcessProperties
    /// </summary>
    public sealed class ComDayCqDamInddProcessINDDMediaExtractProcessProperties:  IEquatable<ComDayCqDamInddProcessINDDMediaExtractProcessProperties>
    { 
        /// <summary>
        /// ProcessLabel
        /// </summary>
        public ConfigNodePropertyString ProcessLabel { get; private set; }

        /// <summary>
        /// CqDamInddPagesRegex
        /// </summary>
        public ConfigNodePropertyString CqDamInddPagesRegex { get; private set; }

        /// <summary>
        /// IdsJobDecoupled
        /// </summary>
        public ConfigNodePropertyBoolean IdsJobDecoupled { get; private set; }

        /// <summary>
        /// IdsJobWorkflowModel
        /// </summary>
        public ConfigNodePropertyString IdsJobWorkflowModel { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamInddProcessINDDMediaExtractProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
        {
        }

        private ComDayCqDamInddProcessINDDMediaExtractProcessProperties(ConfigNodePropertyString ProcessLabel, ConfigNodePropertyString CqDamInddPagesRegex, ConfigNodePropertyBoolean IdsJobDecoupled, ConfigNodePropertyString IdsJobWorkflowModel)
        {
            
            this.ProcessLabel = ProcessLabel;
            
            this.CqDamInddPagesRegex = CqDamInddPagesRegex;
            
            this.IdsJobDecoupled = IdsJobDecoupled;
            
            this.IdsJobWorkflowModel = IdsJobWorkflowModel;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamInddProcessINDDMediaExtractProcessProperties.
        /// </summary>
        /// <returns>ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder</returns>
        public static ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder Builder()
        {
            return new ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder</returns>
        public ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder With()
        {
            return Builder()
                .ProcessLabel(ProcessLabel)
                .CqDamInddPagesRegex(CqDamInddPagesRegex)
                .IdsJobDecoupled(IdsJobDecoupled)
                .IdsJobWorkflowModel(IdsJobWorkflowModel);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamInddProcessINDDMediaExtractProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamInddProcessINDDMediaExtractProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamInddProcessINDDMediaExtractProcessProperties left, ComDayCqDamInddProcessINDDMediaExtractProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamInddProcessINDDMediaExtractProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamInddProcessINDDMediaExtractProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamInddProcessINDDMediaExtractProcessProperties left, ComDayCqDamInddProcessINDDMediaExtractProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamInddProcessINDDMediaExtractProcessProperties.
        /// </summary>
        public sealed class ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyString _CqDamInddPagesRegex;
            private ConfigNodePropertyBoolean _IdsJobDecoupled;
            private ConfigNodePropertyString _IdsJobWorkflowModel;

            internal ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessProperties.CqDamInddPagesRegex property.
            /// </summary>
            /// <param name="value">CqDamInddPagesRegex</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder CqDamInddPagesRegex(ConfigNodePropertyString value)
            {
                _CqDamInddPagesRegex = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessProperties.IdsJobDecoupled property.
            /// </summary>
            /// <param name="value">IdsJobDecoupled</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder IdsJobDecoupled(ConfigNodePropertyBoolean value)
            {
                _IdsJobDecoupled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddProcessINDDMediaExtractProcessProperties.IdsJobWorkflowModel property.
            /// </summary>
            /// <param name="value">IdsJobWorkflowModel</param>
            public ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder IdsJobWorkflowModel(ConfigNodePropertyString value)
            {
                _IdsJobWorkflowModel = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamInddProcessINDDMediaExtractProcessProperties.
            /// </summary>
            /// <returns>ComDayCqDamInddProcessINDDMediaExtractProcessProperties</returns>
            public ComDayCqDamInddProcessINDDMediaExtractProcessProperties Build()
            {
                Validate();
                return new ComDayCqDamInddProcessINDDMediaExtractProcessProperties(
                    ProcessLabel: _ProcessLabel,
                    CqDamInddPagesRegex: _CqDamInddPagesRegex,
                    IdsJobDecoupled: _IdsJobDecoupled,
                    IdsJobWorkflowModel: _IdsJobWorkflowModel
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}