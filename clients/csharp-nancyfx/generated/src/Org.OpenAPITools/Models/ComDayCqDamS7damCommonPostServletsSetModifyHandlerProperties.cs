using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties:  IEquatable<ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties>
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
        /// Use ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties()
        {
        }

        private ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(ConfigNodePropertyString SlingPostOperation, ConfigNodePropertyString SlingServletMethods)
        {
            
            this.SlingPostOperation = SlingPostOperation;
            
            this.SlingServletMethods = SlingServletMethods;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties left, ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties left, ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingPostOperation;
            private ConfigNodePropertyString _SlingServletMethods;

            internal ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.SlingPostOperation property.
            /// </summary>
            /// <param name="value">SlingPostOperation</param>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder SlingPostOperation(ConfigNodePropertyString value)
            {
                _SlingPostOperation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesBuilder SlingServletMethods(ConfigNodePropertyString value)
            {
                _SlingServletMethods = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</returns>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(
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