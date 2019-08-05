using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
    /// </summary>
    public sealed class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties:  IEquatable<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties>
    { 
        /// <summary>
        /// MailerEmailEmbed
        /// </summary>
        public ConfigNodePropertyBoolean MailerEmailEmbed { get; private set; }

        /// <summary>
        /// MailerEmailCharset
        /// </summary>
        public ConfigNodePropertyString MailerEmailCharset { get; private set; }

        /// <summary>
        /// MailerEmailRetrieverUserID
        /// </summary>
        public ConfigNodePropertyString MailerEmailRetrieverUserID { get; private set; }

        /// <summary>
        /// MailerEmailRetrieverUserPWD
        /// </summary>
        public ConfigNodePropertyString MailerEmailRetrieverUserPWD { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties()
        {
        }

        private ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(ConfigNodePropertyBoolean MailerEmailEmbed, ConfigNodePropertyString MailerEmailCharset, ConfigNodePropertyString MailerEmailRetrieverUserID, ConfigNodePropertyString MailerEmailRetrieverUserPWD)
        {
            
            this.MailerEmailEmbed = MailerEmailEmbed;
            
            this.MailerEmailCharset = MailerEmailCharset;
            
            this.MailerEmailRetrieverUserID = MailerEmailRetrieverUserID;
            
            this.MailerEmailRetrieverUserPWD = MailerEmailRetrieverUserPWD;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder</returns>
        public static ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder</returns>
        public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder With()
        {
            return Builder()
                .MailerEmailEmbed(MailerEmailEmbed)
                .MailerEmailCharset(MailerEmailCharset)
                .MailerEmailRetrieverUserID(MailerEmailRetrieverUserID)
                .MailerEmailRetrieverUserPWD(MailerEmailRetrieverUserPWD);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties left, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties left, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
        /// </summary>
        public sealed class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _MailerEmailEmbed;
            private ConfigNodePropertyString _MailerEmailCharset;
            private ConfigNodePropertyString _MailerEmailRetrieverUserID;
            private ConfigNodePropertyString _MailerEmailRetrieverUserPWD;

            internal ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.MailerEmailEmbed property.
            /// </summary>
            /// <param name="value">MailerEmailEmbed</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder MailerEmailEmbed(ConfigNodePropertyBoolean value)
            {
                _MailerEmailEmbed = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.MailerEmailCharset property.
            /// </summary>
            /// <param name="value">MailerEmailCharset</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder MailerEmailCharset(ConfigNodePropertyString value)
            {
                _MailerEmailCharset = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.MailerEmailRetrieverUserID property.
            /// </summary>
            /// <param name="value">MailerEmailRetrieverUserID</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder MailerEmailRetrieverUserID(ConfigNodePropertyString value)
            {
                _MailerEmailRetrieverUserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.MailerEmailRetrieverUserPWD property.
            /// </summary>
            /// <param name="value">MailerEmailRetrieverUserPWD</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder MailerEmailRetrieverUserPWD(ConfigNodePropertyString value)
            {
                _MailerEmailRetrieverUserPWD = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties</returns>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties Build()
            {
                Validate();
                return new ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(
                    MailerEmailEmbed: _MailerEmailEmbed,
                    MailerEmailCharset: _MailerEmailCharset,
                    MailerEmailRetrieverUserID: _MailerEmailRetrieverUserID,
                    MailerEmailRetrieverUserPWD: _MailerEmailRetrieverUserPWD
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}