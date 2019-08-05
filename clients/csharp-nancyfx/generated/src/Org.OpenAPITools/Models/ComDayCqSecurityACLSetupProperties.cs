using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSecurityACLSetupProperties
    /// </summary>
    public sealed class ComDayCqSecurityACLSetupProperties:  IEquatable<ComDayCqSecurityACLSetupProperties>
    { 
        /// <summary>
        /// CqAclsetupRules
        /// </summary>
        public ConfigNodePropertyArray CqAclsetupRules { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqSecurityACLSetupProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSecurityACLSetupProperties()
        {
        }

        private ComDayCqSecurityACLSetupProperties(ConfigNodePropertyArray CqAclsetupRules)
        {
            
            this.CqAclsetupRules = CqAclsetupRules;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSecurityACLSetupProperties.
        /// </summary>
        /// <returns>ComDayCqSecurityACLSetupPropertiesBuilder</returns>
        public static ComDayCqSecurityACLSetupPropertiesBuilder Builder()
        {
            return new ComDayCqSecurityACLSetupPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSecurityACLSetupPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSecurityACLSetupPropertiesBuilder</returns>
        public ComDayCqSecurityACLSetupPropertiesBuilder With()
        {
            return Builder()
                .CqAclsetupRules(CqAclsetupRules);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqSecurityACLSetupProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSecurityACLSetupProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSecurityACLSetupProperties</param>
        /// <param name="right">Compared (ComDayCqSecurityACLSetupProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSecurityACLSetupProperties left, ComDayCqSecurityACLSetupProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSecurityACLSetupProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSecurityACLSetupProperties</param>
        /// <param name="right">Compared (ComDayCqSecurityACLSetupProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSecurityACLSetupProperties left, ComDayCqSecurityACLSetupProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSecurityACLSetupProperties.
        /// </summary>
        public sealed class ComDayCqSecurityACLSetupPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqAclsetupRules;

            internal ComDayCqSecurityACLSetupPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupProperties.CqAclsetupRules property.
            /// </summary>
            /// <param name="value">CqAclsetupRules</param>
            public ComDayCqSecurityACLSetupPropertiesBuilder CqAclsetupRules(ConfigNodePropertyArray value)
            {
                _CqAclsetupRules = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSecurityACLSetupProperties.
            /// </summary>
            /// <returns>ComDayCqSecurityACLSetupProperties</returns>
            public ComDayCqSecurityACLSetupProperties Build()
            {
                Validate();
                return new ComDayCqSecurityACLSetupProperties(
                    CqAclsetupRules: _CqAclsetupRules
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}