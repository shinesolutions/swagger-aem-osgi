using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplConfFeatureConfigImplProperties
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties:  IEquatable<ComAdobeCqDamCfmImplConfFeatureConfigImplProperties>
    { 
        /// <summary>
        /// DamCfmResourceTypes
        /// </summary>
        public ConfigNodePropertyArray DamCfmResourceTypes { get; private set; }

        /// <summary>
        /// DamCfmReferenceProperties
        /// </summary>
        public ConfigNodePropertyArray DamCfmReferenceProperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties()
        {
        }

        private ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(ConfigNodePropertyArray DamCfmResourceTypes, ConfigNodePropertyArray DamCfmReferenceProperties)
        {
            
            this.DamCfmResourceTypes = DamCfmResourceTypes;
            
            this.DamCfmReferenceProperties = DamCfmReferenceProperties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder</returns>
        public static ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder</returns>
        public ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder With()
        {
            return Builder()
                .DamCfmResourceTypes(DamCfmResourceTypes)
                .DamCfmReferenceProperties(DamCfmReferenceProperties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamCfmImplConfFeatureConfigImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties left, ComAdobeCqDamCfmImplConfFeatureConfigImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties left, ComAdobeCqDamCfmImplConfFeatureConfigImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _DamCfmResourceTypes;
            private ConfigNodePropertyArray _DamCfmReferenceProperties;

            internal ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.DamCfmResourceTypes property.
            /// </summary>
            /// <param name="value">DamCfmResourceTypes</param>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder DamCfmResourceTypes(ConfigNodePropertyArray value)
            {
                _DamCfmResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.DamCfmReferenceProperties property.
            /// </summary>
            /// <param name="value">DamCfmReferenceProperties</param>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesBuilder DamCfmReferenceProperties(ConfigNodePropertyArray value)
            {
                _DamCfmReferenceProperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplConfFeatureConfigImplProperties</returns>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(
                    DamCfmResourceTypes: _DamCfmResourceTypes,
                    DamCfmReferenceProperties: _DamCfmReferenceProperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}