using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties:  IEquatable<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties>
    { 
        /// <summary>
        /// SlingPostOperation
        /// </summary>
        public ConfigNodePropertyString SlingPostOperation { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyString SlingServletMethods { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties()
        {
        }

        private ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(ConfigNodePropertyString SlingPostOperation, ConfigNodePropertyString SlingServletMethods)
        {
            
            this.SlingPostOperation = SlingPostOperation;
            
            this.SlingServletMethods = SlingServletMethods;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder With()
        {
            return Builder()
                .SlingPostOperation(SlingPostOperation)
                .SlingServletMethods(SlingServletMethods);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties left, ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties left, ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingPostOperation;
            private ConfigNodePropertyString _SlingServletMethods;

            internal ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.SlingPostOperation property.
            /// </summary>
            /// <param name="value">SlingPostOperation</param>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder SlingPostOperation(ConfigNodePropertyString value)
            {
                _SlingPostOperation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesBuilder SlingServletMethods(ConfigNodePropertyString value)
            {
                _SlingServletMethods = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties</returns>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(
                    SlingPostOperation: _SlingPostOperation,
                    SlingServletMethods: _SlingServletMethods
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}