using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
    /// </summary>
    public sealed class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties:  IEquatable<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties>
    { 
        /// <summary>
        /// Enable
        /// </summary>
        public ConfigNodePropertyBoolean Enable { get; private set; }

        /// <summary>
        /// Ttl1
        /// </summary>
        public ConfigNodePropertyInteger Ttl1 { get; private set; }

        /// <summary>
        /// Ttl2
        /// </summary>
        public ConfigNodePropertyInteger Ttl2 { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties()
        {
        }

        private ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(ConfigNodePropertyBoolean Enable, ConfigNodePropertyInteger Ttl1, ConfigNodePropertyInteger Ttl2)
        {
            
            this.Enable = Enable;
            
            this.Ttl1 = Ttl1;
            
            this.Ttl2 = Ttl2;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder</returns>
        public static ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder</returns>
        public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder With()
        {
            return Builder()
                .Enable(Enable)
                .Ttl1(Ttl1)
                .Ttl2(Ttl2);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties left, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties left, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enable;
            private ConfigNodePropertyInteger _Ttl1;
            private ConfigNodePropertyInteger _Ttl2;

            internal ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.Enable property.
            /// </summary>
            /// <param name="value">Enable</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder Enable(ConfigNodePropertyBoolean value)
            {
                _Enable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.Ttl1 property.
            /// </summary>
            /// <param name="value">Ttl1</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder Ttl1(ConfigNodePropertyInteger value)
            {
                _Ttl1 = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.Ttl2 property.
            /// </summary>
            /// <param name="value">Ttl2</param>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder Ttl2(ConfigNodePropertyInteger value)
            {
                _Ttl2 = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties</returns>
            public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(
                    Enable: _Enable,
                    Ttl1: _Ttl1,
                    Ttl2: _Ttl2
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}