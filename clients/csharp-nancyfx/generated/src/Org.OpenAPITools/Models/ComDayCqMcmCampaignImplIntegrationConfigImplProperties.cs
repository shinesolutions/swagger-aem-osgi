using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmCampaignImplIntegrationConfigImplProperties
    /// </summary>
    public sealed class ComDayCqMcmCampaignImplIntegrationConfigImplProperties:  IEquatable<ComDayCqMcmCampaignImplIntegrationConfigImplProperties>
    { 
        /// <summary>
        /// AemMcmCampaignFormConstraints
        /// </summary>
        public ConfigNodePropertyArray AemMcmCampaignFormConstraints { get; private set; }

        /// <summary>
        /// AemMcmCampaignPublicUrl
        /// </summary>
        public ConfigNodePropertyString AemMcmCampaignPublicUrl { get; private set; }

        /// <summary>
        /// AemMcmCampaignRelaxedSSL
        /// </summary>
        public ConfigNodePropertyBoolean AemMcmCampaignRelaxedSSL { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmCampaignImplIntegrationConfigImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmCampaignImplIntegrationConfigImplProperties()
        {
        }

        private ComDayCqMcmCampaignImplIntegrationConfigImplProperties(ConfigNodePropertyArray AemMcmCampaignFormConstraints, ConfigNodePropertyString AemMcmCampaignPublicUrl, ConfigNodePropertyBoolean AemMcmCampaignRelaxedSSL)
        {
            
            this.AemMcmCampaignFormConstraints = AemMcmCampaignFormConstraints;
            
            this.AemMcmCampaignPublicUrl = AemMcmCampaignPublicUrl;
            
            this.AemMcmCampaignRelaxedSSL = AemMcmCampaignRelaxedSSL;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmCampaignImplIntegrationConfigImplProperties.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder</returns>
        public static ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder Builder()
        {
            return new ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder</returns>
        public ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder With()
        {
            return Builder()
                .AemMcmCampaignFormConstraints(AemMcmCampaignFormConstraints)
                .AemMcmCampaignPublicUrl(AemMcmCampaignPublicUrl)
                .AemMcmCampaignRelaxedSSL(AemMcmCampaignRelaxedSSL);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMcmCampaignImplIntegrationConfigImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmCampaignImplIntegrationConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplProperties</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmCampaignImplIntegrationConfigImplProperties left, ComDayCqMcmCampaignImplIntegrationConfigImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmCampaignImplIntegrationConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplProperties</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImplIntegrationConfigImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmCampaignImplIntegrationConfigImplProperties left, ComDayCqMcmCampaignImplIntegrationConfigImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmCampaignImplIntegrationConfigImplProperties.
        /// </summary>
        public sealed class ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _AemMcmCampaignFormConstraints;
            private ConfigNodePropertyString _AemMcmCampaignPublicUrl;
            private ConfigNodePropertyBoolean _AemMcmCampaignRelaxedSSL;

            internal ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplProperties.AemMcmCampaignFormConstraints property.
            /// </summary>
            /// <param name="value">AemMcmCampaignFormConstraints</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder AemMcmCampaignFormConstraints(ConfigNodePropertyArray value)
            {
                _AemMcmCampaignFormConstraints = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplProperties.AemMcmCampaignPublicUrl property.
            /// </summary>
            /// <param name="value">AemMcmCampaignPublicUrl</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder AemMcmCampaignPublicUrl(ConfigNodePropertyString value)
            {
                _AemMcmCampaignPublicUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImplIntegrationConfigImplProperties.AemMcmCampaignRelaxedSSL property.
            /// </summary>
            /// <param name="value">AemMcmCampaignRelaxedSSL</param>
            public ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder AemMcmCampaignRelaxedSSL(ConfigNodePropertyBoolean value)
            {
                _AemMcmCampaignRelaxedSSL = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmCampaignImplIntegrationConfigImplProperties.
            /// </summary>
            /// <returns>ComDayCqMcmCampaignImplIntegrationConfigImplProperties</returns>
            public ComDayCqMcmCampaignImplIntegrationConfigImplProperties Build()
            {
                Validate();
                return new ComDayCqMcmCampaignImplIntegrationConfigImplProperties(
                    AemMcmCampaignFormConstraints: _AemMcmCampaignFormConstraints,
                    AemMcmCampaignPublicUrl: _AemMcmCampaignPublicUrl,
                    AemMcmCampaignRelaxedSSL: _AemMcmCampaignRelaxedSSL
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}