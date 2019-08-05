using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties:  IEquatable<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties>
    { 
        /// <summary>
        /// IllegalCharMapping
        /// </summary>
        public ConfigNodePropertyString IllegalCharMapping { get; private set; }

        /// <summary>
        /// PageSubTreeActivationCheck
        /// </summary>
        public ConfigNodePropertyBoolean PageSubTreeActivationCheck { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties()
        {
        }

        private ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(ConfigNodePropertyString IllegalCharMapping, ConfigNodePropertyBoolean PageSubTreeActivationCheck)
        {
            
            this.IllegalCharMapping = IllegalCharMapping;
            
            this.PageSubTreeActivationCheck = PageSubTreeActivationCheck;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder With()
        {
            return Builder()
                .IllegalCharMapping(IllegalCharMapping)
                .PageSubTreeActivationCheck(PageSubTreeActivationCheck);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties left, ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties left, ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder
        {
            private ConfigNodePropertyString _IllegalCharMapping;
            private ConfigNodePropertyBoolean _PageSubTreeActivationCheck;

            internal ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.IllegalCharMapping property.
            /// </summary>
            /// <param name="value">IllegalCharMapping</param>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder IllegalCharMapping(ConfigNodePropertyString value)
            {
                _IllegalCharMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.PageSubTreeActivationCheck property.
            /// </summary>
            /// <param name="value">PageSubTreeActivationCheck</param>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder PageSubTreeActivationCheck(ConfigNodePropertyBoolean value)
            {
                _PageSubTreeActivationCheck = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties</returns>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(
                    IllegalCharMapping: _IllegalCharMapping,
                    PageSubTreeActivationCheck: _PageSubTreeActivationCheck
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}