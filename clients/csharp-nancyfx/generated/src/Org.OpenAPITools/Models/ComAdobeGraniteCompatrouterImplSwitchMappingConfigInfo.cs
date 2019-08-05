using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo
    /// </summary>
    public sealed class ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo:  IEquatable<ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo()
        {
        }

        private ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo(string Pid, string Title, string Description, ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder</returns>
        public static ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder Builder()
        {
            return new ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder</returns>
        public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo left, ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo left, ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties _Properties;

            internal ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfoBuilder Properties(ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo</returns>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}