using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
    /// </summary>
    public sealed class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties:  IEquatable<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties>
    { 
        /// <summary>
        /// FormsManagerConfigIncludeOOTBTemplates
        /// </summary>
        public ConfigNodePropertyBoolean FormsManagerConfigIncludeOOTBTemplates { get; private set; }

        /// <summary>
        /// FormsManagerConfigIncludeDeprecatedTemplates
        /// </summary>
        public ConfigNodePropertyBoolean FormsManagerConfigIncludeDeprecatedTemplates { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties()
        {
        }

        private ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(ConfigNodePropertyBoolean FormsManagerConfigIncludeOOTBTemplates, ConfigNodePropertyBoolean FormsManagerConfigIncludeDeprecatedTemplates)
        {
            
            this.FormsManagerConfigIncludeOOTBTemplates = FormsManagerConfigIncludeOOTBTemplates;
            
            this.FormsManagerConfigIncludeDeprecatedTemplates = FormsManagerConfigIncludeDeprecatedTemplates;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.
        /// </summary>
        /// <returns>ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder</returns>
        public static ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder Builder()
        {
            return new ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder</returns>
        public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder With()
        {
            return Builder()
                .FormsManagerConfigIncludeOOTBTemplates(FormsManagerConfigIncludeOOTBTemplates)
                .FormsManagerConfigIncludeDeprecatedTemplates(FormsManagerConfigIncludeDeprecatedTemplates);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties</param>
        /// <param name="right">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties left, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties</param>
        /// <param name="right">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties left, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.
        /// </summary>
        public sealed class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _FormsManagerConfigIncludeOOTBTemplates;
            private ConfigNodePropertyBoolean _FormsManagerConfigIncludeDeprecatedTemplates;

            internal ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.FormsManagerConfigIncludeOOTBTemplates property.
            /// </summary>
            /// <param name="value">FormsManagerConfigIncludeOOTBTemplates</param>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder FormsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean value)
            {
                _FormsManagerConfigIncludeOOTBTemplates = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.FormsManagerConfigIncludeDeprecatedTemplates property.
            /// </summary>
            /// <param name="value">FormsManagerConfigIncludeDeprecatedTemplates</param>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder FormsManagerConfigIncludeDeprecatedTemplates(ConfigNodePropertyBoolean value)
            {
                _FormsManagerConfigIncludeDeprecatedTemplates = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.
            /// </summary>
            /// <returns>ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties</returns>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties Build()
            {
                Validate();
                return new ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(
                    FormsManagerConfigIncludeOOTBTemplates: _FormsManagerConfigIncludeOOTBTemplates,
                    FormsManagerConfigIncludeDeprecatedTemplates: _FormsManagerConfigIncludeDeprecatedTemplates
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}