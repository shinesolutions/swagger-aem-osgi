using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAuthImplLoginSelectorHandlerProperties
    /// </summary>
    public sealed class ComDayCqAuthImplLoginSelectorHandlerProperties:  IEquatable<ComDayCqAuthImplLoginSelectorHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// AuthLoginselectorMappings
        /// </summary>
        public ConfigNodePropertyArray AuthLoginselectorMappings { get; private set; }

        /// <summary>
        /// AuthLoginselectorChangepwMappings
        /// </summary>
        public ConfigNodePropertyArray AuthLoginselectorChangepwMappings { get; private set; }

        /// <summary>
        /// AuthLoginselectorDefaultloginpage
        /// </summary>
        public ConfigNodePropertyString AuthLoginselectorDefaultloginpage { get; private set; }

        /// <summary>
        /// AuthLoginselectorDefaultchangepwpage
        /// </summary>
        public ConfigNodePropertyString AuthLoginselectorDefaultchangepwpage { get; private set; }

        /// <summary>
        /// AuthLoginselectorHandle
        /// </summary>
        public ConfigNodePropertyArray AuthLoginselectorHandle { get; private set; }

        /// <summary>
        /// AuthLoginselectorHandleAllExtensions
        /// </summary>
        public ConfigNodePropertyBoolean AuthLoginselectorHandleAllExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAuthImplLoginSelectorHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAuthImplLoginSelectorHandlerProperties()
        {
        }

        private ComDayCqAuthImplLoginSelectorHandlerProperties(ConfigNodePropertyString Path, ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyArray AuthLoginselectorMappings, ConfigNodePropertyArray AuthLoginselectorChangepwMappings, ConfigNodePropertyString AuthLoginselectorDefaultloginpage, ConfigNodePropertyString AuthLoginselectorDefaultchangepwpage, ConfigNodePropertyArray AuthLoginselectorHandle, ConfigNodePropertyBoolean AuthLoginselectorHandleAllExtensions)
        {
            
            this.Path = Path;
            
            this.ServiceRanking = ServiceRanking;
            
            this.AuthLoginselectorMappings = AuthLoginselectorMappings;
            
            this.AuthLoginselectorChangepwMappings = AuthLoginselectorChangepwMappings;
            
            this.AuthLoginselectorDefaultloginpage = AuthLoginselectorDefaultloginpage;
            
            this.AuthLoginselectorDefaultchangepwpage = AuthLoginselectorDefaultchangepwpage;
            
            this.AuthLoginselectorHandle = AuthLoginselectorHandle;
            
            this.AuthLoginselectorHandleAllExtensions = AuthLoginselectorHandleAllExtensions;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAuthImplLoginSelectorHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder</returns>
        public static ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder</returns>
        public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .ServiceRanking(ServiceRanking)
                .AuthLoginselectorMappings(AuthLoginselectorMappings)
                .AuthLoginselectorChangepwMappings(AuthLoginselectorChangepwMappings)
                .AuthLoginselectorDefaultloginpage(AuthLoginselectorDefaultloginpage)
                .AuthLoginselectorDefaultchangepwpage(AuthLoginselectorDefaultchangepwpage)
                .AuthLoginselectorHandle(AuthLoginselectorHandle)
                .AuthLoginselectorHandleAllExtensions(AuthLoginselectorHandleAllExtensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAuthImplLoginSelectorHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAuthImplLoginSelectorHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplLoginSelectorHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqAuthImplLoginSelectorHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAuthImplLoginSelectorHandlerProperties left, ComDayCqAuthImplLoginSelectorHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAuthImplLoginSelectorHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplLoginSelectorHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqAuthImplLoginSelectorHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAuthImplLoginSelectorHandlerProperties left, ComDayCqAuthImplLoginSelectorHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAuthImplLoginSelectorHandlerProperties.
        /// </summary>
        public sealed class ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyArray _AuthLoginselectorMappings;
            private ConfigNodePropertyArray _AuthLoginselectorChangepwMappings;
            private ConfigNodePropertyString _AuthLoginselectorDefaultloginpage;
            private ConfigNodePropertyString _AuthLoginselectorDefaultchangepwpage;
            private ConfigNodePropertyArray _AuthLoginselectorHandle;
            private ConfigNodePropertyBoolean _AuthLoginselectorHandleAllExtensions;

            internal ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.AuthLoginselectorMappings property.
            /// </summary>
            /// <param name="value">AuthLoginselectorMappings</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder AuthLoginselectorMappings(ConfigNodePropertyArray value)
            {
                _AuthLoginselectorMappings = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.AuthLoginselectorChangepwMappings property.
            /// </summary>
            /// <param name="value">AuthLoginselectorChangepwMappings</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder AuthLoginselectorChangepwMappings(ConfigNodePropertyArray value)
            {
                _AuthLoginselectorChangepwMappings = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.AuthLoginselectorDefaultloginpage property.
            /// </summary>
            /// <param name="value">AuthLoginselectorDefaultloginpage</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder AuthLoginselectorDefaultloginpage(ConfigNodePropertyString value)
            {
                _AuthLoginselectorDefaultloginpage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.AuthLoginselectorDefaultchangepwpage property.
            /// </summary>
            /// <param name="value">AuthLoginselectorDefaultchangepwpage</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder AuthLoginselectorDefaultchangepwpage(ConfigNodePropertyString value)
            {
                _AuthLoginselectorDefaultchangepwpage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.AuthLoginselectorHandle property.
            /// </summary>
            /// <param name="value">AuthLoginselectorHandle</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder AuthLoginselectorHandle(ConfigNodePropertyArray value)
            {
                _AuthLoginselectorHandle = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerProperties.AuthLoginselectorHandleAllExtensions property.
            /// </summary>
            /// <param name="value">AuthLoginselectorHandleAllExtensions</param>
            public ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder AuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean value)
            {
                _AuthLoginselectorHandleAllExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAuthImplLoginSelectorHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqAuthImplLoginSelectorHandlerProperties</returns>
            public ComDayCqAuthImplLoginSelectorHandlerProperties Build()
            {
                Validate();
                return new ComDayCqAuthImplLoginSelectorHandlerProperties(
                    Path: _Path,
                    ServiceRanking: _ServiceRanking,
                    AuthLoginselectorMappings: _AuthLoginselectorMappings,
                    AuthLoginselectorChangepwMappings: _AuthLoginselectorChangepwMappings,
                    AuthLoginselectorDefaultloginpage: _AuthLoginselectorDefaultloginpage,
                    AuthLoginselectorDefaultchangepwpage: _AuthLoginselectorDefaultchangepwpage,
                    AuthLoginselectorHandle: _AuthLoginselectorHandle,
                    AuthLoginselectorHandleAllExtensions: _AuthLoginselectorHandleAllExtensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}