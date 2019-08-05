using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties
    /// </summary>
    public sealed class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties:  IEquatable<ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties>
    { 
        /// <summary>
        /// Forcelocation
        /// </summary>
        public ConfigNodePropertyBoolean Forcelocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties()
        {
        }

        private ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(ConfigNodePropertyBoolean Forcelocation)
        {
            
            this.Forcelocation = Forcelocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.
        /// </summary>
        /// <returns>ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder</returns>
        public static ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder Builder()
        {
            return new ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder</returns>
        public ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder With()
        {
            return Builder()
                .Forcelocation(Forcelocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties</param>
        /// <param name="right">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties left, ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties</param>
        /// <param name="right">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties left, ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.
        /// </summary>
        public sealed class ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Forcelocation;

            internal ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.Forcelocation property.
            /// </summary>
            /// <param name="value">Forcelocation</param>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder Forcelocation(ConfigNodePropertyBoolean value)
            {
                _Forcelocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.
            /// </summary>
            /// <returns>ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties</returns>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties Build()
            {
                Validate();
                return new ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(
                    Forcelocation: _Forcelocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}