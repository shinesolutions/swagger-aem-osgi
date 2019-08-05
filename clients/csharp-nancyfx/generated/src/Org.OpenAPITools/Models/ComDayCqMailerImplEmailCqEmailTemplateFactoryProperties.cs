using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties
    /// </summary>
    public sealed class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties:  IEquatable<ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties>
    { 
        /// <summary>
        /// MailerEmailCharset
        /// </summary>
        public ConfigNodePropertyString MailerEmailCharset { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
        {
        }

        private ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(ConfigNodePropertyString MailerEmailCharset)
        {
            
            this.MailerEmailCharset = MailerEmailCharset;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder</returns>
        public static ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder</returns>
        public ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder With()
        {
            return Builder()
                .MailerEmailCharset(MailerEmailCharset);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties left, ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties left, ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.
        /// </summary>
        public sealed class ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _MailerEmailCharset;

            internal ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.MailerEmailCharset property.
            /// </summary>
            /// <param name="value">MailerEmailCharset</param>
            public ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder MailerEmailCharset(ConfigNodePropertyString value)
            {
                _MailerEmailCharset = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties</returns>
            public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties Build()
            {
                Validate();
                return new ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(
                    MailerEmailCharset: _MailerEmailCharset
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}