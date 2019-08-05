using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties:  IEquatable<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties>
    { 
        /// <summary>
        /// Length
        /// </summary>
        public ConfigNodePropertyInteger Length { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(ConfigNodePropertyInteger Length)
        {
            
            this.Length = Length;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder With()
        {
            return Builder()
                .Length(Length);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties left, OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties left, OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder
        {
            private ConfigNodePropertyInteger _Length;

            internal OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.Length property.
            /// </summary>
            /// <param name="value">Length</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder Length(ConfigNodePropertyInteger value)
            {
                _Length = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties</returns>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(
                    Length: _Length
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}