using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerImplCqMailingServiceProperties
    /// </summary>
    public sealed class ComDayCqMailerImplCqMailingServiceProperties:  IEquatable<ComDayCqMailerImplCqMailingServiceProperties>
    { 
        /// <summary>
        /// MaxRecipientCount
        /// </summary>
        public ConfigNodePropertyString MaxRecipientCount { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerImplCqMailingServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerImplCqMailingServiceProperties()
        {
        }

        private ComDayCqMailerImplCqMailingServiceProperties(ConfigNodePropertyString MaxRecipientCount)
        {
            
            this.MaxRecipientCount = MaxRecipientCount;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerImplCqMailingServiceProperties.
        /// </summary>
        /// <returns>ComDayCqMailerImplCqMailingServicePropertiesBuilder</returns>
        public static ComDayCqMailerImplCqMailingServicePropertiesBuilder Builder()
        {
            return new ComDayCqMailerImplCqMailingServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerImplCqMailingServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerImplCqMailingServicePropertiesBuilder</returns>
        public ComDayCqMailerImplCqMailingServicePropertiesBuilder With()
        {
            return Builder()
                .MaxRecipientCount(MaxRecipientCount);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMailerImplCqMailingServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerImplCqMailingServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplCqMailingServiceProperties</param>
        /// <param name="right">Compared (ComDayCqMailerImplCqMailingServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerImplCqMailingServiceProperties left, ComDayCqMailerImplCqMailingServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerImplCqMailingServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplCqMailingServiceProperties</param>
        /// <param name="right">Compared (ComDayCqMailerImplCqMailingServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerImplCqMailingServiceProperties left, ComDayCqMailerImplCqMailingServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerImplCqMailingServiceProperties.
        /// </summary>
        public sealed class ComDayCqMailerImplCqMailingServicePropertiesBuilder
        {
            private ConfigNodePropertyString _MaxRecipientCount;

            internal ComDayCqMailerImplCqMailingServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplCqMailingServiceProperties.MaxRecipientCount property.
            /// </summary>
            /// <param name="value">MaxRecipientCount</param>
            public ComDayCqMailerImplCqMailingServicePropertiesBuilder MaxRecipientCount(ConfigNodePropertyString value)
            {
                _MaxRecipientCount = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerImplCqMailingServiceProperties.
            /// </summary>
            /// <returns>ComDayCqMailerImplCqMailingServiceProperties</returns>
            public ComDayCqMailerImplCqMailingServiceProperties Build()
            {
                Validate();
                return new ComDayCqMailerImplCqMailingServiceProperties(
                    MaxRecipientCount: _MaxRecipientCount
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}